from flask import Flask, request, jsonify
from joblib import load

app = Flask(__name__)

loaded_m = load('output/model.pkl')
loaded_s = load('output/scaler.pkl')
loaded_features = load('output/features.pkl')
loaded_features = list(loaded_features)

@app.route('/predict', methods=['POST'])
def predict(device_json : dict) -> int : 
  """
  Takes in the json/dict of the device and return predcition
  
  Params:  
  device json : dictionairy of the input device features 
  
  Return:
  int : prediction of device price range
  """
  # drop id
  _ = device_json.pop('id')

  # scale 
  scaled_device_input = loaded_s.transform([list(device_json.values())])
  # reconsturct the dict 
  device_json = dict(zip(list(device_json.keys()),scaled_device_input[0]))

  # filter out unwanted features
  device_json = {k:v for k,v in device_json.items() if k in loaded_features}
  # prediction phase
  prediction = loaded_m.predict([list(device_json.values())])

  return int(prediction)
# Device Price Range Classification System
## Project Description:
Build a Devices Price Classification System (AI System) using Python and SpringBoot. 
Mainly the system will include two small projects:
- Python project: will allow you to predict the prices, allowing the sellers to classify the device's prices according to their characteristics
- SpringBoot project: Will contain a simple entity, and a few endpoints, to call the service from the Python project for a bunch of test cases, and store them.


# Price Range Classifier - API Documentation

## End-point: Predict Flask
### Method: POST
>```
>http://127.0.0.1:5000/predict
>```
### Body (**raw**)

```json
{
    "id": 2,
    "battery_power": 1021,
    "blue": 1,
    "clock_speed": 0.5,
    "dual_sim": 1,
    "fc": 0,
    "four_g": 1,
    "int_memory": 53,
    "m_dep": 0.7,
    "mobile_wt": 136,
    "n_cores": 3,
    "pc": 6,
    "px_height": 905,
    "px_width": 1988,
    "ram": 2631,
    "sc_h": 17,
    "sc_w": 3,
    "talk_time": 7,
    "three_g": 1,
    "touch_screen": 1,
    "wifi": 0
}
```

### Response: 200
```json
{
    "Price Range": 2
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Get One Device
### Method: GET
>```
>http://localhost:8080/devices/6
>```
### Response: 404
```json
{
    "timestamp": "2024-11-21T08:41:53.406+00:00",
    "status": 404,
    "error": "Not Found",
    "path": "/devices/6"
}
```

### Response: 200
```json
{
    "id": 1,
    "battery_power": 842,
    "blue": 0,
    "clock_speed": 2.2,
    "dual_sim": 0,
    "fc": 1,
    "four_g": 0,
    "int_memory": 7,
    "m_dep": 0.6,
    "mobile_wt": 188,
    "n_cores": 2,
    "pc": 2,
    "px_height": 20,
    "px_width": 756,
    "ram": 2549,
    "sc_h": 9,
    "sc_w": 7,
    "talk_time": 19,
    "three_g": 0,
    "touch_screen": 0,
    "wifi": 1
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Get All Devices
### Method: GET
>```
>http://localhost:8080/devices/
>```
### Response: 200
```json
[
    {
        "id": 1,
        "battery_power": 842,
        "blue": 0,
        "clock_speed": 2.2,
        "dual_sim": 0,
        "fc": 1,
        "four_g": 0,
        "int_memory": 7,
        "m_dep": 0.6,
        "mobile_wt": 188,
        "n_cores": 2,
        "pc": 2,
        "px_height": 20,
        "px_width": 756,
        "ram": 2549,
        "sc_h": 9,
        "sc_w": 7,
        "talk_time": 19,
        "three_g": 0,
        "touch_screen": 0,
        "wifi": 1
    },
    {
        "id": 2,
        "battery_power": 1021,
        "blue": 1,
        "clock_speed": 0.5,
        "dual_sim": 1,
        "fc": 0,
        "four_g": 1,
        "int_memory": 53,
        "m_dep": 0.7,
        "mobile_wt": 136,
        "n_cores": 3,
        "pc": 6,
        "px_height": 905,
        "px_width": 1988,
        "ram": 2631,
        "sc_h": 17,
        "sc_w": 3,
        "talk_time": 7,
        "three_g": 1,
        "touch_screen": 1,
        "wifi": 0
    },
    {
        "id": 3,
        "battery_power": 1043,
        "blue": 1,
        "clock_speed": 1.8,
        "dual_sim": 1,
        "fc": 14,
        "four_g": 0,
        "int_memory": 5,
        "m_dep": 0.1,
        "mobile_wt": 193,
        "n_cores": 3,
        "pc": 16,
        "px_height": 226,
        "px_width": 1412,
        "ram": 3476,
        "sc_h": 12,
        "sc_w": 7,
        "talk_time": 2,
        "three_g": 0,
        "touch_screen": 1,
        "wifi": 0
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Add Device
### Method: POST
>```
>http://localhost:8080/devices/
>```
### Body (**raw**)

```json
{
  "battery_power": 842,
  "blue": 0,
  "clock_speed": 2.2,
  "dual_sim": 0,
  "fc": 1,
  "four_g": 0,
  "int_memory": 7,
  "m_dep": 0.6,
  "mobile_wt": 188,
  "n_cores": 2,
  "pc": 2,
  "px_height": 20,
  "px_width": 756,
  "ram": 2549,
  "sc_h": 9,
  "sc_w": 7,
  "talk_time": 19,
  "three_g": 0,
  "touch_screen": 0,
  "wifi": 1
}
```

### Response: 200
```json
{
    "id": 100,
    "battery_power": 842,
    "blue": 0,
    "clock_speed": 2.2,
    "dual_sim": 0,
    "fc": 1,
    "four_g": 0,
    "int_memory": 7,
    "m_dep": 0.6,
    "mobile_wt": 188,
    "n_cores": 2,
    "pc": 2,
    "px_height": 20,
    "px_width": 756,
    "ram": 2549,
    "sc_h": 9,
    "sc_w": 7,
    "talk_time": 19,
    "three_g": 0,
    "touch_screen": 0,
    "wifi": 1
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Predict SpringBoot
### Method: POST
>```
>http://localhost:8080/predict/3
>```
### Response: 200
```json
3
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

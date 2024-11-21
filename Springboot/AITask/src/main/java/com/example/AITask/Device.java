package com.example.AITask;



public class Device {
    private Long id;
    private int battery_power;
    private int blue;
    private float clock_speed;
    private int dual_sim;
    private int fc;
    private int four_g;
    private int int_memory;
    private float m_dep;
    private int mobile_wt;
    private int n_cores;
    private int pc;
    private int px_height;
    private int px_width;
    private int ram;
    private int sc_h;
    private int sc_w;
    private int talk_time;
    private int three_g;
    private int touch_screen;
    private int wifi;

    public Device() {
    }
    public Device(Long id, int battery_power, int blue, float clock_speed, int dual_sim, int fc, int four_g, int int_memory, float m_dep, int mobile_wt, int n_cores, int pc, int px_height, int px_width, int ram, int sc_h, int sc_w, int talk_time, int three_g, int touch_screen, int wifi) {
        this.id = id;
        this.battery_power = battery_power;
        this.blue = blue;
        this.clock_speed = clock_speed;
        this.dual_sim = dual_sim;
        this.fc = fc;
        this.four_g = four_g;
        this.int_memory = int_memory;
        this.m_dep = m_dep;
        this.mobile_wt = mobile_wt;
        this.n_cores = n_cores;
        this.pc = pc;
        this.px_height = px_height;
        this.px_width = px_width;
        this.ram = ram;
        this.sc_h = sc_h;
        this.sc_w = sc_w;
        this.talk_time = talk_time;
        this.three_g = three_g;
        this.touch_screen = touch_screen;
        this.wifi = wifi;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getBattery_power() {
        return battery_power;
    }

    public void setBattery_power(int battery_power) {
        this.battery_power = battery_power;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public float getclock_speed() {
        return clock_speed;
    }

    public void setclock_speed(float clock_speed) {
        this.clock_speed = clock_speed;
    }

    public int getdual_sim() {
        return dual_sim;
    }

    public void setdual_sim(int dual_sim) {
        this.dual_sim = dual_sim;
    }

    public int getFc() {
        return fc;
    }

    public void setFc(int fc) {
        this.fc = fc;
    }

    public int getfour_g() {
        return four_g;
    }

    public void setfour_g(int four_g) {
        this.four_g = four_g;
    }

    public int getint_memory() {
        return int_memory;
    }

    public void setint_memory(int int_memory) {
        this.int_memory = int_memory;
    }

    public float getm_dep() {
        return m_dep;
    }

    public void setm_dep(float m_dep) {
        this.m_dep = m_dep;
    }

    public int getmobile_wt() {
        return mobile_wt;
    }

    public void setmobile_wt(int mobile_wt) {
        this.mobile_wt = mobile_wt;
    }

    public int getn_cores() {
        return n_cores;
    }

    public void setn_cores(int n_cores) {
        this.n_cores = n_cores;
    }

    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    public int getPx_height() {
        return px_height;
    }

    public void setPx_height(int px_height) {
        this.px_height = px_height;
    }

    public int getPx_width() {
        return px_width;
    }

    public void setPx_width(int px_width) {
        this.px_width = px_width;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getsc_h() {
        return sc_h;
    }

    public void setsc_h(int sc_h) {
        this.sc_h = sc_h;
    }

    public int getsc_w() {
        return sc_w;
    }

    public void setsc_w(int sc_w) {
        this.sc_w = sc_w;
    }

    public int gettalk_time() {
        return talk_time;
    }

    public void settalk_time(int talk_time) {
        this.talk_time = talk_time;
    }

    public int getthree_g() {
        return three_g;
    }

    public void setthree_g(int three_g) {
        this.three_g = three_g;
    }

    public int gettouch_screen() {
        return touch_screen;
    }

    public void settouch_screen(int touch_screen) {
        this.touch_screen = touch_screen;
    }

    public int getWifi() {
        return wifi;
    }

    public void setWifi(int wifi) {
        this.wifi = wifi;
    }
}
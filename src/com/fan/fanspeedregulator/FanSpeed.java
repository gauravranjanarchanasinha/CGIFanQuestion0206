package com.fan.fanspeedregulator;

public class FanSpeed {

    private FanSpeedRegulator fanSpeedRegulator;

    //default
    public FanSpeed() {
        this.fanSpeedRegulator = new OffSpeedRegulator();
    }

    public FanSpeed(FanSpeedRegulator fanSpeedRegulator) {
        this.fanSpeedRegulator = fanSpeedRegulator;
    }

    public FanSpeedRegulator getFanSpeedRegulator() {
        return fanSpeedRegulator;
    }

    public void setFanSpeedRegulator(FanSpeedRegulator fanSpeedRegulator) {
        this.fanSpeedRegulator = fanSpeedRegulator;
    }
}

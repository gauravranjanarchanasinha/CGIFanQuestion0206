package com.fan.fanspeedregulator;

public class FanSpeed {

    private FSpeed fSpeed;

    //default
    public FanSpeed() {
        this.fSpeed = new OffSpeed();
    }

    public FanSpeed(FSpeed fSpeed) {
        this.fSpeed = fSpeed;
    }

    public FSpeed getfSpeed() {
        return fSpeed;
    }

    public void setfSpeed(FSpeed fSpeed) {
        this.fSpeed = fSpeed;
    }
}

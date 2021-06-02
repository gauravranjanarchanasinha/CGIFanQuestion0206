package com.fan.fansdirectionregulator;

public class FansDirection {

    private FDirection fDirection;

    //default
    public FansDirection() {
        fDirection = new ClockWiseDirection();
    }

    public FansDirection(FDirection fDirection) {
        this.fDirection = fDirection;
    }

    public FDirection getfDirection() {
        return fDirection;
    }

    public void setfDirection(FDirection fDirection) {
        this.fDirection = fDirection;
    }
}

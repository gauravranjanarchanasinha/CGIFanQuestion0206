package com.fan.fansdirectionregulator;

public class FansDirection {

    private FanDirectionRegulator fanDirectionRegulator;

    //default
    public FansDirection() {
        fanDirectionRegulator = new ClockWiseDirectionRegulator();
    }

    public FansDirection(FanDirectionRegulator fanDirectionRegulator) {
        this.fanDirectionRegulator = fanDirectionRegulator;
    }

    public FanDirectionRegulator getFanDirectionRegulator() {
        return fanDirectionRegulator;
    }

    public void setFanDirectionRegulator(FanDirectionRegulator fanDirectionRegulator) {
        this.fanDirectionRegulator = fanDirectionRegulator;
    }
}

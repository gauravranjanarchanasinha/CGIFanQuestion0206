package com.fan;

import com.fan.fansdirectionregulator.FansDirection;
import com.fan.fanspeedregulator.FanSpeed;

public class Fan {

    private final FansDirection fansDirection;
    private final FanSpeed fansSpeed;

    public Fan() {
        fansDirection = new FansDirection();
        fansSpeed = new FanSpeed();
    }

    public Fan(FansDirection fansDirection, FanSpeed fansSpeed) {
        this.fansDirection = fansDirection;
        this.fansSpeed = fansSpeed;
    }

    public FansDirection getFansDirection() {
        return fansDirection;
    }

    public FanSpeed getFansSpeed() {
        return fansSpeed;
    }
}

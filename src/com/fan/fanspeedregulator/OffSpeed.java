package com.fan.fanspeedregulator;

import com.fan.statustype.SpeedType;

public class OffSpeed implements FSpeed {

    private SpeedType speedType;

    public OffSpeed() {
        speedType = SpeedType.OFF;
    }

    public SpeedType getSpeedType() {
        return speedType;
    }

    @Override
    public String getPresentState() {
        return getSpeedType().getFanStateDescription();
    }

    @Override
    public void pull(FanSpeed fanSpeed) {
        fanSpeed.setfSpeed(new SlowSpeed());
        System.out.println(fanSpeed.getfSpeed().getPresentState());
    }
}

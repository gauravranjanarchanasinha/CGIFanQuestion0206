package com.fan.fanspeedregulator;

import com.fan.statustype.SpeedType;

public class MediumSpeed implements FSpeed {

    private SpeedType speedType;

    public MediumSpeed() {
        speedType = SpeedType.MEDIUM;
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
        fanSpeed.setfSpeed(new HighSpeed());
        System.out.println(fanSpeed.getfSpeed().getPresentState());
    }
}

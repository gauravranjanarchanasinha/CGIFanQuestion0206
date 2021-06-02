package com.fan.fanspeedregulator;

import com.fan.statustype.SpeedType;

public class HighSpeed implements FSpeed {

    private SpeedType speedType;

    public HighSpeed() {
        speedType = SpeedType.HIGH;
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
        fanSpeed.setfSpeed(new OffSpeed());
        System.out.println(fanSpeed.getfSpeed().getPresentState());
    }
}

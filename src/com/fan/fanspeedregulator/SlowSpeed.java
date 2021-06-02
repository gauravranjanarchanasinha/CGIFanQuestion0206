package com.fan.fanspeedregulator;

import com.fan.statustype.SpeedType;

public class SlowSpeed implements FSpeed {

    private SpeedType speedType;

    public SlowSpeed() {
        speedType = SpeedType.LOW;
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
        fanSpeed.setfSpeed(new MediumSpeed());
        System.out.println(fanSpeed.getfSpeed().getPresentState());
    }
}

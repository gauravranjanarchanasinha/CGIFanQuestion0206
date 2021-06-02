package com.fan.fanspeedregulator;

import com.fan.statustype.SpeedType;

public class SlowSpeedRegulator implements FanSpeedRegulator {

    private SpeedType speedType;

    public SlowSpeedRegulator() {
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
        fanSpeed.setFanSpeedRegulator(new MediumSpeedRegulator());
        System.out.println(fanSpeed.getFanSpeedRegulator().getPresentState());
    }
}

package com.fan.fanspeedregulator;

import com.fan.statustype.SpeedType;

public class MediumSpeedRegulator implements FanSpeedRegulator {

    private SpeedType speedType;

    public MediumSpeedRegulator() {
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
        fanSpeed.setFanSpeedRegulator(new HighSpeedRegulator());
        System.out.println(fanSpeed.getFanSpeedRegulator().getPresentState());
    }
}

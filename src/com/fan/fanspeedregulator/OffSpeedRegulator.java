package com.fan.fanspeedregulator;

import com.fan.statustype.SpeedType;

public class OffSpeedRegulator implements FanSpeedRegulator {

    private SpeedType speedType;

    public OffSpeedRegulator() {
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
        fanSpeed.setFanSpeedRegulator(new SlowSpeedRegulator());
        System.out.println(fanSpeed.getFanSpeedRegulator().getPresentState());
    }
}

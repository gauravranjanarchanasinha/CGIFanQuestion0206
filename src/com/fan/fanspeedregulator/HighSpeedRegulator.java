package com.fan.fanspeedregulator;

import com.fan.statustype.SpeedType;

public class HighSpeedRegulator implements FanSpeedRegulator {

    private SpeedType speedType;

    public HighSpeedRegulator() {
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
        fanSpeed.setFanSpeedRegulator(new OffSpeedRegulator());
        System.out.println(fanSpeed.getFanSpeedRegulator().getPresentState());
    }
}

package com.fan.fanspeedregulator;

public interface FanSpeedRegulator {
    String getPresentState();

    void pull(FanSpeed fanSpeed);
}

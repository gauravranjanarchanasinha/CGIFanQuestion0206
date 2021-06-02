package com.fan.fanspeedregulator;

public interface FSpeed {
    String getPresentState();

    void pull(FanSpeed fanSpeed);
}

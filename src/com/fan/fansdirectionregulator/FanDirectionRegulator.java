package com.fan.fansdirectionregulator;

public interface FanDirectionRegulator {

    String getPresentState();

    void pull(FansDirection fanDirection);

}

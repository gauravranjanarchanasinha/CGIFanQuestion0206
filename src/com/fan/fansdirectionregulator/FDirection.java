package com.fan.fansdirectionregulator;

public interface FDirection {

    String getPresentState();

    void pull(FansDirection fanDirection);

}

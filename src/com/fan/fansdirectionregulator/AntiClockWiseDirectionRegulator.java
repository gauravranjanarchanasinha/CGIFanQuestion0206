package com.fan.fansdirectionregulator;

import com.fan.statustype.DirectionType;

public class AntiClockWiseDirectionRegulator implements FanDirectionRegulator {

    private final DirectionType directionType;

    public AntiClockWiseDirectionRegulator() {
        directionType = DirectionType.ANTICLOCKWISE;
    }

    public DirectionType getDirectionType() {
        return directionType;
    }

    @Override
    public String getPresentState() {
        return getDirectionType().getDescription();
    }

    @Override
    public void pull(FansDirection fanDirection) {
        fanDirection.setFanDirectionRegulator(new ClockWiseDirectionRegulator());
        System.out.println(fanDirection.getFanDirectionRegulator().getPresentState());
    }
}

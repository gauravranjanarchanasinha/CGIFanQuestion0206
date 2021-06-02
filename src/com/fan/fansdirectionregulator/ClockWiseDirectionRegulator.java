package com.fan.fansdirectionregulator;

import com.fan.statustype.DirectionType;

public class ClockWiseDirectionRegulator implements FanDirectionRegulator {

    private final DirectionType directionType;

    ClockWiseDirectionRegulator() {
        directionType = DirectionType.CLOCKWISE;
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
        fanDirection.setFanDirectionRegulator(new AntiClockWiseDirectionRegulator());
        System.out.println(fanDirection.getFanDirectionRegulator().getPresentState());
    }
}

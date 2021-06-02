package com.fan.fansdirectionregulator;

import com.fan.statustype.DirectionType;

public class AntiClockWiseDirection implements FDirection {

    private final DirectionType directionType;

    public AntiClockWiseDirection() {
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
        fanDirection.setfDirection(new ClockWiseDirection());
        System.out.println(fanDirection.getfDirection().getPresentState());
    }
}

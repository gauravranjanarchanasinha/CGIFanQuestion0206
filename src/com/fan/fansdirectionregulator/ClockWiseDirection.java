package com.fan.fansdirectionregulator;

import com.fan.statustype.DirectionType;

public class ClockWiseDirection implements FDirection {

    private final DirectionType directionType;

    ClockWiseDirection() {
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
        fanDirection.setfDirection(new AntiClockWiseDirection());
        System.out.println(fanDirection.getfDirection().getPresentState());
    }
}

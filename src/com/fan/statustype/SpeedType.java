package com.fan.statustype;

public enum SpeedType {
    OFF(0, "Fan Speed is Off"),
    LOW(1, "Fan Speed is Slow"),
    MEDIUM(2, "Fan Speed is Medium"),
    HIGH(3, "Fan Speed is High");

    private final int speed;
    private final String fanStateDescription;

    SpeedType(int speed, String fanStateDescription) {
        this.speed = speed;
        this.fanStateDescription = fanStateDescription;
    }

    public int getSpeed() {
        return speed;
    }

    public String getFanStateDescription() {
        return fanStateDescription;
    }


}

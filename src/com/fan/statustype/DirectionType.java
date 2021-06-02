package com.fan.statustype;

public enum DirectionType {
    CLOCKWISE("The fan moves from left to right"),
    ANTICLOCKWISE("The fan moves from right to left");

    private final String description;

    DirectionType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

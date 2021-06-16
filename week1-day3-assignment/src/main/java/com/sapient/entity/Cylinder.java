package com.sapient.entity;

import lombok.Data;

@Data
public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {

    }

    public Cylinder(double radius) {
        setRadius(radius);
    }

    public Cylinder(double radius, double height) {
        setRadius(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        setRadius(radius);
        this.height = height;
        setColor(color);
    }

    @Override
    public double getVolume() {
        return Math.PI * height * getRadius() * getRadius();
    }

    @Override
    public String toString() {

        return "radius: " + getRadius() + " height: " + height + "color :" + getColor();

    }
}

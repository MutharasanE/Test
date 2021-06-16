package com.sapient.entity;

import lombok.Data;

@Data
public class Circle2 extends Shape {
    private double radius = 1.0;

    public Circle2() {

    }

    public Circle2(double radius) {
        this.radius = radius;
    }

    public Circle2(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle2 [color=" + getColor() + "filled=" + isFilled() + "radius=" + radius + "]";
    }

}

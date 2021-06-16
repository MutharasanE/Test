package com.sapient.entity;

import lombok.Data;

@Data
public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getVolume() {
        return 0;
    }

    public String toString() {
        return "Radius: " + radius + "Color: " + color;
    };
}

package com.sapient.entity;

import lombok.Data;

@Data
public class Square extends Rectangle {
    private double side;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
        setWidth(side);
        setLength(side);
    }

    public Square(double side, String color, boolean filled) {
        this.side = side;
        setColor(color);
        setFilled(filled);
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "Square [Rectangle[Shape[color=" + getColor() + "filled=" + isFilled() + "width=" + getWidth()
                + "length=" + getLength() + "]" + "side=" + side + "]";
    }

}

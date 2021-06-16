package com.sapient.program;

import com.sapient.entity.Circle2;
import com.sapient.entity.Rectangle;
import com.sapient.entity.Shape;
import com.sapient.entity.Square;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ShapeApp {
    public static void main(String[] args) {
        Shape[] shape = { new Circle2(2.0), new Circle2(2.0, "blue", true), new Circle2(4.0, "blue", false),
                new Circle2(2.0, "blue", true), new Rectangle(), new Rectangle(2.0, 4.0),
                new Rectangle(2.0, 5.0, "yellow", false), new Square(), new Square(4.0),
                new Square(6.0, "pink", true) };
        for (Shape shape2 : shape) {
            log.debug("The Shape is {}", shape2.toString());
        }
        log.debug("Area of circle 2 : {}", ((Circle2) shape[1]).getArea());
        log.debug("Perimeter of Rectangle 5 : {}", ((Rectangle) shape[4]).getPerimeter());
        log.debug("Area of square 10 : {}", ((Square) shape[9]).getArea());
    }
}

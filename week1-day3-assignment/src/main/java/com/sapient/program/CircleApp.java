package com.sapient.program;

import com.sapient.entity.Circle;
import com.sapient.entity.Cylinder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CircleApp extends Circle {
    public static void main(String[] args) {

        Circle[] circles = { new Cylinder(12.34), new Cylinder(12.34, 10.0), new Cylinder(12.34, 10.0, "blue") };

        log.debug("The result 1 {}", circles[0].toString());
        log.debug("The result 2 {}", circles[1].toString());
        log.debug("The Volume 3 {}", circles[2].getVolume());

    }
}
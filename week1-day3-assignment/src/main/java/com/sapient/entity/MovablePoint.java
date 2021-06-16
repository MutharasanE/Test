package com.sapient.entity;

import lombok.Data;

@Data
public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y = y - ySpeed;
    }

    @Override
    public void moveDown() {
        y = y + ySpeed;
    }

    @Override
    public void moveRight() {
        x = x - xSpeed;
    }

    @Override
    public void moveLeft() {
        x = x + xSpeed;
    }
}

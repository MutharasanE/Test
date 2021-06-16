package com.sapient.entity;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        topLeft.setY(topLeft.getY() - topLeft.getYSpeed());
        bottomRight.setY(bottomRight.getY() + bottomRight.getYSpeed());

    }

    @Override
    public void moveDown() {
        topLeft.setY(topLeft.getY() + topLeft.getYSpeed());
        bottomRight.setY(bottomRight.getY() - bottomRight.getYSpeed());

    }

    @Override
    public void moveLeft() {
        topLeft.setX(topLeft.getX() - topLeft.getXSpeed());
        bottomRight.setX(bottomRight.getX() + bottomRight.getXSpeed());
    }

    @Override
    public void moveRight() {
        topLeft.setX(topLeft.getX() + topLeft.getXSpeed());
        bottomRight.setX(bottomRight.getX() - bottomRight.getXSpeed());
    }

    @Override
    public String toString() {
        return "MovableRectangle [bottomRight.x=" + bottomRight.getX() + ",bottomRight.y=" + bottomRight.getY()
                + ", topLeft.x=" + topLeft.getX() + ", topLeft.y=" + topLeft.getY() + ", xSpeed" + topLeft.getXSpeed()
                + ", ySpeed=" + topLeft.getYSpeed() + "]";
    }

}

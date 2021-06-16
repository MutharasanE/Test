package com.sapient.entity;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        center = new MovablePoint(x, y, xSpeed, ySpeed);

    }

    @Override
    public void moveUp() {
        center.setY(center.getY() - center.getYSpeed());
    }

    @Override
    public void moveDown() {
        center.setY(center.getY() + center.getYSpeed());
    }

    @Override
    public void moveLeft() {
        center.setX(center.getX() - center.getXSpeed());
    }

    @Override
    public void moveRight() {
        center.setX(center.getX() + center.getXSpeed());
    }

    @Override
    public String toString() {
        return "MovableCircle [center.x=" + center.getX() + ", center.y=" + center.getY() + "center.xSpeed="
                + center.getXSpeed() + "center.ySpeed=" + center.getYSpeed() + "radius=" + radius + "]";
    }

}

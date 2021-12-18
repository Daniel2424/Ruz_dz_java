package ru.mirea.dz6;

public class MovablePoints extends Shape implements Movable{
    MovablePoint pointOne, pointTwo;

    public MovablePoints() {
        pointOne = new MovablePoint(0, 0);
        pointTwo = new MovablePoint(3, 3);
    }

    public MovablePoints(MovablePoint pointOne, MovablePoint pointTwo) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
    }

    public MovablePoints(int x, int y, String color, boolean filled) {
        super(color, filled);
        this.x = x;
        this.y = y;
    }

    public double getWidth() {
        return Math.abs((pointTwo.getX()- pointOne.getX()));
    }

    public void setWidth(int x) {
        pointTwo.setX(pointOne.getX() + x);
    }

    public double getLength() {
        return Math.abs((pointTwo.getY()- pointOne.getY()));
    }

    public void setLength(int y) {
        pointTwo.setY(pointOne.getY() + y);
    }

    @Override
    public void moveFigure(int x, int y) {
        pointOne.moveFigure(x,y);
        pointTwo.moveFigure(x,y);
    }

    @Override
    public double getArea() {
        return Math.abs((pointTwo.getX()- pointOne.getX())*(pointTwo.getY()- pointOne.getY()));
    }

    @Override
    public double getPerimetr() {
        return (Math.abs((pointTwo.getX()- pointOne.getX()))+Math.abs((pointTwo.getY()- pointOne.getY())))*2;
    }
}

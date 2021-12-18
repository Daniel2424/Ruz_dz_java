package ru.mirea.dz5;

public class MovablePoint extends Point implements Movable {

    public MovablePoint(int x, int y) {
        super(x, y);
    }

    @Override
    public void moveFigure(int x, int y) {
        this.setX(getX() + x);
        this.setY(getY() + y);
    }
}

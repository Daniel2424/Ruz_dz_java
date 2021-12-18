package ru.mirea.dz6;

public class MovableRectangle extends Rectangle implements Movable {

    @Override
    public void moveFigure(int x, int y) {
        this.setX(getX() + x);
        this.setY(getY() + y);
    }
}

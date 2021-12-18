package ru.mirea.dz6;

public abstract class Shape {
    String color;
    boolean filling;
    protected double x = 0, y = 0;

    public Shape() { }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filling = filled;
    }

    public int getX() {
        return (int) x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return (int) y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract double getArea();
    public abstract double getPerimetr();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilling() {
        return filling;
    }

    public void setFilling(boolean filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filling=" + filling +
                '}';
    }
}

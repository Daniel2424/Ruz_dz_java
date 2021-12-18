package ru.mirea.dz4;

public abstract class Shape {
    String color;
    boolean filling;

    public Shape() { }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filling = filled;
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

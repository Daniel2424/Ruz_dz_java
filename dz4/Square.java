package ru.mirea.dz4;

public class Square extends Rectangle{

    public Square() {
        super.setWidth(1);
        super.setLength(1);
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filling){ super(side, side, color, filling); }

    @Override
    public void setWidth(double a) {
        super.setWidth(a);
        super.setLength(a);
    }

    @Override
    public void setLength(double b) {
        super.setWidth(b);
        super.setLength(b);
    }

    public void setSide(double side){
        setLength(side);
    }

    public double getSide(){
        return getLength();
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + getWidth() +
                ", color='" + color + '\'' +
                ", filling=" + filling +
                ", perimetr=" + getPerimetr() + ", area=" + getArea() + '}';
    }
}

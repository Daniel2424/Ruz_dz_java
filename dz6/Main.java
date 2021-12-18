package ru.mirea.dz6;

public class Main {

    public static void main(String[] args)
    {
        Circle circle = new Circle( 4, "black", true);
        System.out.println(circle.toString());
        //
        MovableCircle movableCircle = new MovableCircle(1, 1, 4, "white", true);
        movableCircle.moveFigure(5, 10);
        System.out.println(movableCircle.toString());
        //
        Rectangle rectangle = new Rectangle(2, 3, "gray", true);
        System.out.println(rectangle.toString());
        //
        Square square = new Square(2, "red", false);
        System.out.println(square.toString());
        //
        MovablePoints movablePoints = new MovablePoints();
        System.out.println(movablePoints.getArea());
        System.out.println(movablePoints.getPerimetr());
    }
}

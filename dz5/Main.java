package ru.mirea.dz5;

public class Main {

    public static void main(String[] args)
    {
        Circle circle = new Circle( 24, "black", true);
        System.out.println(circle.toString());

        MovableCircle movableCircle = new MovableCircle(1, 1, 4, "white", true);
        movableCircle.moveFigure(0, 4);
        System.out.println(movableCircle.toString());

        Rectangle rectangle = new Rectangle(1, 3, "gray", true);
        System.out.println(rectangle.toString());

        Square square = new Square(1, "red", false);
        System.out.println(square.toString());
    }
}

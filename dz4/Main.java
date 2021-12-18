package ru.mirea.dz4;

public class Main {

    public static void main(String[] args)
    {
        Circle circle = new Circle(2, "black", true);
        System.out.println(circle.toString());
        Rectangle rectangle = new Rectangle(1, 4, "white", false);
        System.out.println(rectangle.toString());
        Square square = new Square(24, "gray", true);
        System.out.println(square.toString());
    }
}

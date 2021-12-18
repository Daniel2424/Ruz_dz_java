package ru.mirea.dz7;

public class Wardrobe extends Furniture{
    public Wardrobe(String material, double price) {
        super(material, price);
    }

    public void Open(){
        System.out.println("Wardrobe was opened");
    }

    public void Close(){
        System.out.println("Wardrobe was closed");
    }
}

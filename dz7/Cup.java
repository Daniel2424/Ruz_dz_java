package ru.mirea.dz7;

public class Cup extends Dish{
    public Cup(double price, String form) {
        super(price, form);
    }

    public void Drink(){
        System.out.println("Water boull boule");
    }
}

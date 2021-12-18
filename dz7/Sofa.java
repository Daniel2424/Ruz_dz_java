package ru.mirea.dz7;

public class Sofa extends Furniture{
    public Sofa(String material, double price) {
        super(material, price);
    }

    public void sitDown(){
        System.out.println("sit on sofa of "+ material );
    }

    public void standUp(){
        System.out.println("stand on divan of"+material);
    }
}

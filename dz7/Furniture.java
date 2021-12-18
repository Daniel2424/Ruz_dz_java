package ru.mirea.dz7;

public abstract class Furniture {
    protected String material;
    protected double price;

    public Furniture(String material, double price) {
        this.material = material;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Material=" + material + ", price=" + price;
    }
}

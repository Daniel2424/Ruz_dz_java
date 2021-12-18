package ru.mirea.dz7;

public abstract class Dish {
    protected double price;
    protected String form;

    public Dish(double price, String name) {
        this.price = price;
        this.form = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "price=" + price +
                ", form='" + form + '\'' +
                '}';
    }
}

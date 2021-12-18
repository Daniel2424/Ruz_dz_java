package ru.mirea.dz2;

public class Ball {
    private int size;
    private String model;

    public Ball(int size, String model) {
        this.size = size;
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

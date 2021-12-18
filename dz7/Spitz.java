package ru.mirea.dz7;

public class Spitz extends Dog{
    public Spitz(String name, int age) {
        super(name, age);
    }

    @Override
    public void Voice() {
        System.out.println("yav yav");
    }
}

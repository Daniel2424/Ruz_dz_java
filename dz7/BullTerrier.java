package ru.mirea.dz7;

public class BullTerrier extends Dog{
    public BullTerrier(String name, int age) {
        super(name, age);
    }

    @Override
    public void Voice() {
        System.out.println("AAAAAAAAAAAAv AAAAAAAv");
    }
}

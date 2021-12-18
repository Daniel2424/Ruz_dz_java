package ru.mirea.dz21and22;

public class Client {
    public void Sit( Chair chair ){
        System.out.println("Сесть на " + chair.getClass().getSimpleName());
    }
}

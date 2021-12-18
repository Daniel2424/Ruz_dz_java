package ru.mirea.dz2;

public class Main {
    public static void main(String[] args)
    {
        String[] names = {"Bill", "Tom", "Den"};
        Dog []dogs = new Dog[6];
        for(int i = 0; i < dogs.length; i++){
            dogs[i] = new Dog( names[(int) (Math.random()*3)], (int) (Math.random()*15) );
            dogs[i].ageHuman();
            System.out.println(dogs[i].toString());
        }
    }
}

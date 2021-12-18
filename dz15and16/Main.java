package ru.mirea.dz15and16;

public class Main {
    public static void main(String[] args)
    {
        Bank bank = new Bank("BANK");

        ATM atm1 = new ATM("ATM1", bank);
        ATM atm2 = new ATM("ATM2", bank);

        Thread myThready0 = new Thread(atm1);
        Thread myThready1 = new Thread(atm2);
        myThready0.start();
        myThready1.start();
    }
}
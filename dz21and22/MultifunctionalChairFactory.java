package ru.mirea.dz21and22;

public class MultifunctionalChairFactory implements Factory {
    @Override
    public Chair createChair() {
        return new MultifunctionalChair();
    }
}

package ru.mirea.dz21and22;

public class VictorianChairFactory implements Factory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}

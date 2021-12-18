package ru.mirea.dz21and22;

public class MagicChairFactory implements Factory {
    @Override
    public Chair createChair() {
        return new MagicChair();
    }
}

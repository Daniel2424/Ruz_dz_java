package ru.mirea.dz21and22;

public class MusicEditor implements Editor{
    @Override
    public IDocument NewFile() {
        System.out.println(getClass().getSimpleName() + " создан");
        return new MusicDocument();
    }
}

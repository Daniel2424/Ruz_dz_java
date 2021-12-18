package ru.mirea.dz21and22;

public interface IDocument {
    default void Save(){
        System.out.println(getClass().getSimpleName() + " создан");
    }
}

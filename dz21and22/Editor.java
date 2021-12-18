package ru.mirea.dz21and22;

public interface Editor {
    IDocument NewFile();
    default void OpenFile(IDocument document){
        System.out.println(document.getClass().getSimpleName() + " открыт");
    }
}

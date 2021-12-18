package ru.mirea.dz21and22;

public class Main {
    public static void main(String[] args)
    {
        Client client = new Client();
        Factory magic = new MagicChairFactory();
        Chair magicChair = new MagicChair();
        Factory victorian = new VictorianChairFactory();
        Chair victorianChair = new VictorianChair();
        client.Sit(magicChair);
        client.Sit(victorianChair);


        Editor textEditor = new TextEditor();
        IDocument textFile = textEditor.NewFile();
        textFile.Save();
        //
        Editor musicEditor = new MusicEditor();
        IDocument musicFile = musicEditor.NewFile();
        musicFile.Save();
    }
}

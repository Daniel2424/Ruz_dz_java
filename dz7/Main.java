package ru.mirea.dz7;

public class Main {

    public static void main(String[] args)
    {
        Cup cup = new Cup(800, "square");
        System.out.println(cup.toString());
        Plate plate = new Plate(150, "oval");
        System.out.println(plate.toString());
        System.out.println();
        //

        Spitz spitz = new Spitz("stive", 11);
        System.out.println(spitz.toString());
        spitz.Voice();
        System.out.println();
        //

        BullTerrier bullTerrier = new BullTerrier("boss", 8);
        System.out.println(bullTerrier.toString());
        bullTerrier.Voice();
        System.out.println();
        //

        FurnitureShop furnitureShop = new FurnitureShop();
        Sofa sofa1 = new Sofa("crocodile", 20000);
        Sofa sofa2 = new Sofa("camel", 79000);
        Wardrobe wardrobe1 = new Wardrobe("oak", 7000);
        Wardrobe wardrobe2 = new Wardrobe("Birch", 14500);
        System.out.println();
        //

        furnitureShop.Add(sofa1);
        furnitureShop.Add(sofa2);
        furnitureShop.Add(wardrobe1);
        furnitureShop.Add(wardrobe2);
        System.out.println();
        //

        furnitureShop.PrintShop();
    }
}

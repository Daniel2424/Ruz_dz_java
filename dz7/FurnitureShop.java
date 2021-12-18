package ru.mirea.dz7;

import java.util.ArrayList;

public class FurnitureShop {
    protected ArrayList<Furniture> furnitureArrayList = new ArrayList<Furniture>();

    public void Add(Furniture furniture){
        furnitureArrayList.add(furniture);
    }



    public void PrintShop() {
        System.out.println("Shop: ");
        for(int i = 0; i < furnitureArrayList.size(); i++){
            System.out.println("    " + furnitureArrayList.get(i).toString());
        }
    }
}

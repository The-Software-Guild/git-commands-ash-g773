/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.arrays;

import java.util.Arrays;

/**
 *
 * @author ash_7
 */
public class FruitSalad {
    
    public static void main(String[] args) {
        
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", 
            "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", 
            "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  
            "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", 
            "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", 
            "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        String fruitSalad[] = new String[12];
        int appleKind = 0;
        int orangeKind = 0;
        int fruits = 0;
        
        int fruitsIndexer = 0;
        
        for (int i = 0; i < 12; i++) {
            while (fruitSalad[i] == null && i < fruit.length) {
                if (fruit[fruitsIndexer].contains("berry")) {
                    fruitSalad[i] = fruit[fruitsIndexer];
                    fruitsIndexer++;
                    
                } else if (fruit[fruitsIndexer].contains("Apple")) {
                    if ((Arrays.asList(fruitSalad).contains(fruit[fruitsIndexer])) || (appleKind < 3)) {
                        if (!Arrays.asList(fruitSalad).contains(fruit[fruitsIndexer])) {
                            appleKind++;
                        }
                        fruitSalad[i] = fruit[fruitsIndexer];
                        fruitsIndexer++;
                    }
                } else if (fruit[fruitsIndexer].contains("Orange")) {
                    if ((Arrays.asList(fruitSalad).contains(fruit[fruitsIndexer])) || (orangeKind < 2)) {
                        if (!Arrays.asList(fruitSalad).contains(fruit[fruitsIndexer])) {
                            orangeKind++;
                        }
                        fruitSalad[i] = fruit[fruitsIndexer];
                        fruitsIndexer++;
                    }
                } else if (!fruit[fruitsIndexer].contains("Tomato")) {
                    fruitSalad[i] = fruit[fruitsIndexer];
                    fruitsIndexer++;
                } else {
                    fruitsIndexer++;
                }
            }
        }

        int numOranges = 0, numApples = 0, numBerries = 0, numOtherFruit = 0;
        
        System.out.println("Total # of Fruit in Salad: " + fruitSalad.length);
        System.out.println(Arrays.toString(fruitSalad));
        
        for (int i = 0; i < fruitSalad.length; i++) {
            if (fruitSalad[i].contains("Orange")){
                numOranges++;
            } else if (fruitSalad[i].contains("Apple")){
                numApples++;
            } else if (fruitSalad[i].contains("berry")){
                numBerries++;
            } else {
                numOtherFruit++;
            } 
        }
        
        System.out.println("Number of Apples: " + numApples);
        System.out.println("Number of Oranges: " + numOranges);
        System.out.println("Number of Berries: " + numOranges);
        System.out.println("Number of Other Fruit: " + numOtherFruit);
        
    }
    
}

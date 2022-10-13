/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.methds;

import java.util.Random;

/**
 *
 * @author ash_7
 */
public class BarelyControlledChaos {
    
    public static void main(String[] args) {
        
                
        String color = randColor();
        String animal = randAnimal();
        String colorAgain = randColor();
        int weight = randInt(5, 200);
        int distance = randInt(10, 20);
        int number = randInt(10000, 20000);
        int time = randInt(2, 6);
        
        System.out.println("when i was young...");
        
        System.out.println("i was chased by a " + color + ", " + weight + "lb"
                + " miniature " + animal + " for over " + distance + "miles!!");
        
        System.out.println("i hid in a field of over " + number + " "
                + colorAgain + " poppies for nearly " + time + " hours");
        
        System.out.println("\nIt was mad");
    }
    
    public static String randColor() {
        Random randC = new Random();
        String[] colours = new String[] {"red", "yellow", "orange", "pink", "blue"};
        int randomIndex = randC.nextInt(colours.length);
        String choice = colours[randomIndex];
        return choice;
    }
    
    public static String randAnimal() {
        Random randA = new Random();
        String[] animals = new String[] {"dog", "cat", "ferret", "monkey", "iguana"};
        int randomIndex = randA.nextInt(animals.length);
        String choice = animals[randomIndex];
        return choice;
    }
    
    public static int randInt(int min, int max) {
        Random randI = new Random();
        int choice = randI.nextInt(max+1 - min) + min; 
        //this is the method for setting a min and max in java Random
        return choice;
    }
}

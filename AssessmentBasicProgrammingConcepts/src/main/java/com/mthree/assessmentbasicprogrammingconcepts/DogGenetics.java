/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.assessmentbasicprogrammingconcepts;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ash_7
 */
public class DogGenetics {
    
    public static void main(String[] args) {
        /**
         * asks user for name of dog
         * assign random percentage to 5 dog breeds that add up to 100
         * dog breeds dont have to be random
         */
        
        Scanner scr = new Scanner(System.in);
        
        System.out.println("What is your dog's name?");
        String dogName = scr.nextLine();
        
        System.out.println("ALright, here is a 100% legit report on " + dogName + "'s prestigious background!");
        System.out.println("\n" + dogName + " is:");
        
        Random rand = new Random();
        
        //works by reducing the maximum of Random method by however much % has already been assigned
        int breed1 = rand.nextInt(100);
        int breed2 = rand.nextInt((100 - breed1)); 
        int breed3 = rand.nextInt((100 - breed1 - breed2));
        int breed4 = rand.nextInt((100 - breed1 - breed2 - breed3));
        int breed5 = 100 - breed1 - breed2 - breed3 - breed4; //last breed ensures it adds up to 100
        
        
        System.out.println(breed1 + "% St. Bernard");
        System.out.println(breed2 + "% Chihuahua");
        System.out.println(breed3 + "% Dramatic RedNosed Asian Pug");
        System.out.println(breed4 + "% Common Cur");
        System.out.println(breed5 + "% King Doberman");
        
        System.out.println("What a cool dog!");
        
        

        
    }
}

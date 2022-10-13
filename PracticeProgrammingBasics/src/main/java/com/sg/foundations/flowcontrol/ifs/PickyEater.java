/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author ash_7
 */
public class PickyEater {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        //print didnt work for some reason?
        System.out.println("How many times has it been fried? (#) ");
        int timesFried = Integer.parseInt(userInput.nextLine());
        
        System.out.println("Does it have any spinach in it? (y/n) ");
        String hasSpinach = userInput.nextLine();
        
        System.out.println("Is it covered in cheese? (y/n) ");
        String cheeseCovered = userInput.nextLine();
        
        System.out.println("How many pats of butter are on top? (#) ");
        int butterPats = Integer.parseInt(userInput.nextLine());
        
        System.out.println("Is it covered in chocolate? (y/n) ");
        String chocolateCovered = userInput.nextLine();
        
        System.out.println("Does it have a funny name? (y/n) ");        
        String funnyName = userInput.nextLine();
        
        System.out.println("Is it broccoli? (y/n) ");
        String isBroccoli = userInput.nextLine();
        
        //conditionals
        
        if (hasSpinach.equals('y') || funnyName.equals('y')) {
            System.out.println("they are not gonna eat that :(");
        } /*else if (timesFried == 3 && chocolateCovered.equals('y')) {
            System.out.println("oh deep fried snickers, nice");
        } else if (timesFried == 2 && cheeseCovered.equals('y')) {
            System.out.println("yee cheesy doodles");
        } else if (isBroccoli.equals('y') && butterPats > 6 && cheeseCovered.equals('y')) {
            System.out.println("yh its covered enough");
        } else if (isBroccoli.equals('y')) {
            System.out.println("they dont like plain broccoli :(");
        } else {
            System.out.println("hmmmm...worth a shot!");
        }*/
        
        System.out.println("test");
        
        
    }
}

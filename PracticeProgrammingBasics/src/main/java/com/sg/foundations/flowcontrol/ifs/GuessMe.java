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
public class GuessMe {
    
    public static void main(String[] args){
        int choice = 8;
        int guessInt;
        
        String guess;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("guess my number");
        guess = myScanner.nextLine();
        
        guessInt = Integer.parseInt(guess);
        
        
        
        if (choice == guessInt){
            System.out.println("you got it my g");
        } else if (choice > guessInt) {
            System.out.println("too low, it was " + choice);
        } else if (choice < guessInt) {
            System.out.println("too high, it was " + choice);
        }
        
    }
}

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
public class KnockKnock {
    
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("knock knock, guess who");
        String nameGuess = inputReader.nextLine();
        
        /*
        needs to be .equals instead of == cos thats for numbers
        also equalsIgnoreCase means they can enter it however
        */
        if(nameGuess.equalsIgnoreCase("Marty McFly")){ 
            System.out.println("Hey! That's right! I'm back!");
            System.out.println("...from the Future.");
        } else {
            System.out.println("Dude, do i LOOK like " + nameGuess);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.minizork;

import java.util.Scanner;

/**
 *
 * @author ash_7
 */
public class MiniZork {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door. ");
        System.out.println("There is a small mailbox here. ");
        System.out.println("Go to the house, or open the mailbox? ");
        
        String action = userInput.nextLine();
        
        if (action.equals("look inside")) {
            System.out.println("You peer inside the mailbox. ");
            System.out.println("It's really very dark. So ... so very dark.");
            System.out.print("Run away or keep looking? ");
            action = userInput.nextLine();

            if (action.equals("keep looking")) {
                System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                System.out.println("You've been eaten by a grue.");
            } else if (action.equals("run away")) {
                System.out.println("You run away screaming across the fields - looking very foolish.");
                System.out.println("But you're alive. Possibly a wise choice.");
            } else if (action.equals("stick your hand in")) {
                System.out.println("something bad happens");
            }
        } else if (action.equals("go to the house")) {
            System.out.println("theres people here having a party, enjoy");
            System.out.println("youre invited to the kitchen, do you go?");
            action = userInput.nextLine();
            
            if (action.equals("yes")) {
                System.out.println("oops satanic ritual, oh well");
            } else if (action.equals("no")) {
                System.out.println("oops social outcast, oh well");
            }
        
        }
    }
}
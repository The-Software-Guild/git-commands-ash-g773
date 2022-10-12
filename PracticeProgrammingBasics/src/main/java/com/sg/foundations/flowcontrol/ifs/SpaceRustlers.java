/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

/**
 *
 * @author ash_7
 */
public class SpaceRustlers {
    
    public static void main(String[] args) {
        
        int spaceships = 10;
        int aliens = 25;
        int cows = 100;
        
        if (aliens > spaceships) {
            System.out.println("lets go");
        } else {
            System.out.println("no one to drive!");
        }
        
        /*this else if tests how many cows are there relative to
            spaceships and prints out messages accordingly
        */
        if (cows == spaceships) {
            System.out.println("one moo each");
        } else if (cows > spaceships) { //if the else if was removed, both conditions would be tested sequentially
            System.out.println("no space to moo-ve");
        } else {
            System.out.println("veggie burger");
        }
        
        if (aliens > cows) {
            System.out.println("we have dinner");
        } else if (aliens <= cows) {
            System.out.println("we are dinner");
        }
    }
}

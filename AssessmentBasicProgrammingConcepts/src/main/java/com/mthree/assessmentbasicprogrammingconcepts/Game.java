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
public class Game {
    
    public int playGame() {
        Scanner scr2 = new Scanner(System.in);
        Random compChooser = new Random();
        
        //choices from which computer can choose
        int[] choices = {1, 2, 3};
        
        System.out.println("Choose! Type: \n1 for Rock\n2 for Paper\n3 for Scissors");
        int userChoice = Integer.parseInt(scr2.nextLine());
        
        //the computer choosing rock (1), paper (2) or scissors (3) randomly
        int compChoice = choices[compChooser.nextInt(choices.length)];
        
        int score = -1;
        
        //showing individual results of rounds and assigning value to score accordingly
        if (userChoice == compChoice) {
            System.out.println("ooo a tie!");
            return score = 0;
        } else if ((userChoice == 1 && compChoice == 3) || (userChoice == 2 && compChoice == 1) || (userChoice == 3 && compChoice == 2)) {
            System.out.println("good job!");
            return score = 1;
        } else if ((userChoice == 3 && compChoice == 1) || (userChoice == 1 && compChoice == 2) || (userChoice == 2 && compChoice == 3)) {
            System.out.println("ha! unlucky! computer chose " + compChoice);
            return score = 2;
        } else { 
            return score;
        }
    }
    
}

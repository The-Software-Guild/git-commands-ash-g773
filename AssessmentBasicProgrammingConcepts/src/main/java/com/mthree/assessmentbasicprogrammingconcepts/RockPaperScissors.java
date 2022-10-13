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
public class RockPaperScissors {
    
    /**
     * overview
     * 
     * ask how many rounds, max 10 min 1 - error message if outside
     * for each round get user input choice
     * (use numbers for choices)
     * comp chooses using random
     * compare and show result
     * add result to counter if applicable and continue
     * print ties, wins, losses and overall winner
     * ask if they want to play again - no message, yes ask again
     */
    
    public static void main(String[] args) {
        boolean replay = true; //allows for replay functionality
        do {
            int rounds;
        
            Scanner scr = new Scanner(System.in);

            System.out.println("Hey there! Let's play rock, paper, scissors "
                    + "- how many rounds would you like to play? (1-10)");
            rounds = Integer.parseInt(scr.nextLine());

            //exits out of the program if an invalid # of rounds is entered
            if (rounds == 0 || rounds > 10) {
                System.out.println("That's not between 1 and 10!");
                System.exit(0);
            } 
            
            //initialize empty int array to hold scores of games
            int score[] = new int[rounds];

            //for each round, run playGame method and track score returned
            for (int i = 0; i < rounds; i++) {
                score[i] = playGame();
            }
            
            //sum wins ties and losses over the rounds using stored score array
            int winCount = 0;
            int tieCount = 0;
            int lossCount = 0;

            for (int i = 0; i < rounds; i++) {
                if (score[i] == 0) {
                    tieCount++;
                } else if (score[i] == 1) {
                    winCount++;
                } else if (score[i] == 2) {
                    lossCount++;
                }
            }

            //ties, wins and loss counts presented
            System.out.println("Looks like there were "
                    + tieCount + " ties, "
                    + winCount + " wins and "
                    + lossCount + " losses!");

            //outcome statements
            if (winCount > lossCount) {
                System.out.println("That means you are the winner!! Well done");
            } else if (lossCount > 0) {
                System.out.println("That means the computer is the winner!!");
            } else {
                System.out.println("It's a draw!");
            }
            
            //checking if user wants to replay
            System.out.println("Would you like to play again?");
            String replayStr = scr.nextLine();
            
            //setting replay value accordingly so that do-while loop breaks
            if (replayStr.equalsIgnoreCase("no") || replayStr.equals("n")){
                System.out.println("Thanks for playing, goodbye!");
                replay = false;
            }
        } while (replay==true); //allows for replay functionality
    }
    
        
    public static int playGame() {
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

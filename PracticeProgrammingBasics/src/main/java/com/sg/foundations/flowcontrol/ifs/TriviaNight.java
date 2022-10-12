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
public class TriviaNight {
    
    public static void main(String[] args) {
        /**
         * 3 multiple choice questions
         * keep track of score + display final count
        */
        int score = 0;
        
        int guess1;
        int guess2;
        int guess3;
        
        int answer1 = 1;
        int answer2 = 2;
        int answer3 = 3;
         
        String Q1ScoreStr;
        String Q2ScoreStr;
        String Q3ScoreStr;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("welcome to trivia night!");
        
        System.out.println("question 1: "
                + "\nwhere is cape town?"
                + "\n1) south africa"
                + "\n2) poland"
                + "\n3) russia"
                + "\n4) egypt");
        String input1Str = myScanner.nextLine();
        guess1 = Integer.parseInt(input1Str);
        
        if (guess1 == answer1) {
            System.out.println("you got it!");
            score++;
        } else {
            System.out.println("nope! the answer was " + answer1 + ")");
        }
        
        System.out.println("question 2: "
                + "\nwhat does nato stand for?"
                + "\n1) north atlantic treaty office"
                + "\n2) north atlantic treaty organization"
                + "\n3) north american treaty organization"
                + "\n4) north atlantic treasury office");
        String input2Str = myScanner.nextLine();
        guess2 = Integer.parseInt(input2Str);
        
        if (guess2 == answer2) {
            System.out.println("you got it!");
            score++;
        } else {
            System.out.println("nope! the answer was " + answer2 + ")");
        }
        
        System.out.println("question 3: "
                + "\nwho are the two members of Tenacious D"
                + "\n1) Jack Nicholson and Kyle Bottle"
                + "\n2) Jared Leto and George Clooney"
                + "\n3) Jack Black and Kyle Glass"
                + "\n4) Barack Obama and Joe Biden");
        String input3Str = myScanner.nextLine();
        guess3 = Integer.parseInt(input3Str);
        
        if (guess3 == answer3) {
            System.out.println("you got it!");
            score++;
        } else {
            System.out.println("nope! the answer was " + answer3 + ")");
        }
         
        if (score == 3) {
            System.out.println("erm u killed it, good job! you scored " + score);
        } else if (score == 2) {
            System.out.println("okkkkk p good p good... you scored " + score);
        } else {
            System.out.println("oh dear, better luck next time! you scored " + score);
        }
        
        System.out.println("thanks for playing gang");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.assessmentbasicprogrammingconcepts;

import java.util.Scanner;

/**
 *
 * @author ash_7
 */
public class HealthyHearts {
    
    /**
     * ask user for age
     * calculate healthy heart rate range for age
     * display it
     * max heart rate is 220 - age
     * target heart rate zone is 50 - 85% of maximum
     */
    
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        
        System.out.println("How old are you?");
        int userAge = Integer.parseInt(scr.nextLine());
        
        //Math.round method returns whole numbers which are more appropriate for beats per minute
        System.out.println("Your maximum heart rate should be "
            + (220 - userAge) + " beats per minute");
        System.out.println("Your target HR Zone is " 
               + Math.round((220 - userAge) * 0.5) + " - "  
               + Math.round((220 - userAge) * 0.85) + " beats per minute.");
    }
}

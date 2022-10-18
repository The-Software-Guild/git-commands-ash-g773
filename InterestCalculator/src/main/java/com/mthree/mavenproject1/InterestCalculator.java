/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author ash_7
 */
public class InterestCalculator {
    
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        
        System.out.println("How much do you want to invest? ");
        double principal = Integer.parseInt(scr.nextLine());
        
        System.out.println("How many years are you investing? ");
        int years = Integer.parseInt(scr.nextLine());
        
        System.out.println("What is the annual interest rate % growth? ");
        double annualInterest = Integer.parseInt(scr.nextLine());
        annualInterest /= 100;
        
        System.out.println("Choose your compound period - quarterly, monthly or daily");
        String compoundPeriod = scr.nextLine();
        int compoundPeriodInt = 0;
        
        switch(compoundPeriod) {
            case "quarterly":
                compoundPeriodInt = 4;
                break;
            case "monthly":
                compoundPeriodInt = 12;
                break;
            case "daily":
                compoundPeriodInt = 365;
                break;
            default:
                System.out.println("That input is invalid.");
        }
        
        
        System.out.println(annualInterest);
        
        System.out.println("Calculating...");
        
        //CurrentBalance * (1 + (QuarterlyInterestRate / 100))
        double next = 0;
        
        for (int i = 0; i < years; i++) {
            if (i == 0) {
                next = yearlyCalculations((i+1), principal, annualInterest, compoundPeriodInt);
            } else {
                next = yearlyCalculations((i+1), next, annualInterest, compoundPeriodInt);
            }
            
        }
    
    }
    
    public static double yearlyCalculations(int yearNum, double startAmount, double interestRate, int compounding) {
        
        double endAmount = startAmount * Math.pow((1 + (interestRate / compounding)), (compounding * yearNum));
        double earned = endAmount - startAmount;
        
        System.out.println("\nYear " + yearNum + ":");
        System.out.println("Began with $" + startAmount);
        
        //double earned = startAmount * interestRate;
        System.out.println("Earned $" + earned);
        
        //double endAmount = startAmount + earned;
        System.out.println("Ended with $" + endAmount);        
        
        return endAmount;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.mavenproject1;

/**
 *
 * @author ash_7
 */
public class YearlyCalculations {
    
    public double yearlyCalculations(int yearNum, double startAmount, double interestRate, int compounding) {
        
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


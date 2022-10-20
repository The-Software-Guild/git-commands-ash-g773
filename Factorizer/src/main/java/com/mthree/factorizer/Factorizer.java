/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.factorizer;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ash_7
 */
public class Factorizer {
    
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        
        //recieve from user the number to do calcs on
        System.out.println("What number would you like to factor?");
        int factorize = Integer.parseInt(scr.nextLine());
        
        //create list of factors
        Factors factorsObj = new Factors();
        int[] factorList = factorsObj.factors(factorize);
        
        System.out.println("The factors of " + factorize + " are:");
        System.out.println("\n" + Arrays.toString(factorList));
        System.out.println(factorize + " has " + (factorList.length+1) + " factors.");
        
        FactorSum factorSumObj = new FactorSum();
        int factorSum = factorSumObj.sumFactors(factorList);
        
        if (factorSum == factorize) {
            System.out.println(factorize + " is a perfect number.");        
        } else {
            System.out.println(factorize + " is not a perfect number.");
        }
        
        if (factorList.length == 1) {
            System.out.println(factorize + " is a prime number.");        
        } else {
            System.out.println(factorize + " is not a prime number.");
        }
        
        
    }
    
    
    
     
    
}





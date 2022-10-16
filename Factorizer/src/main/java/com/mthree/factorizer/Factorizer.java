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
        
        //create list of factors using method
        int[] factorList = factors(factorize);
        
        System.out.println("The factors of " + factorize + " are:");
        System.out.println("\n" + Arrays.toString(factorList));
        System.out.println(factorize + " has " + factorList.length + " factors.");
        
        int factorSum = sumFactors(factorList);
        
        if (factorSum == factorize) {
            System.out.println(factorize + " is a perfect number.");        
        } else {
            System.out.println(factorize + " is not a perfect number.");
        }
        
        if (factorList.length == 2) {
            System.out.println(factorize + " is a prime number.");        
        } else {
            System.out.println(factorize + " is not a prime number.");
        }
        
        
    }
    
    public static int[] factors(int number) {
        
        //create list to store factors
        int ans[] = new int[number];
        
        //variable to count any empty and fully spaces
        int zeros = 0;
        int ansCount = 0;
        
        //checks from 1 to the number to see which the number is divisible by
        // and add it to factors list
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                ans[i-1] = i;
                ansCount++;
            } else { //counts how many elements are zero
                zeros++;
            }
        }
        
        //creates new list to copy accross everything but the zeros
        int ansRet[] = new int[ansCount];
        
        //keeps arary indexing of ansRet correct
        int j = 0;
        
        for (int i=0; i<ans.length; i++) {
            if (ans[i] != 0) {
                ansRet[j] = ans[i];
                System.out.println(Arrays.toString(ansRet));
                j++;
            } 
        }
        
        //returns list of factors
        return ansRet;    
    }
    
     public static int sumFactors(int[] numbers) {
        
        int ans = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            ans += numbers[i];
        }
        
        return ans;    
    }
    
}

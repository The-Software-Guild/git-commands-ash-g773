/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.factorizer;

import java.util.Arrays;

/**
 *
 * @author ash_7
 */
public class Factors {
    
    public int[] factors(int number) {
        
        //create list to store factors
        int ans[] = new int[number];
        
        //variable to count any full spaces
        int ansCount = 0;
        
        //checks from 1 to the number to see which the number is divisible by
        // and add it to factors list
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                ans[i-1] = i;
                ansCount++;
            } 
        }
        
        //creates new list to copy accross everything but the zeros
        int ansRet[] = new int[ansCount];
        
        //keeps arary indexing of ansRet correct
        int j = 0;
        
        for (int i=0; i<ans.length; i++) {
            if (ans[i] != 0) {
                ansRet[j] = ans[i];
                j++;
            } 
        }
        
        //returns list of factors
        return ansRet;    
    }
    
}

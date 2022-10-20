/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.factorizer;

/**
 *
 * @author ash_7
 */
public class FactorSum {
    
    public static int sumFactors(int[] numbers) {
        
        int ans = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            ans += numbers[i];
        }
        
        return ans;    
    }
    
}

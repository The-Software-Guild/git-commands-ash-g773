/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.arrays;

/**
 *
 * @author ash_7
 */
public class StillPositive {
    
    public static void main(String[] args) {
        
        int[] numbers = {389, -47, 26, -485, 712, -884, 94 ,-64, 868, -776,
            227 ,-7, 44, 422, -109, 259, -500, 278, -219, 799, -311};
        int[] posNums = null;
        
        for (int i=0; i<numbers.length; i++ ) {
            if (numbers[i] > 0 ) {
                posNums[i] = numbers[i];
                System.out.println(posNums);
            }
        }
        
        System.out.println("gotta be positive");
        System.out.println(posNums);
        
    }
}

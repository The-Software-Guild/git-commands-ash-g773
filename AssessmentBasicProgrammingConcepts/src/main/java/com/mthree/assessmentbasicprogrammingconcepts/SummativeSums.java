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
public class SummativeSums {
    
    /**
     * static method that takes input int arrays
     * adds them together
     * returns result
     * call method inside main and print out as #1 array sum etc
     * INCOMPLETE
     */
   
    public static void main(String[] args) {
        //a way to input multiple arrays if needed, but calculates sum individually (aka one by one input
        boolean hasArray = true; 
        int iterations = 0;
        iterations++;
        do {
            
            Scanner scr = new Scanner(System.in);
            
            System.out.println("Please enter the array you would like to sum up:");
            
            //get the array as inputted, string : "{ X, X, X ..., X}"
            String arrayInput = scr.nextLine();
            
            //make new string array containing arrayInput split at every comma
            String[] arrayInputSplit = arrayInput.split(",");
            
            //make new int array to contain ints from arrayInputSplit
            int arrayInt[] = new int[arrayInputSplit.length];
            
            /*
            need code here to remove the { and } from the first and last items in the array
            */
            
            //go through arrayInputSplit converting each element to an integer and assigning it to arrayInt - DOESNT WORK
            for (int i = 0; i< arrayInputSplit.length; i++) {
                arrayInt[i] = Integer.parseInt(arrayInputSplit[i]);
            }
            
            int sum = arrayAdder(arrayInt);
            
            //checks if user has more arrays
            System.out.println("#" + iterations + " Array Sum:" + sum);
            System.out.println("Do you have another array to sum up?");
            String hasArrayInput = scr.nextLine();
            
            if (hasArrayInput.equalsIgnoreCase("no") || hasArrayInput.equalsIgnoreCase("n")) {
                hasArray = false;
            }
        } while(hasArray==true);
        
    }
    
    
    public static int arrayAdder(int[] array){
        
        int sum = 0;
        
        //goes through each item in the int array and adds them together
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        
        return sum;
    }
}

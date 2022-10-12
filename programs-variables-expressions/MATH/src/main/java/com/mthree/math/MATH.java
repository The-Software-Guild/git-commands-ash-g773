/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.math;

/**
 *
 * @author ash_7
 */
public class MATH {
    public static void main(String[] args){
        int result;
        int operand1;
        int operand2;
        int operand3;
        
        result = 0;
        
        operand1 = 5;
        operand2 = 7;
        operand3 = operand2; //also tested print(++operand3) - gave 8, operand3++ gave 7
        
        result = 42 + 53;
        result = operand1 + operand2;
        result = operand1 + 9;
        
        result = 3;
        result += 4; //this += thing works for +, -, /, *
        result += operand1;
        ++result; //shows 13 ma boy
        
        result /= 2; //should show 6? ye, integer division take whole number and leaves remainder
        
        System.out.print(result);
        
        
    }
}

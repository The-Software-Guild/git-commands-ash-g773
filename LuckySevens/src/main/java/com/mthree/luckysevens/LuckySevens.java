/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.luckysevens;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ash_7
 */
public class LuckySevens {
    
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        
        System.out.println("How many dollars do you have to bet?");
        int money = Integer.parseInt(scr.nextLine());
        
        int rolls = 0;
        int maxMoney = money;
        int maxMoneyRolls = 0;
        
        
        do {
            rolls++;
            money = roll(money);
                        
            if (money > maxMoney) {
                maxMoneyRolls = rolls;
                maxMoney = money;
            }
        } while (money > 0);
        
        System.out.println("You are broke after " + rolls + " rolls...!");
        System.out.println("You should have quit after " + maxMoneyRolls + " rolls, you had " + maxMoney);
        
        
    }
    
    public static int roll(int moneyIn) {
        
        Random dice = new Random();
        
        int diceRollOne = dice.nextInt(7);
        int diceRollTwo = dice.nextInt(7);
        int moneyOut = 0;
        
        if (diceRollOne + diceRollTwo == 7) {
            moneyOut = moneyIn + 4;
            System.out.println("win");
        } else {
            moneyOut = moneyIn - 1;
            System.out.println("loss");
        }
        
        System.out.println(moneyOut);
        return moneyOut;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.luckysevens;

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
        
        Dice gameDice = new Dice();
        
        do {
            rolls++;
            money = gameDice.roll(money);
                        
            if (money > maxMoney) {
                maxMoneyRolls = rolls;
                maxMoney = money;
            }
        } while (money > 0);
        
        System.out.println("You are broke after " + rolls + " rolls...!");
        System.out.println("You should have quit after " + maxMoneyRolls + " rolls, you had " + maxMoney);
        
        
    }
    
    
    
}

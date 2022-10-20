/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.luckysevens;

import java.util.Random;

/**
 *
 * @author ash_7
 */
public class Dice {
    
    public int roll(int moneyIn) {
        
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.methds;

/**
 *
 * @author ash_7
 */
public class MatchWork {
    
    public static void main(String[] args) {
        
        System.out.println("cart should come before horse alphabetically : " + comesBefore("cart", "horse"));
        System.out.println("half of 42 = " + halfOf(42d));
        System.out.println(" (short) Pi = " + pi());
        System.out.println("first letter of llama: " + firstLetter("llama"));
        System.out.println(" 1337 X 1337 = " + times1337(1337));
    }
    
    public static double pi() {
        return 3.14;
    }
    
    public static int times1337(int x) {
        return x * 1337;
    }
    
    public static double halfOf(double y) {
        return y / 2;
    }
    
    public static String firstLetter(String word) {
        return word.substring(0, 1);
    }
    
    public static boolean comesBefore(String a, String b) {
        return a.compareToIgnoreCase(b) < 0;
    }
}

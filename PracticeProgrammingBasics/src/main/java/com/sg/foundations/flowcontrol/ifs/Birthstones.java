/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author ash_7
 */
public class Birthstones {
    
    public static void main(String[] args){
        
        int monthInt;
        
        String monthStr;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("hello! please enter your birth month in MM format:");
        monthStr = myScanner.nextLine();
        
        monthInt = Integer.parseInt(monthStr);
        
        if (monthInt == 1) {
            System.out.println("January's birthstone is Garnet.");
        } else if (monthInt == 2) {
            System.out.println("February's birthstone is Amethyst.");
        } else if (monthInt == 3) {
            System.out.println("March's birthstone is Aquamarine.");
        } else if (monthInt == 4) {
            System.out.println("April's birthstone is Diamond.");
        } else if (monthInt == 5) {
            System.out.println("May's birthstone is Emerald.");
        } else if (monthInt == 6) {
            System.out.println("June's birthstone is Pearl.");
        } else if (monthInt == 7) {
            System.out.println("July's birthstone is Ruby.");
        } else if (monthInt == 8) {
            System.out.println("August's birthstone is Peridot.");
        } else if (monthInt == 9) {
            System.out.println("September's birthstone is Sapphire.");
        } else if (monthInt == 10) {
            System.out.println("October's birthstone is Opal.");
        } else if (monthInt == 11) {
            System.out.println("November's birthstone is Topaz.");
        } else if (monthInt == 12) {
            System.out.println("December's birthstone is Turquoise.");
        } else {
            System.out.println("thats not a month!");
        }

    }
}

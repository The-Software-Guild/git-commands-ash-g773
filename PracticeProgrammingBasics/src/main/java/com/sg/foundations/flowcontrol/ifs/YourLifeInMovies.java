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
public class YourLifeInMovies {
    
    public static void main(String[] args) {
        String name;
        String strBirthYear;
        
        int birthYear;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("enter name: ");
        name = myScanner.nextLine();
        System.out.println("alright " + name + ", what year were you born?");
        strBirthYear = myScanner.nextLine();
        
        birthYear = Integer.parseInt(strBirthYear);
        
        if (birthYear < 1965) {
            System.out.println("the mash tv series has beena aroudn for about half a century");
        } if (birthYear < 1975) {
            System.out.println("the original jurassic park release is closer to the first lunar landing than today");
        } if (birthYear < 1985) {
            System.out.println("space jame came out two decades ago");
        } if (birthYear < 1995) {
            System.out.println("first harry potter came out over 15 years ago");
        } if (birthYear < 2005) {
            System.out.println("the movie up came out over a decade ago");
        }
        
    }
}

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
public class FieldDay {
    
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        
        System.out.println("Hello! What's your last name?");
        String lastName = scr.nextLine();
        
        if(lastName.compareTo("Baggins") < 0){
            System.out.println("youre on team red dragons");
        } else if (lastName.compareTo("Baggins") > 0 && lastName.compareTo("Dresden") < 0) {
            System.out.println("youre on team dark wizards");
        } else if (lastName.compareTo("Dresden") > 0 && lastName.compareTo("Howl") < 0) {
            System.out.println("youre on team moving castles"); 
        } else if (lastName.compareTo("Howl") > 0 && lastName.compareTo("Potter") < 0) {
            System.out.println("youre on team golden snitches");
        } else if (lastName.compareTo("Potter") > 0 && lastName.compareTo("Vimes") < 0) {
            System.out.println("youre on team night guards");
        } else {
            System.out.println("team black holes");
        }
            
        System.out.println("good luck");
    }
}

package com.mthree.windowmaster;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ash_7
 * code-along: window master
 * completed 12/10/2022
 */
public class WindowMaster {
    /*
    - prompt user for height + width of window
    - calculate display area + perimeter of window
    - calculate total cost of glass and trim
    
    get inputs from user, convert to float, height * width for area
        and 2height + 2width for perimeter, multiply each number by glass and
        trim cost respectively, add together for total cost
    */
       
    public static void main (String[] args){
        
        //declaring variables for height and width
        float height;
        float width;
        
        //declaring variables to hold inputs from user
        String strHeight;
        String strWidth;
        
        //declaring other variables
        float area;
        float cost;
        float perimeter;
        
        //declaring and initializing scanner
        Scanner myScanner = new Scanner(System.in);
        
        //getting input from the user
        System.out.println("Please enter window height:");
        strHeight = myScanner.nextLine();
        System.out.println("Please enter window width");
        strWidth = myScanner.nextLine();
        
        //convert string values to floats
        height = Float.parseFloat(strHeight);
        width = Float.parseFloat(strWidth);
        
        //calculate area
        area = height * width;
        
        //calculate perimeter
        perimeter = (height * 2) + (width * 2);
        
        //calculate total cost
        cost = area * 3.50f + perimeter * 2.25f;
        
        //display results!
        System.out.println("Window height = " + strHeight);
        System.out.println("Window width = " + strWidth);
        System.out.println("Window area = " + area);
        System.out.println("Window perimeter = " + perimeter);
        System.out.println("Total cost = " + cost);
        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

/**
 *
 * @author ash_7
 */
public class LlamasWhalesAndDodosOhMy {
    
    public static void main(String[] args){
        int llamas = 20;
        int whales = 15;
        int dodos = 0;
        
        if (dodos > 0) {
            System.out.println("dodos here");
        }
        
        if (dodos < 0) {
            System.out.println("no dodos");
        }
        
        if (llamas > whales) {
            System.out.println("more llamas than whales");
        }
        
        if (llamas <= whales) {
            System.out.println("llamas less or equal to whales");
        }
        
        System.out.println("dodos do the do");
        dodos += 100;
        
        if((whales + llamas) < dodos) {
            System.out.println("less whales and llamas combined than dodos");
        }
        
        llamas += 10000;
        
        if (llamas > whales && llamas > dodos) {
            System.out.println("llamas more than whales and dodos individually");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula2;

/**
 *
 * @author felipe.frsantana
 */
public class Principal {

    public static void main(String[] args) {
        
        for (int i = 0; i < 15; i++) {
            long timestamp = System.currentTimeMillis();
            if (timestamp % 2 == 1) {
                System.out.println("Hello World git maven");
            }else{
                System.out.println("Erro!");
            }
            
        }
    }
}

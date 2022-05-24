/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mz.co.explicador;

import java.util.Scanner;

/**
 *
 * @author Gulamo_w10
 */
public class Exercicio13i {
    
    /*
    13. Faça um programa em Java que receba um número e mostre uma mensagem 
    caso este número seja maior que 10.
    */
    
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Ensira um numero aletorio: ");
        double n = s.nextDouble();
        
        if (n > 10) {
            System.out.println("Este numero e maior que 10");   
        }
    }
    
}

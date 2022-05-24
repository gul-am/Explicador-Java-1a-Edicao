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
public class Exercicio07i {
    
    /*  
    Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
    A fórmula de conversão é: F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit 
    e C a temperatura em Celsius.
    */
    
    public static void main (String[] args) {
        
        Scanner s = new Scanner (System.in);
        
        System.out.print("Celsius = ");
        double C = s.nextDouble();
        
        int k1 = 9;
        int k2 = 160;
        int k3 = 5;
        
        double F = (k1*C+k2)/k3;
        
        System.out.println("Fahrenheit = " + F );
        
    }
    
}

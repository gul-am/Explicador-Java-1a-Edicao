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
public class Exercicio14i {
    
    /*
    14. Escrever um programa em Java que leia 
    dois valores inteiro distintos e informe qual é o maior.
    */
    
    public static void main (String []args){
        
        Scanner s = new Scanner (System.in);
        
        System.out.print("Insira o primeiro numero: ");
                int n1 = s.nextInt();
                
        System.out.print("Insira o segundo numero: ");
                int n2 = s.nextInt();
                
        if (n1 > n2){
            System.out.println( "O primeiro numero(" +n1+ ") e maior");
        } 
        
        else {
            System.out.println( " O segundo numero(" +n2 + ") e maior");
        }
    }


}

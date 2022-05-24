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
public class Exercicio15i {
    
    /*
    15. Faça um programa em Java que receba um número e diga 
    se este número está no intervalo entre 100 e 200.
    */
    
    public static void main (String []args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Insira um Numero Inteiro: ");
        int n = s.nextInt();
        
        if( n > 100 && n < 200) {
            System.out.println("O numero esta no intervalo de 100 a 200 ");
        }
        else {
            System.out.println("O numero nao esta no intervalo desejado ");
        }
    }
}

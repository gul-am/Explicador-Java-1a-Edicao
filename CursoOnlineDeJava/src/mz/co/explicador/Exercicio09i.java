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
public class Exercicio09i {
    
    /*
    09. Faça um programa em Java que receba um valor que foi depositado 
    e exiba o valor com rendimento após um mês. Considere fixo 
    o juro da poupança em 0,70% a. m.
    */
    
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("O valor a Depositar = ");
        double deposito = s.nextDouble();
        
        double juros = 0.7;
        double rendimento = deposito + (deposito * juros);
        
        System.out.println("O valor com redimento a pois um mes e de " + rendimento );
        
    }
    
}

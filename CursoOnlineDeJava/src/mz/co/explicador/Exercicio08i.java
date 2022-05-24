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
public class Exercicio08i {
    
    /*
    8. Elaborar um programa em Java que efetue a apresentação do valor da conversão 
    em real (R$) de um valor lido em dólar (US$). O programa em Java deverá 
    solicitar o valor da cotação do dólar e também a quantidade de dólares 
    disponíveis com o usuário.
    */
    
    public static void main (String [] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Cotacao do Dollar em Reais = ");
        double cot = s.nextDouble();
        
        System.out.print("Valor em Dollar a converter = ");
        double usd = s.nextDouble();
        
        double reais = usd*cot;
        
        System.out.println("Sao = " + reais + " Reais" );
        
    }
}

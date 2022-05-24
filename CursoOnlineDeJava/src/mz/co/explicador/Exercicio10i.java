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
public class Exercicio10i {
    
   
    
    /*
    10. A Loja Mamão com Açúcar está vendendo seus produtos 
    em 5 (cinco) prestações sem juros. Faça um programa em Java 
    que receba um valor de uma compra e mostre o valor das prestações.
    */
    
    public static void main (String []args){
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("valor de Compra = ");
        double vc = s.nextDouble();
        
        double prestacoes = vc/5;
        
        System.out.println("Pagara em cinco prestacoes de " + prestacoes + " mt, sem juros");
        
    }
    
}

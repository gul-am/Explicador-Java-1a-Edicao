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
public class Exercicio11 {
    
    /*
    11.Faca um programa em java que receba o preco de custo de um produto e mostre
    o calor de venda. sabe-se que o preco de custo recebera um acrescimo de acordo
    com um percentual informado pelo usuario.
    (receba o valor e a percentagem de acrecimo e mostre o valor final)
    */
    
    public static void main (String[] args){
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Preco do Item: ");
    float preco = s.nextFloat();
    
    System.out.println("Percentagem de acrescimo: ");
    float percentagem = s.nextFloat();
    
    
    if( percentagem >= 0 && percentagem <= 100){
        
        float acrescimo = (percentagem/100)*preco;
        float precoFinal = acrescimo + preco;
        
        System.err.println("========== Inicio ===========");
        System.out.println("Preco inicial: " + preco + "mt");
        System.out.println(percentagem + " % = " + acrescimo + "mt");
        System.out.println("Preco final a pagar: " + precoFinal + "mt\n");   
          
    }else{
        System.err.println("Percentual invalido");
        }       
    
    }
    
}

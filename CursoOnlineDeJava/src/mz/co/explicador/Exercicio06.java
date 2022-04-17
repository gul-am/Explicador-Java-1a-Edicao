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
public class Exercicio06 {
    
    /*
    06. Ler dois valores para as variaveis A e B e efectuar as trocas dos valores
    de forma que a variavel A passe a possuir o valor da variavel B e a variavel B
    passe a possuir o valor da variavel A. Apresentar os valores trocados.
    */
    
    public static void main (String[] args){
    
        Scanner s = new Scanner(System.in);
        
        System.out.println("Valor de A: ");
        int a = s.nextInt();
        
        System.out.println("Valor de B: ");
        int b = s.nextInt();
        
        int aux = a;
        
        a = b;
        b = aux;
        
        System.err.println("=========Resultado=========");
        System.out.println("O novo valor de A: " + a);
        System.out.println("O novo valor de B: " + b);
           
    }
}

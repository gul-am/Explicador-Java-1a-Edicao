
package mz.co.explicador;

import java.util.Scanner;

/**
 *
 * @author Gulamo
 */
public class Exercicio01 {
    
    //1. Faca um programa em java que receba dois numeros e exiba o resultado da sua soma.
    
    public static void main (String[] arg){
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Insira o valor do primeiro numero: ");
        int num1 = s.nextInt();
        
        System.out.println("Insira o valor do segundo numero: ");
        int num2 = s.nextInt();
        
        int soma = num1 + num2;
        
        System.out.println("A soma de (" + num1 + ") + (" + num2 + ") = " + soma);
       
        
        
        
    }
    
    
}

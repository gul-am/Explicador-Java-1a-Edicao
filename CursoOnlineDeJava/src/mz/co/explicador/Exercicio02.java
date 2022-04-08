
package mz.co.explicador;

import java.util.Scanner;

/**
 *
 * @author Gulamo
 */
public class Exercicio02 {
    
    //2. Faca um programa em java que receba dois numeros 
    //e ao final mostre a soma, subtracao, multiplicacao e a divisao dos numeros lidos.
    
    public static void main (String[] arg){
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Insira o valor do primeiro numero: ");
        int num1 = s.nextInt();
        
        System.out.println("Insira o valor do segundo numero: ");
        int num2 = s.nextInt();
        
        //Soma
        int soma = num1 + num2;
        
        //Subitracao
        int sub = num1 - num2;
        
        //Multiplicacao
        int mult = num1 * num2;
        
        //Divisao
        double div = num1 / num2;
         
        
       System.out.println("A soma de (" + num1 + ") + (" + num2 + ") = " + soma);
       System.out.println("A subitracao de (" + num1 + ") - (" + num2 + ") = " + sub);
       System.out.println("A Multiplicacao de (" + num1 + ") * (" + num2 + ") = " + mult);
       System.out.println("A Divisao de (" + num1 + ") / (" + num2 + ") = " + div);
          
        
    } 
    
}
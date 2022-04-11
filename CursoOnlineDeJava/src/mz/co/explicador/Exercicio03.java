
package mz.co.explicador;

import java.util.Scanner;

/**
 *
 * @author Gulamo_w10
 */
public class Exercicio03 {
    
    //3. Escreva um programa em java para determinar o cosumo medio de um automovel sendo fornrcida
    // a distancia total pervorida pelo automovel e o total de combustivel gasto.
    
    public static void main (String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Insira a distancia percorida: ");
        double distancia = s.nextDouble();
        
        System.out.println("Insira o combustivel gasto: ");
        double combustivelGasto = s.nextDouble();
        
        double consumoMedio = distancia / combustivelGasto;
        
         System.out.println("Consumo medio: " + consumoMedio + " L/Km");
        
        
        
    }  
}

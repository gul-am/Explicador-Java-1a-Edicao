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
public class Exercicio20 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        String resposta = "S";
        
        int totalDeCarrosAte2000 = 0;
        double totalGeralAPagar = 0;
        
        do{
            System.out.println("Insira o preco do veiculo: ");
            double preco = s.nextDouble();
         
            System.out.println("Insira o ano de fabrico do veiculo: ");
            int anoDeFabrico = s.nextInt();
            
            double desconto = 0;
            
            if(anoDeFabrico > 2000) {
                desconto = preco * 0.07;
            } else{
                desconto = preco * 0.12;
                totalDeCarrosAte2000 ++;
            }
            
            double valorAPagar = preco - desconto;
            totalGeralAPagar += valorAPagar;
            
            System.out.println("Valor de Desconto: " + desconto);
            System.out.println("Valor a ser pago: " + valorAPagar);
            
            System.out.println("Se deja continuar calculando (S/N)");
            resposta = s.next();
            
        } while (!resposta.endsWith("N"));
        
        System.out.println("========== Relatorio =========");
        
        System.out.println("Total de carros com ano ate 2000: " + totalDeCarrosAte2000);
        System.out.println("Total geral: " + totalGeralAPagar);
        
        System.out.println("======= FIM do Relatorio =======");
    }
}




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
public class Exercicio12 {
    
    /*
    12. O custo ao consumidor de um carro novo e a soma do custo de fabrica
    com a percentagem do distribuidor e dos impostos (aplicados, primeiro os 
    impostos sobre o custo de fabrico e depois a percentagem do distribuidore
    sobre o resultado). Supondo que a percentagem do distribuidor seja 28% e
    os impostos 45%. Escrever um programa em java que leia o custo de fabrica
    de um carro e informe o custo ao consumidor do mesmo
    */
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        
        
        System.out.println(" Custo de fabrica do carro: ");
        double fabrica = s.nextDouble();
        
        double impostos = 0.45 * fabrica;
        double distribuidor = 0.28 * fabrica;
        double custoConsumidor =  fabrica + distribuidor + impostos;
        
      
        System.out.println("O custo total de impostos e: " + impostos);
        System.out.println("A comissao de distribuidor e: " + distribuidor);
        System.out.println("O preco de venda oa consumidor e : " + custoConsumidor);
        
    }
    
}

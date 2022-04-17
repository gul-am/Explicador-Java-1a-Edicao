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
public class Exercicio21 {
    
    /*
    21. Escreve um programa em java que leia os dados de "N" pessoas
    (nome, sexo, idade e saude) e informe se esta apta ou nao para cumprir
    o servico militar obrigatorio. informe os totais.
    */
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Insira o numero total de pessoas a verificar: ");
        int N = s.nextInt();
        
        int totalAptos = 0;
        int totalNaoAptos = 0;
        
        for (int i = 0; i < N; i++){
            
            System.out.println("Insira o nome: ");
            String name = s.nextLine();
            System.out.println(name);
            
            System.out.println("Insira o sexo (F/M): ");
            String sexo = s.nextLine();
            System.out.println(sexo);
            
            System.out.println("Insira a idade: ");
            int idade = s.nextInt();
            System.out.println(idade);
            
            System.out.println("Estado de Saude {Bem (B)/ Nao bem (NB): ");
            String saude = s.nextLine();
            
            System.out.println("Apto para cumprir? (S/N): ");
            String apto = s.nextLine();
            
            if (apto.equalsIgnoreCase("S")) {
                totalAptos ++;
            }else {
                totalNaoAptos ++;
            }
            
        }
        
        System.out.println("========== Totais =========");
        System.out.println("Total de pessoas: " + N);
        System.out.println("Total aptos: " + totalAptos);
        System.out.println("Total nao Aptos: " + totalNaoAptos);
    }
    
}

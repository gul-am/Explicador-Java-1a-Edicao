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
public class Exercicio19 {
    
    /*
    19. Escreva um programa em java qie leia o nome e o sexo de 56 pessoas
    e informe o nome e  se ela e homem ou mulher. No final informe 
    total de homens e de mulheres.    
    */
        
    public static void main(String[] args) {       
            
        int total = 5;
    
        String[] nomes = new String[total];
        String[] sexos = new String[total];
    
        Scanner s = new Scanner(System.in);
        
        int totalHomens = 0;
        int totalMulheres = 0;
        
        for (int i = 0; i < total; i++) {
            
            System.out.println("Insira o nome da ["+(i+1)+"a] pessoa");
            nomes[i] = s.nextLine();
            
            System.out.println("Insira o sexo da ["+(i+1)+"a] pessoa, no formato M/F");
            sexos[i] = s.nextLine();
            
            if(sexos[i].equalsIgnoreCase("M")) {
                totalHomens ++;
            }
            if(sexos[i].equalsIgnoreCase("F")) {
                totalMulheres ++;
            }
        }
        System.out.println("Total de Homens: " + totalHomens);
        System.out.println("Total de Mulheres: " + totalMulheres);
    }
    
}

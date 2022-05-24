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
public class Exercicio16i {
    
    /*
    16. Escrever um programa em Java que leia o nome e as três notas 
    obtidas por um aluno durante o semestre. Calcular a sua média (aritmética, 
    informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5)
    e Recuperação (media entre 5.1 a 6.9).
    */
    
    public static void main (String []args){
        Scanner s = new Scanner(System.in);
       
        System.out.print("Nome do estudante: ");
        String nome = s.nextLine();
        
        System.out.print("Nota 1: ");
        double n1 = s.nextDouble();
        
        System.out.print("Nota 2: ");
        double n2 = s.nextDouble();
        
        System.out.print("Nota 3: ");
        double n3 = s.nextDouble();
        
        double media = (n1 + n2 + n3)/3;
        
        if(media >= 7){
            System.out.println("============= Resultados ============\n");
            System.out.println("Nome do Estudante: " + nome);
            System.out.println("Nota Final: " + media);
            System.out.println("Resultado: Aprovado" );
        }
        else {
            if (media >= 5.1 && media <= 6.9){
                System.out.println("============= Resultados ============\n");
                System.out.println("Nome do Estudante: " + nome);
                System.out.println(" Nota Final: " + media);
                System.out.println("Resultado: Recuperacao" );
            }
            else {
                System.out.println("============= Resultados ============\n");
                System.out.println("Nome do Estudante: " + nome);
                System.out.println(" Nota Final: " + media);
                System.out.println("Resultado: Reprovado" );
            }
                      
        }
                
    }
}

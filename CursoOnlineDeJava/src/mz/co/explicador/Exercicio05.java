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
public class Exercicio05 {
    
    /*
    5. Escrever um programa em java que leia o nome de um aluno e as notas das
    tres provas que ele obteve no semestre. no final informar o nome do aluno
    e a sua media(artimetica).
    */
    
    public static void main (String[] args){
    
        Scanner s = new Scanner(System.in);
        
        System.out.println("Nome do Estudante: ");
        String nome = s.nextLine();
        
        System.out.println("Insira as notas das 3 avaliacoes: ");
        double nota1 = s.nextDouble();
        double nota2 = s.nextDouble();
        double nota3 = s.nextDouble();
        
        double media = (nota1 + nota2 + nota3)/3;
                
        System.err.println("===== Detalhes do Estudante =====");
        System.out.println("Nome do Estudante: " + nome);
        System.out.println("Media do Estudante: " + media);
        System.err.println("============== FIM ==============\n");
    }
}

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
public class Exercicio04 {
    
    /*
        4.Escrever um programa que leia o nome de um vendedor,
        o seu salario fixo e o total de vendas efectudas por ele no mes (em dinehro).
        Sabendo que este vendedor ganha 15% (0.15) de comissao sobre as suas vendas efectuadas,
        informar o seu nome, o sa;ario fixo e salario no final do mes.
    */
    
    public static void main (String[] args) {
    
        Scanner s = new Scanner(System.in);
        
        System.out.println("Nome do Vendedor: ");
        String nome = s.nextLine();
        
        System.out.println("Salario Fixo: ");
        double salarioFixo = s.nextDouble();
        
        System.out.println("Total de vendas para o mes corrente: ");
        double vendas = s.nextDouble();
        
        double comicao = vendas * 0.15;
        double salarioFinal = salarioFixo + comicao;
        
        System.err.println("========== Dados do Vendedor ==========");
        System.out.println("Nome: " + nome);
        System.out.println("Salario fixo: " + salarioFixo);
        System.out.println("Comicao: " + comicao);
        System.out.println("Salario Final: " + salarioFinal);
        System.err.println("====== Fim dos dados do Vendedor ======");
        
        
    }
    
}

/* 9 - Dados dois países, A com população igual a cinco milhões de pessoas, e taxa de natalidade de três por cento ao ano, e, B, 
com população igual a sete milhões de pessoas e taxa de natalidade de dois por cento ao ano, escreva um programa em Java 
que calcule iterativamente e exiba em quantos anos a população de A ultrapassará a população de B.*/
package com.mycompany.psc.exercicio04;


public class Questao09 {
   public static void main (String[] args){
        
        int ano = 0;
        double taxaAnualA = 3, taxaAnualB = 2, populacaoPaisA = 5000000, populacaoPaisB = 7000000;
        
           
        
        while (populacaoPaisA < populacaoPaisB){
            
            populacaoPaisA += (populacaoPaisA * taxaAnualA / 100);
            populacaoPaisB += (populacaoPaisB * taxaAnualB / 100);
            
            ano++;
        }
        
        System.out.print("Será nescessário um total de: "+ano+" anos");

    }
} 

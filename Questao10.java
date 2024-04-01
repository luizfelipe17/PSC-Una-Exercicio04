/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.psc.exercicio04;
import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args){
        
        Scanner ler = new Scanner (System.in);
        
        int quantidadeFicha = 100, matriculaDigitada, matriculaMaiorNota = 0, matriculaSegundaMaiorNota = 0;
        double notaDigitada, maiorNota = 0, segundaMaiorNota = 0;
        
        for (int valores = 0; valores < quantidadeFicha; valores++){
            
            System.out.print("Informe a matrícula: ");
            matriculaDigitada = ler.nextInt();
            System.out.print("Informe a nota: ");
            notaDigitada = ler.nextInt();  
            
            if (notaDigitada > maiorNota){
                
                segundaMaiorNota = maiorNota;
                maiorNota = notaDigitada;
                
                matriculaSegundaMaiorNota = matriculaMaiorNota;
                matriculaMaiorNota = matriculaDigitada;
                
            }else if ( notaDigitada > segundaMaiorNota){
                
                segundaMaiorNota = notaDigitada;
                matriculaSegundaMaiorNota = matriculaDigitada;
                
            }
        }
        
            System.out.print("\nA primeira maior nota é: "+maiorNota+" \nMatricula: "+matriculaMaiorNota);
            System.out.print("\nA segunda maior nota é: "+segundaMaiorNota+" \nMatricula: "+matriculaSegundaMaiorNota);
            
        
        
    }
}

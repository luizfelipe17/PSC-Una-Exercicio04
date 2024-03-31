/*1 - Crie um programa que lê vários números inteiros e positivos e imprima o produto dos números ímpares e a soma dos números pares.
*/
package com.mycompany.psc.exercicio04;
import java.util.Scanner;

public class Questao01 {
    public static void main (String[] args){
        
        Scanner ler = new Scanner (System.in);
        
        int valores, produtoNumerosImpares = 0, somaNumerosPares = 0, escolha;
       
        outerLoop:
                
        while (true) {
            
            System.out.print("Informe um valor inteiro: ");
                valores = ler.nextInt();
    
        while (valores >= 0){
             
            
            if (valores % 2 == 0){
                
               somaNumerosPares += valores;
               
            }else{
                
                if (produtoNumerosImpares == 0){
                    
                    produtoNumerosImpares = 1;
                    
                }
                
              produtoNumerosImpares *= valores;  
              
            }
        
        
            System.out.println("9 - INSERIR MAIS NÚMEROS / 0 - SAIR");
                escolha = ler.nextInt();
        
            if(escolha == 0){
                
                System.out.print("O produto dos valores ímpares: "+produtoNumerosImpares+"\n"
                        + "A soma dos valores pares: "+somaNumerosPares);
                
                break outerLoop;
                
            }else if (escolha == 9){
                
                break;
                
            }
        }
        }
    }
}

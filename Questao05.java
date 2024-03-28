/*5 - Crie um programa em Java que implementa um jogo simples de adivinhação. O objetivo do jogo é que o usuário tente adivinhar um número secreto gerado aleatoriamente pelo computador. 
Este número estará entre 1 e 100, inclusive. Para tornar o jogo interativo e dar feedback ao jogador, o programa deve informar após cada tentativa se o palpite do usuário é muito alto, muito baixo, ou correto. 
O jogo termina quando o usuário acertar o número, e o programa deve informar o número de tentativas que foram necessárias para chegar à resposta correta. Exemplo:
*/
package com.mycompany.psc.exercicio04;
import java.util.*;

public class Questao05 {
    public static void main (String[] args){
        
        Scanner ler = new Scanner (System.in);
        Random numeroAleatorio = new Random(); 
        
        int numero, resposta, tentativas = 1;
        
        System.out.print("Bem-vindo ao Jogo da Adivinhação\n"
                + "Estou pensando em um número entre 1 e 100...\n\n");
        
        numero = numeroAleatorio.nextInt(100) + 1;
        
        System.out.print("Informe um número: ");
                resposta = ler.nextInt();

                
                while (true){
                
                    
                    if (resposta > 100 || resposta < 1){
                
                  System.out.print("Por favor, informe um número entre 1 e 100...\n"); 
                  System.out.print("Informe um número: ");
                        resposta = ler.nextInt();
                  
                    }else if (resposta < numero){
                    
                  System.out.print("Muito Baixo, tente novamente\n");  
                  System.out.print("Informe um número: ");
                        resposta = ler.nextInt();
                        
                        tentativas++;
                        
                    }else if (resposta > numero){
                    
                  System.out.print("Muito Alto, tente novamente\n");  
                  System.out.print("Informe um número: ");
                        resposta = ler.nextInt(); 
                        
                        tentativas++;
                        
                    }else if (resposta == numero){
                       
                   System.out.print("\nParabéns!!! Você acertou o número em "+tentativas+" tentativas!");     
                    
                        break; 
                   
                    }  
        }
    }
}

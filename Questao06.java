/*6 - Modifique o programa do Jogo de Adivinhação para que após cada tentativa, o programa deve informar ao usuário se o palpite é muito alto, muito baixo, ou correto. 
Uma vez que o usuário adivinhe o número corretamente, o programa perguntará se ele gostaria de jogar novamente. O usuário pode continuar jogando quantas vezes quiser até que escolha sair do jogo. 
Dica: use while(true).*/
package com.mycompany.psc.exercicio04;
import java.util.*;

public class Questao06 {
    public static void main (String[] args){
        
        Scanner ler = new Scanner (System.in);
        Random numeroAleatorio = new Random(); 
        
        int numero, resposta, tentativas = 1;
        
        System.out.print("Bem-vindo ao Jogo da Adivinhação\n"
                + "Estou pensando em um número entre 1 e 100...\n\n");
        
        numero = numeroAleatorio.nextInt(99) + 1;
               
        System.out.print("Informe um número: ");
            resposta = ler.nextInt(); 
            
                while (true){ 
                    
                    while (resposta == 9){ 
            
                  System.out.print("Bem-vindo ao Jogo da Adivinhação\n"
                        + "Estou pensando em um número entre 1 e 100...\n\n");
               
                  System.out.print("Informe um número: ");
                        resposta = ler.nextInt();
                        tentativas = 1;
                    
                    }
                    
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
                   System.out.println("\n\n0 - SAIR       9 - JOGAR NOVAMENTE");
                     resposta = ler.nextInt();     
                   
                        if (resposta == 0) {
                        
                        System.out.print("\nOBRIGADO POR JOGAR, ATÉ A PROXIMA!!!");
                        
                        break;
                        
                        }if (resposta == 9) {
                        
                        System.out.print("\nÓtimo vamos jogar novamente\n");
                        
                       
                        }while (resposta != 0 && resposta != 9){
                        
                        System.out.println("\n\nInforme um valor válido\n 0 - SAIR       9 - JOGAR NOVAMENTE");
                        resposta = ler.nextInt();
                        
                        }
                }          
        }
    }
}
   

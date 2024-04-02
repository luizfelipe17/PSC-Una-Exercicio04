/*4- Em um campeonato de LOL, enquanto não há a tomada de território, o 
contador implementado deve contar (que é contabilizado pelo jogo), o número de kills, deaths e assists. 
Se o número de kills for menor ou igual a 5, ele mostra a mensagem “noob”, se chegar a 20 ou mais “master”. 
Se o número de deaths chegar a 20 ou mais,  ele mostra a mensagem “Houston, we have a problem”. 
Se o número de assists chegar a 20 ou mais, é mostrada a mensagem: “team work”. 
Lembre-se, é uma rotina que continua enquanto não houver um vencedor.
Dicas: 
há kills, deaths e assists total e da rodada
medite na frase: enquanto não há um vencedor, faça…
pergunte a cada loop o número de cada medida comentada.
você deve perguntar se há um vencedor a cada loop…
 */
package com.mycompany.psc.exercicio04;

import java.util.Scanner;

public class Questao04 {

   public static void main(String[] args){
        
        Scanner ler = new Scanner (System.in);
        
        String resposta;
        int kills, deaths, assists, totalKills = 0, totalDeaths = 0, totalAssists = 0, rodada = 1;
        
        while (true){
            
            System.out.print("Informe os dados da "+rodada+"º rodada: ");
            System.out.print("\nKILLS: ");
            kills = ler.nextInt();
            System.out.print("DEATHS: ");
            deaths = ler.nextInt();
            System.out.print("ASSISTS: ");
            assists = ler.nextInt();
        
            totalKills += kills;
            totalDeaths += deaths;
            totalAssists += assists;
            
            if (totalKills <= 5){
                
                System.out.print("NOOB!!\n");
                
            }else if(totalKills >= 20){
                
                System.out.print("MASTER!!\n");
                
            }
            
            if (totalDeaths >= 20) {
                
                System.out.print("Houston, we have a problem\n");
                
            }
            
            if (totalAssists >= 20) {
                
                System.out.print("TEAM WORK\n");
                
            }
            
            rodada++;
               
            System.out.println("\nHouve algum vencendor? (Sim) (Nao)");
            resposta = ler.next();
            
            if (resposta.equalsIgnoreCase("Sim")){
                
                break;
                
            }else if (resposta.equalsIgnoreCase("Nao")){
                
                System.out.print("Vamos para a "+rodada+"º rodada\n\n");
                
            }else {
                
                System.out.print("\nInforme apenas 'SIM' ou 'NAO' ");
                
            }
            
        }
        
        
        
    }
}

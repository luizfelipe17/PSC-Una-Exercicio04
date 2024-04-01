/*11 - Na usina de Angra dos Reis, os técnicos analisam a perda de massa de um material radioativo. 
Sabendo-se que este perde 25% de sua massa a cada 30 segundos. Criar um programa que calcule iterativamente e imprima o tempo necessário para que a massa deste material se torne menor que 0,10 grama. 
O programa pode calcular o tempo para várias massas.*/
package com.mycompany.psc.exercicio04;

import java.util.Scanner;

public class Questao11 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double massa;
        int tempo, tempoSegundos, quantidadeTempo = 0;

        System.out.print("Informe a massa (KG): ");
        massa = ler.nextDouble();

        while (massa > 0.10) {

            massa = massa - (massa * 0.25);

            quantidadeTempo++;

        }

        tempo = (quantidadeTempo * 30) / 60;
        tempoSegundos = (quantidadeTempo * 30) % 60;

        System.out.print("Será nescessário " + tempo + " minutos e " + tempoSegundos + " segundos");

    }
}

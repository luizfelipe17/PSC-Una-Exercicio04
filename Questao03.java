/*3 - Faça um algoritmo que receba a idade, altura e peso de 10 pessoas. Calcule e mostre:
a) a quantidade de pessoas com idade superior a 50 anos;
b) a média das alturas das pessoas com idade entre 10 e 20 anos;
c) a porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas.
 */
package com.mycompany.psc.exercicio04;

import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int pessoas = 1, idade, contadorPessoas = 0, porcentagem = 0, pesoBaixo = 0, pessoasAltura = 0;
        double peso, altura, mediaAltura = 0, media;

        while (pessoas <= 10) {

            System.out.print("\nPessoa " + pessoas);
            System.out.print("\nIdade: ");
            idade = ler.nextInt();

            while (idade < 0 || idade > 120) {

                System.out.println("Infome uma idade válida");
                System.out.print("Idade: ");
                idade = ler.nextInt();

            }

            System.out.print("Altura (M): ");
            altura = ler.nextDouble();

            while (altura < 0 || altura > 2.50) {

                System.out.println("Infome uma altura válida");
                System.out.print("Altura (M): ");
                altura = ler.nextDouble();

            }

            System.out.print("Peso (KG): ");
            peso = ler.nextDouble();

            while (peso < 0 || peso > 400) {

                System.out.println("Infome um peso válido");
                System.out.print("Peso (KG): ");
                peso = ler.nextDouble();

            }

            pessoas++;

            if (idade > 50) {

                contadorPessoas++;

            } 
            
            if (idade >= 10 && idade <= 20) {

                pessoasAltura++;

                mediaAltura += altura;

            } 
            
            if (peso < 40) {

                pesoBaixo++;

                porcentagem = pesoBaixo * 10;

            }
        }

        media = mediaAltura / pessoasAltura;

        System.out.println("\nTemos "+contadorPessoas+" pessoa(s) com idade superior a 50 anos");
        System.out.printf("A média de altura das pessoas entre 10 e 20 anos é: %.2f",media);
        System.out.print("m");
        System.out.println("\nA porcentagem de pessoas com peso inferior a 40 quilos é de "+porcentagem + "%");
    }

}

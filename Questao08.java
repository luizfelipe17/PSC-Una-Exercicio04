/*8 - Escreva um programa em Java que calcule o produto de A (número real) por B (número inteiro), ou seja, A*B, por intermédio de adições sucessivas. 
Tanto A quanto B devem ser fornecidos pela pessoa utilizadora do programa.
 */
package com.mycompany.psc.exercicio04;

import java.util.Scanner;

public class Questao08 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int b;
        double a, soma = 0;

        System.out.print("Informe o valor de 'A': ");
        a = ler.nextDouble();
        System.out.print("Informe o valor de 'B': ");
        b = ler.nextInt();

        for (int quantidade = 0; quantidade < b; quantidade++) {

            soma += a;

        }

        System.out.printf("O resultado da operação é: %.2f", soma);

    }
}

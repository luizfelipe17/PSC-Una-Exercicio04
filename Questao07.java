/*7 - Crie um programa em Java que exiba formas geométricas na tela. 
Um menu deve ser exibido com as seguintes opções: retângulo, diagonal superior esquerda, diagonal superior direita, diagonal inferior esquerda, diagonal inferior direita. 
As imagens devem ser formadas por asteriscos (*) e, a pessoa utilizadora deve informar a quantidade de colunas. Abaixo estão alguns exemplos das formas:
 */
package com.mycompany.psc.exercicio04;

import java.util.Scanner;

public class Questao07 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int colunas = 0;
        String opcao = "";

        while (!opcao.equals("a")
                && !opcao.equals("b")
                && !opcao.equals("c")
                && !opcao.equals("d")
                && !opcao.equals("e")) {

            System.out.println("Seleciona umas das formulas abaixo: \n");
            System.out.println("a) RETÂNGULO");
            System.out.println("b) DIAGONAL SUPERIOR ESQUERDA");
            System.out.println("c) DIAGONAL SUPERIOR DIREITA");
            System.out.println("d) DIAGONAL INFERIOR ESQUERDA");
            System.out.println("e) DIAGONAL INFERIOR DIREITA");
            System.out.print("\nINFORME: ");
            opcao = ler.nextLine().toLowerCase();

            if (!opcao.equals("a")
                    && !opcao.equals("b")
                    && !opcao.equals("c")
                    && !opcao.equals("d")
                    && !opcao.equals("e")) {

                System.out.println("Informe um valor válido");

            }
        }

        while (colunas <= 0) {

            System.out.print("\nInforme o número de colunas: ");
            colunas = ler.nextInt();

        }

        for (int linha = 0; linha < colunas; linha++) {

            for (int coluna = 0; coluna < colunas; coluna++) {

                if (opcao.equals("a")
                        || (opcao.equals("b") && linha + coluna < colunas)
                        || (opcao.equals("c") && linha - coluna <= 0)
                        || (opcao.equals("d") && linha - coluna >= 0)
                        || (opcao.equals("e") && linha + coluna >= colunas - 1)) {

                    System.out.print("* ");
                    
                } else {

                    System.out.print("  ");

                }
            }

            System.out.println();
        }

    }
}

/*2 - Faça um programa que leia um número indeterminado de valores e mostre o valor lido, seu quadrado, seu cubo e sua raiz quadrada. 
Finalize a entrada com valor negativo ou zero.
*/
package psc.exercicio04;
import java.util.*;

public class Questao02 {
    public static void main(String[] args){
        
        Scanner ler = new Scanner (System.in);
        
        double valor, valorQuadrado, valorCubo, valorRaiz;
        
        System.out.print("Informe um valor: ");
            valor = ler.nextDouble();
            
            if (valor > 1){
                
                valorQuadrado = Math.pow(valor, 2);
                valorCubo = Math.pow(valor, 3);
                valorRaiz = Math.sqrt(valor);
                
                System.out.print("\nO valor informa "+valor+" possui:\n\n");
                System.out.printf(+valor+"²: %.2f",valorQuadrado);
                System.out.printf("\n"+valor+"³: %.2f",valorCubo);
                System.out.printf("\nRaiz "+valor+": %.2f",valorRaiz);
                
            }else{
                
                System.out.print("Informe um valor válido!!!");
                
            }
    }
}

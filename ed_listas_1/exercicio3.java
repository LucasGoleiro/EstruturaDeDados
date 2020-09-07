/*
 * 3. Carregar um vetor [100] inteiros positivos ou negativos. 
 * Classificar este vetor em ordem crescente e apresentar os valores.
 */

package ed_listas_1;

import java.util.Arrays;
import java.util.Random;

public class exercicio3 {

	public static void main(String[] args) {
		int array [] = new int [100];
		Random number = new Random();
		
		for (int i = 0; i < 100; i ++) {
			array[i] = number.nextInt((1000 - 1) + 1) + 1;
		}

        Arrays.sort(array);

        System.out.println("Numeros ordenados:");
        for(int numero : array)
            System.out.println(numero);
        System.out.println();

	}

}

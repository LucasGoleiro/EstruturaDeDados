/*
 * 4. Carregar uma matriz [4 x 4 inteiro]. Apresentar:
 Soma dos valores no intervalo de 1 a 100
 Quantidade de números ímpares entre 30 a 50
 Quantidade de números divisíveis por 8
 Quantidade de números ímpares divisíveis por 3
 Fatorial do maior número informado na matriz
 */

package ed_listas_1;

import java.util.Random;

import javax.swing.JOptionPane;

public class exercicio4 {

	public static void main(String[] args) {
		Random number = new Random();
		int[][] matriz = new int[4][4];
		int sum = 0;
		int numBetween = 0;
		int numDiv = 0;
		int numImpar = 0;
		int bigger = 0;
		
		matriz[0][0] = 1;
		matriz[0][1] = 1;
		matriz[0][2] = 1;
		matriz[0][3] = 1;
		matriz[1][0] = 1;
		matriz[2][0] = 1;
		matriz[3][0] = 1;
		matriz[3][3] = 1;
		matriz[3][2] = 1;
		matriz[2][2] = 1;
		
		
		for (int x = 0; x < 4; x ++) {
			for (int y = 0; y < 4; y ++) {
				matriz[x][y] = number.nextInt((10 - 1) + 1) + 1;
				sum += matriz[x][y];
				if (matriz[x][y] > bigger) {
					bigger = matriz[x][y];
				}
				if ( matriz[x][y] >= 30 && matriz[x][y] <= 50) {
					numBetween += 1;
				}
				if (matriz[x][y] % 8 == 0) {
					numDiv += 1;
				}
				if (matriz[x][y] % 3 == 0) {
					numImpar += 1;
				}
			}
		}
		
		JOptionPane.showMessageDialog(null, "A soma de todos os valores do array e: " + sum);
		JOptionPane.showMessageDialog(null, "A quantidade de numeros com valores entre 30 e 50 e: " + numBetween);
		JOptionPane.showMessageDialog(null, "A quantidade de numeros divisiveis por 8 e: " + numDiv);
		JOptionPane.showMessageDialog(null, "A quantidade de numeros impares e: " + numImpar);
		JOptionPane.showMessageDialog(null, "O maior numero e: " + bigger);

	}

}

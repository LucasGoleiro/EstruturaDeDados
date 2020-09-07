/*
 * 1. Carregar um vetor [100] real de valores de saldos. Calcular e exibir:
 Média dos saldos positivos entre 100 à 1000
 Média geral dos saldos
 Soma dos saldos negativos
 */

package ed_listas_1;

import java.util.Random;

import javax.swing.JOptionPane;

public class exercicio1 {

	public static void main(String[] args) {
		int array [] = new int [100];
		Random number = new Random();
		int between = 0;
		int values = 0;
		
		for (int i = 0; i < 100; i ++) {
			array[i] = number.nextInt((1000 - 1) + 1) + 1;
			if (array[i] > 100 && array[i] < 1000) {
				between += array[i];
			}
			values += array[i];
			System.out.println(array[i]);
		}
		
		JOptionPane.showMessageDialog(null, "A soma de todos os valores do array e: " + values);
		JOptionPane.showMessageDialog(null, "A soma dos valores entre 100 e 1000 e: " + between);

	}

}

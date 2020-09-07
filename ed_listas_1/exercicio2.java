/*
 * 2. Carregar um vetor [5] inteiro. Enviar cada elemento para uma função
 *  e esta irá retornar o seu fatorial que será armazenado em um outro vetor. Exibir os dados dos vetores
 */

package ed_listas_1;

import javax.swing.JOptionPane;

public class exercicio2 {

	public static void main(String[] args) {
		int array [] = new int [5];
		int arrayFat [] = new int [5];
		array[0] = 3;
		array[1] = 4;
		array[2] = 5;
		array[3] = 6;
		array[4] = 7;
		
		for (int i = 0; i < 5; i ++) {
			arrayFat[i] = fatorial(array[i]);
		}
		
		JOptionPane.showMessageDialog(null, "Array original: ");
		for(int i=0; i<array.length; i++){
			JOptionPane.showMessageDialog(null, array[i]);
		}
		
		JOptionPane.showMessageDialog(null, "Array de Fatoriais: ");
		for(int i=0; i<arrayFat.length; i++){
			JOptionPane.showMessageDialog(null, arrayFat[i]);
		}

	}
	
	public static int fatorial (int number) {
		int fat = 1;
		for (int i = 1;i <= number ;i ++) {
			fat *= i;
		     	}
		System.out.println(fat);
		return fat;
	}

}

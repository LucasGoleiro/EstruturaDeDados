/*
 * 5. Criar e carregar uma matriz [4 x 4] inteiro, onde os valores da diagonal principal 
 * serão carregados pela aplicação conforme o gráfico e os demais dados serão digitados pelo usuário
 */

package ed_listas_1;

import java.util.Random;

public class exercicio5 {

	public static void main(String[] args) {
		int matriz [][] = new int [4][4];
		
		Random valor = new Random();
		
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 4; c++) {
				matriz[l][c] = valor.nextInt(30) + 1;
				
				if(l == c) {
					if (l==0) {
						matriz[l][c] = 1;
						
					}
					if(l==1) {
						matriz[l][c] = 3;
					}
					if(l==2) {
						matriz[l][c] = 9;
					}
					if(l==3) {
						matriz[l][c] = 27;
						
					}
					
				}
			}
		}
		
		for (int l = 0; l < matriz.length; l++)  {  
		       for (int c = 0; c < matriz[0].length; c++)     { 
		           System.out.print(matriz[l][c] + " "); //imprime caracter a caracter
		       }  
		       System.out.println(" "); //muda de linha
		     }  

	}

}

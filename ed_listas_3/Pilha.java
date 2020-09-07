package ed_listas_3;

/*
 * Lucas Coelho dos Santos
 */

public class Pilha {
	private int pilha[];                  
	private int tamanho;                 

	public Pilha() {                       
		pilha=new int [10];                    
		tamanho=0;                            
	}
	
	public void AdicionaPilha(int elemento) {     

		if (tamanho < pilha.length) {
			pilha[tamanho] = elemento;                     
			tamanho ++;                            
		}
		else{
			System.out.println("Lista Cheia");    
		}
		
		System.out.println("Pilha:");
		for (int i = 0; i < pilha.length; i ++) {
			System.out.println(pilha[i]);
		}
		
	} 
	
	public int RemovePilha() {

		int retorno = 0;
		if (tamanho>=1){                              
			retorno=pilha[tamanho - 1];
			pilha[tamanho - 1] = 0;
			tamanho--;  
			
			System.out.println("Pilha:");
			for (int i = 0; i < pilha.length; i ++) {
				System.out.println(pilha[i]);
			}
		}
		else {
			System.out.println("Pilha j� est� vazia !");
		}
		
		return retorno;
	}

}

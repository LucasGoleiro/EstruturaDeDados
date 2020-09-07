package ed_listas_3;

/*
 * Lucas Coelho dos Santos
 */

public class PilhaLivros {
	private int tamanho;   
	private Livro[] livros;
	
	public PilhaLivros() {
		livros = new Livro[5];
		tamanho = 0;
	}
	
	public void AdicionaLivroPilha(String titulo, int quantidade) {
		if (tamanho < livros.length) {
			Livro livro = new Livro(titulo, quantidade);
			livros[tamanho] = livro;                     
			tamanho ++;
			
			for (int i = 0; i < tamanho; i ++) {
				System.out.println("Livro:  "+ livros[i].getTitulo() +" quantidade: "+ livros[i].getQuantidade());
			}
		}
		else{
			System.out.println("Pilha de livros cheia");    
		}
		
	}
	
	public void RemoveLivroPilha() {
		if (livros.length >= 1 && tamanho > 0) {
			
			livros[tamanho-1] = null;
			tamanho --;
			
			System.out.println("Livro removido do final da pilha");
			
		} else {
			
			System.out.println("Pilha de livros ja esta vazia");
			
		}
	}
	
	public void ExibirLivrosPilha() {
		for (int i = 0; i < tamanho; i ++) {
			System.out.println("Livro:  "+ livros[i].getTitulo() +" quantidade: "+ livros[i].getQuantidade());
		}
	}
}

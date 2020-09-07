package ed_listas_3;

public class FilaLivros {
	
	private int tamanho;   
	private Livro[] livros;
	
	public FilaLivros() {
		livros = new Livro[5];
		tamanho = 0;
	}
	
	public void AdicionaLivroFila(String titulo, int quantidade) {
		if (tamanho < livros.length) {
			Livro livro = new Livro(titulo, quantidade);
			livros[tamanho] = livro;                     
			tamanho ++;
			
			for (int i = 0; i < tamanho; i ++) {
				System.out.println("Livro:  "+ livros[i].getTitulo() +" quantidade: "+ livros[i].getQuantidade());
			}
		}
		else{
			System.out.println("Fila de livros cheia");    
		}
		
	}
	
	public Livro RemoveLivroFila() {
		Livro elemento = null;
		if (livros.length >= 1 && tamanho > 0) {
			
			
			elemento = livros[tamanho-1];
			livros[tamanho-1] = null;
			tamanho --;
			
			System.out.println("Livro removido do final da fila");
			
		} else {
			
			System.out.println("Fila de livros ja esta vazia");
			
		}
		
		return elemento;
	}
	
	public void ExibirLivrosFila() {
		for (int i = 0; i < tamanho; i ++) {
			System.out.println("Livro:  "+ livros[i].getTitulo() +" quantidade: "+ livros[i].getQuantidade());
		}
	}

}

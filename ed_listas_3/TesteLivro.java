package ed_listas_3;

/*
 * Lucas Coelho dos Santos
 */

import javax.swing.JOptionPane;

public class TesteLivro {

	public static void main(String[] args) {
		PilhaLivros livros = new PilhaLivros();
		FilaLivros livrosFila = new FilaLivros();
		int opc = 0;
		String titulo;
		int quantidade;
		Livro elemento;
		/*Livro livro = new Livro("The Mist", 2);
		
		System.out.println(livro.getTitulo() + "\n " + livro.getQuantidade()); */
		
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar Livro(Pilha) \n2 - Remove Livro(Pilha) "
					+ "\n3 - Exibir Livros(Pilha) \n4 - Adicionar Livro(Fila) \n5 - Remove Livro(Fila) \n6 - Exibir Livros(Fila)"));
			switch(opc) {
			case 1: titulo = JOptionPane.showInputDialog("Digite o titulo do livro");
					quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de exemplares"));
					livros.AdicionaLivroPilha(titulo, quantidade);
			break;
			case 2: livros.RemoveLivroPilha();
			break;
			case 3: livros.ExibirLivrosPilha();
			break;
			case 4: titulo = JOptionPane.showInputDialog("Digite o titulo do livro");
			quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de exemplares"));
			livrosFila.AdicionaLivroFila(titulo, quantidade);
			break;
			case 5: elemento = livrosFila.RemoveLivroFila();
					livros.AdicionaLivroPilha(elemento.getTitulo(), elemento.getQuantidade());
			break;
			case 6: livrosFila.ExibirLivrosFila();
			break;
			}
		}

		
	}

}

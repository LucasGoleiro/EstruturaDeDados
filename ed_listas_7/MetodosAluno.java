package ed_listas_7;

import javax.swing.JOptionPane;

public class MetodosAluno {
	private NoAluno inicio;
	private int tamanho;
	private Aluno[] dadosAluno;
	
	public MetodosAluno() {
		this.inicio = null;
	}
	
	public boolean estaVazia() {
		if (inicio == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void adicionaInicio(Aluno aluno) {
		NoAluno novoAluno = new NoAluno(aluno);
		
		if(this.inicio == null) {
			this.inicio = novoAluno;
		} else {
			novoAluno.proximo = this.inicio;
			this.inicio = novoAluno;
		}
		this.tamanho ++;
	}
	
	public void adicionaFinal(Aluno aluno) {
		NoAluno novoAluno = new NoAluno(aluno);
		
		if (inicio == null) {
			this.inicio = novoAluno;
		} else {
			NoAluno aux = BuscaUltimo(inicio);	
			novoAluno.anterior = aux;
			aux.proximo = novoAluno;
		}
	}
	
	public NoAluno BuscaUltimo(NoAluno aux) {
		if(aux.proximo!=null) {
			return BuscaUltimo(aux.proximo);
		}
		return aux;
	}
	
	public void removeInicio() {
		if (this.estaVazia()) {
			System.out.println("Lista vazia, portanto nao pode ser removido");
		} else {
			JOptionPane.showMessageDialog(null, "Aluno: " + inicio.aluno.getNome() + " removido");
			inicio = inicio.proximo;
			inicio.anterior = null;
		}
	}
	
	public void removeFinal() {
		if (this.estaVazia()) {
			System.out.println("Lista vazia, portanto nao pode ser removido");
		} else {
			NoAluno aux = BuscaUltimo(inicio);
			JOptionPane.showMessageDialog(null, "Aluno: " + aux.aluno.getNome() + " removido");
			NoAluno aux2 = aux.anterior;
			aux2.proximo = null;
			aux = null;
		}
	}
	
	public String mostraLista(NoAluno aux, String resultadoPesquisa, boolean primeiraExecucao) {
		if(primeiraExecucao){
			aux = inicio;
			primeiraExecucao=false;
		}
		
		if(aux != null) {
			resultadoPesquisa = resultadoPesquisa + "\n Aluno: " + aux.aluno.getNome();
			return mostraLista(aux.proximo, resultadoPesquisa, primeiraExecucao);
		}
		return resultadoPesquisa;
	}

}

package ed_listas_7;

import javax.swing.JOptionPane;

public class MetodosDisciplina {
	private NoDisciplina inicio;
	private int tamanho;
	private Disciplina[] dadosDisciplina;
	
	public MetodosDisciplina() {
		inicio = null;
	}
	
	public boolean estaVazia() {
		if (inicio == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void adicionaInicio(Disciplina disciplina) {
		NoDisciplina novaDisciplina = new NoDisciplina(disciplina);
		
		if(this.inicio == null) {
			this.inicio = novaDisciplina;
		} else {
			novaDisciplina.proximo = this.inicio;
			this.inicio = novaDisciplina;
		}
		this.tamanho ++;
	}
	
	public void adicionaFinal(Disciplina disciplina) {
		NoDisciplina novaDisciplina = new NoDisciplina(disciplina);
		
		if (inicio == null) {
			this.inicio = novaDisciplina;
		} else {
			NoDisciplina aux = BuscaUltimo(inicio);	
			novaDisciplina.anterior = aux;
			aux.proximo = novaDisciplina;
		}
	}
	
	public NoDisciplina BuscaUltimo(NoDisciplina aux) {
		if(aux.proximo!=null) {
			return BuscaUltimo(aux.proximo);
		}
		return aux;
	}
	
	public void removeInicio() {
		if (this.estaVazia()) {
			System.out.println("Lista vazia, portanto nao pode ser removido");
		} else {
			JOptionPane.showMessageDialog(null, "Aluno: " + inicio.disciplina.getNome() + " removido");
			inicio = inicio.proximo;
			inicio.anterior = null;
		}
	}
	
	public void removeFinal() {
		if (this.estaVazia()) {
			System.out.println("Lista vazia, portanto nao pode ser removido");
		} else {
			NoDisciplina aux = BuscaUltimo(inicio);
			JOptionPane.showMessageDialog(null, "Aluno: " + aux.disciplina.getNome() + " removido");
			NoDisciplina aux2 = aux.anterior;
			aux2.proximo = null;
			aux = null;
		}
	}
	

}

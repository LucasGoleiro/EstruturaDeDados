package ed_listas_7;

import javax.swing.JOptionPane;

public class MetodosMedia {
	private NoMedia inicio;
	private int tamanho;
	private Media[] dadosDisciplina;
	
	public MetodosMedia() {
		inicio = null;
	}
	
	public boolean estaVazia() {
		if (inicio == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void adicionaInicio(Media media) {
		NoMedia novaMedia = new NoMedia(media);
		
		if(this.inicio == null) {
			this.inicio = novaMedia;
		} else {
			novaMedia.proximo = this.inicio;
			this.inicio = novaMedia;
		}
		this.tamanho ++;
	}
	
	public void adicionaFinal(Media media) {
		NoMedia novaMedia = new NoMedia(media);
		
		if (inicio == null) {
			this.inicio = novaMedia;
		} else {
			NoMedia aux = BuscaUltimo(inicio);	
			novaMedia.anterior = aux;
			aux.proximo = novaMedia;
		}
	}
	
	public NoMedia BuscaUltimo(NoMedia aux) {
		if(aux.proximo!=null) {
			return BuscaUltimo(aux.proximo);
		}
		return aux;
	}
	
	
	public void removeInicio() {
		if (this.estaVazia()) {
			System.out.println("Lista vazia, portanto nao pode ser removido");
		} else {
			inicio = inicio.proximo;
			inicio.anterior = null;
		}
	}
	
	public void removeFinal() {
		if (this.estaVazia()) {
			System.out.println("Lista vazia, portanto nao pode ser removido");
		} else {
			NoMedia aux = BuscaUltimo(inicio);
			NoMedia aux2 = aux.anterior;
			aux2.proximo = null;
			aux = null;
		}
	}
}

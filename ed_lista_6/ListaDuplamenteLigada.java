package ed_lista_6;

public class ListaDuplamenteLigada {
	private No inicio;
	private int tamanho;
	private Aluno[] dadosAluno;

	public ListaDuplamenteLigada(){
		inicio=null;
	}
	
	public boolean estaVazia() {
		if (inicio == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void adicionaInicio(Aluno aluno) {
		No novoAluno = new No(aluno);
		
		if(this.inicio == null) {
			this.inicio = novoAluno;
		} else {
			novoAluno.proximo = this.inicio;
			this.inicio = novoAluno;
		}
		this.tamanho ++;
	}
	
	public void adicionaFinal(Aluno aluno) {
		No novoAluno = new No(aluno);
		
		if (inicio == null) {
			this.inicio = novoAluno;
		} else {
			No aux = BuscaUltimo(inicio);		
			aux.proximo = novoAluno;
		}
	}
	
	public No BuscaUltimo(No aux){
		if(aux.proximo!=null){
			return BuscaUltimo(aux.proximo);
		}
		return aux;
	}
	
	public String mostraLista(No aux, String resultadoPesquisa, boolean primeiraExecucao) {
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

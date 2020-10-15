package ed_listas_6;

public class No {
	public Aluno aluno;
	public No proximo;
	public No anterior;

	public No(Aluno aluno){
		this.aluno = aluno;
		this.anterior = null;
		this.proximo = null;
	}
}

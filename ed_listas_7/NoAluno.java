package ed_listas_7;

public class NoAluno {
	public Aluno aluno;
	public NoAluno proximo;
	public NoAluno anterior;

	public NoAluno(Aluno aluno){
		this.aluno = aluno;
		this.anterior = null;
		this.proximo = null;
	}

}

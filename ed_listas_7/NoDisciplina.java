package ed_listas_7;

public class NoDisciplina {
	public Disciplina disciplina;
	public NoDisciplina proximo;
	public NoDisciplina anterior;

	public NoDisciplina(Disciplina disciplina){
		this.disciplina = disciplina;
		this.anterior = null;
		this.proximo = null;
	}

}

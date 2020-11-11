package ed_listas_7;

public class Media {
	private int idAluno;
	private int idDisciplina;
	private int mediaFinal;
	
	public Media(int idAluno, int idDisciplina, int mediaFinal) {
		this.idAluno = idAluno;
		this.idDisciplina = idDisciplina;
		this.mediaFinal = mediaFinal;
	}

	public int getIdAluno() {
		return this.idAluno;
	}

	public int getIdDisciplina() {
		return this.idDisciplina;
	}

	public int getMediaFinal() {
		return this.mediaFinal;
	}

}

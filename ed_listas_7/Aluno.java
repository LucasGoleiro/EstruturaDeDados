package ed_listas_7;

import java.util.Random;

public class Aluno {
	private int id;
	private String nome;
	private String curso;
	private int semestre;
	Random gerador = new Random();
	
	public Aluno(String nome, String curso, int semestre) {
		this.id = gerador.nextInt(1000);
		this.nome = nome;
		this.curso = curso;
		this.semestre = semestre;
	}

	public int getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}

	public String getCurso() {
		return this.curso;
	}

	public int getSemestre() {
		return this.semestre;
	}
}

package ed_listas_7;

import java.util.Random;

public class Disciplina {
	private int id;
	private String nome;
	Random gerador = new Random();
	
	public int getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}

	public Disciplina(String nome) {
		this.id = gerador.nextInt(1000);
		this.nome = nome;
	}

}

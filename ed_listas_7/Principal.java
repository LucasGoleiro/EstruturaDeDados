package ed_listas_7;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int opc = 0;
		int sistema;
		MetodosAluno listaAluno = new MetodosAluno();
		MetodosDisciplina listaDisciplina = new MetodosDisciplina();
		
		sistema = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastro de Aluno \n2 - Cadastro de Disciplina \n3 - Cadastro de Media"));
		
		if (sistema == 1) {
			while (opc != 99) {
				String nome;
				String curso;
				int semestre;
				Aluno aluno;
				
				opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Adiciona inicio \n2 - Adiciona final \n3 - Remove inicio \n4 - Remove final \n99 - Sair"));
				
				switch(opc) {
				case 1: nome = JOptionPane.showInputDialog("Nome do aluno:");
						curso = JOptionPane.showInputDialog("Curso do aluno:");
						semestre = Integer.parseInt(JOptionPane.showInputDialog("Semestre do aluno: "));
						aluno = new Aluno(nome, curso, semestre);
						listaAluno.adicionaInicio(aluno);
				break;
				
				case 2: nome = JOptionPane.showInputDialog("Nome do aluno:");
				curso = JOptionPane.showInputDialog("Curso do aluno:");
				semestre = Integer.parseInt(JOptionPane.showInputDialog("Semestre do aluno: "));
				aluno = new Aluno(nome, curso, semestre);
				listaAluno.adicionaFinal(aluno);
				break;
				
				case 3: listaAluno.removeInicio();
				break;
				
				case 4: listaAluno.removeFinal();
				break;
				
				case 99: System.exit(0);
				break;
				}
			}
		} else if(sistema == 2) {
			String nome;
			Disciplina disciplina;
			
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Adiciona inicio \n2 - Adiciona final \n3 - Remove inicio \n4 - Remove final \n99 - Sair"));
			
			switch(opc) {
			case 1: nome = JOptionPane.showInputDialog("Nome da disciplina:");
			disciplina = new Disciplina(nome);
			listaDisciplina.adicionaInicio(disciplina);
			break;
	
			case 2: nome = JOptionPane.showInputDialog("Nome da disciplina:");
			disciplina = new Disciplina(nome);
			listaDisciplina.adicionaFinal(disciplina);
			break;
			
			case 3: listaDisciplina.removeInicio();
			break;
			
			case 4: listaDisciplina.removeFinal();
			break;
			
			case 99: System.exit(0);
			break;
			}
		}
		

	}

}

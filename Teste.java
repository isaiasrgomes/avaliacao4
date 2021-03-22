import java.util.ArrayList;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Turma> turmas = new ArrayList<Turma>();
		int opcao = -1;
		while (opcao != 0) {
			System.out.println("+--------------------------------+");
			System.out.println("|              Menu              |");
			System.out.println("+--------------------------------+");
			System.out.println("| 1- Cadastrar Turma Médio       |");
			System.out.println("| 2- Cadastrar Turma Superior    |");
			System.out.println("| 3- Listar Turmas               |");
			System.out.println("| 4- Matricular Aluno            |");
			System.out.println("| 5- Lançar Notas                |");
			System.out.println("| 6- Listar Alunos por Turma     |");
			System.out.println("| 7- Listar Aprovados por Turma  |");
			System.out.println("| 8- Listar Reprovados por Turma |");
			System.out.println("| 0- Sair do Programa            |");
			System.out.println("+--------------------------------+");
			System.out.println("\n");

			System.out.println("Digite a sua opção: ");

			opcao = s.nextInt();
			if (opcao == 1) {
				System.out.println("+--------------------------------+");
				System.out.println("|========== Nova Turma ==========|");
				System.out.println("+--------------------------------+");
				System.out.println("\nDigite o código da turma: ");
				Turma turma = new Turma(s.next());
				System.out.println("\nDigite o nome da turma: ");
				String nome = s.next();
				turma.setNome(nome);
				turmas.add(turma);
				System.out.println("\nTurma adicionada com sucesso!!!");
				System.out.println("\n");

			} else if (opcao == 2) {
				System.out.println("+---------------------------------+");
				System.out.println("|====== Nova Turma Superior ======|");
				System.out.println("+---------------------------------+");
				System.out.println("\nDigite o código da turma: ");
				String codigo = s.next();
				System.out.println("\nDigite o nome da turma: ");
				String nome = s.next();
				System.out.println("\nDigite a Quantidade de Horas de estágio: ");
				int hrs = s.nextInt();
				TurmaSuperior ts = new TurmaSuperior(codigo, hrs);
				ts.setNome(nome);
				turmas.add(ts);
				System.out.println("Turma adicionada com sucesso!!!");
				System.out.println("\n");

			} else if (opcao == 3) {
				System.out.println("+---------------------------------+");
				System.out.println("|======== Lista de Turmas ========|");
				System.out.println("+---------------------------------+");
				System.out.println("\n");
				for (int i = 0; i < turmas.size(); i++) {
					System.out.println(turmas.get(i));
				}
			} else if (opcao == 4) {
				System.out.println("+--------------------------------+");
				System.out.println("|========== Novo Aluno ==========|");
				System.out.println("+--------------------------------+");
				System.out.println("\nDigite a matricula do aluno");
				String matricula = s.next();
				Aluno a1 = new Aluno(matricula);
				System.out.println("Digite o nome: ");
				a1.setNome(s.next());
				System.out.println("Digite o código da turma: ");
				String codigo = s.next();
				Turma c = new Turma(codigo);
				for (int i = 0; i < turmas.size(); i++) {
					if (turmas.contains(c)) {
						turmas.get(i).adiciona(a1);
						System.out.println("Aluno matriculado com sucesso!\n");
					} else {
						System.out.println("Codigo de turma não encontrado\n");
					}
				}
			} else if (opcao == 5) {
				
				System.out.println("Digite a matricula do Aluno: ");
				String matricula = s.next();
				Aluno m = new Aluno(matricula);
				for (int i = 0; i < turmas.size(); i++) {
					if (turmas.get(i).alunos.contains(m)) {
						
						System.out.println("Digite a Primeira nota: ");
						double n1 = s.nextDouble();
						System.out.println("Digite a Segunda nota: ");
						double n2 = s.nextDouble();
						System.out.println("Digite a Terceira nota: ");
						double n3 = s.nextDouble();
						System.out.println("Digite a Quarta nota: ");
						double n4 = s.nextDouble();

						turmas.get(i).getAlunos().get(i).setN1(n1);
						turmas.get(i).getAlunos().get(i).setN2(n2);
						turmas.get(i).getAlunos().get(i).setN3(n3);
						turmas.get(i).getAlunos().get(i).setN4(n4);
						
						System.out.println("Nota 1: " + turmas.get(i).getAlunos().get(i).getN1());
						System.out.println("Nota 2: " + turmas.get(i).getAlunos().get(i).getN2());
						System.out.println("Nota 3: " + turmas.get(i).getAlunos().get(i).getN3());
						System.out.println("Nota 4: " + turmas.get(i).getAlunos().get(i).getN4());
					} else {
						System.out.println("Matricula não encontrada!");
					}
					System.out.println("\n");
				}

			} else if (opcao == 6) {
				System.out.println("Digite o codigo da turma: ");
				String codigo = s.next();
				Turma c = new Turma(codigo);
				for (int i = 0; i < turmas.size(); i++) {
					if (turmas.contains(c)) {
						turmas.get(i).frequencia();
					} else {
						System.out.println("Turma não encontrada");
					}
					System.out.println("\n");
				}
			} else if (opcao == 7) {
				System.out.println("Digite o código da turma: ");
				String codigo = s.next();
				Turma c = new Turma(codigo);
				for (int i = 0; i < turmas.size(); i++) {
					if (turmas.contains(c)) {
						System.out.println(turmas.get(i).aprovados());
					} else {
						System.out.println("C�digo de turma incorreto");
					}

				}
			} else if (opcao == 8) {
				System.out.println("Digite o código da turma: ");
				String codigo = s.next();
				Turma c = new Turma(codigo);
				for (int i = 0; i < turmas.size(); i++) {
					if (turmas.contains(c)) {
						System.out.println(turmas.get(i).reprovados());
					} else {
						System.out.println("Código de turma incorreto");
					}
				}
			} else if (opcao == 0) {
				System.out.println("Saindo do programa....");
			} else {
				System.out.println("Opção invalida");
			}
		}
		s.close();
	}
}

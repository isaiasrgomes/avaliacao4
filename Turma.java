import java.util.ArrayList;

public class Turma {
	protected String codigo;
	protected String nome;
	public ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	private ArrayList<Aluno> aprovados = new ArrayList<Aluno>();
	private ArrayList<Aluno> reprovados = new ArrayList<Aluno>();

	public Turma(String codigo) {
		this.codigo = codigo;
	}

	public void frequencia() {
		for (int i = 0; i < alunos.size(); i++) {
			System.out.println(alunos.get(i));
		}
	}

	public ArrayList<Aluno> aprovados() {
		for (Aluno aluno : this.alunos) {
			if (aluno.aprovado()) {
				this.aprovados.add(aluno);
			}
		}
		return this.aprovados;
	}

	public ArrayList<Aluno> reprovados() {
		for (Aluno aluno : this.alunos) {
			if (aluno.aprovado() == false) {
				this.reprovados.add(aluno);
			}
		}
		return this.reprovados;
	}

	public void adiciona(Aluno aluno) {
		this.alunos.add(aluno);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	@Override
	public String toString() {
		return this.getNome();
	}

	@Override
	public boolean equals(Object obj) {
		Turma t = (Turma) obj;
		if (this.codigo.equals(t.codigo)) {
			return true;
		}
		return false;
	}
}

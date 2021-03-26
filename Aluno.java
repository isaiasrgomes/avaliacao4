

public class Aluno {
	private String matricula;
	private String nome;
	private double n1, n2, n3, n4;

	public Aluno( String matricula) {
		this.matricula = matricula;
	
	}

	public void media() {
		double media = (this.n1 + this.n2 + this.n3 + this.n4) / 4;
		System.out.println("A m�dia do aluno � = " + media);
	}

	public boolean aprovado() {
		double media = (this.n1 + this.n2 + this.n3 + this.n4) / 4;
		return media >= 6;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double getN3() {
		return n3;
	}

	public void setN3(double n3) {
		this.n3 = n3;
	}

	public double getN4() {
		return n4;
	}

	public void setN4(double n4) {
		this.n4 = n4;
	}

	@Override
	public String toString() {
		return this.getNome();
	}

	@Override
	public boolean equals(Object obj) {
		Aluno a = (Aluno) obj;
		if (this.matricula.equals(a.matricula)) {
			return true;
		}
		return false;
	}
}
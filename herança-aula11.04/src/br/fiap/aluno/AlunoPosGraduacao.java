package br.fiap.aluno;

public class AlunoPosGraduacao extends Aluno {
	public double calcularMedia() {
		double media = (getProva1() + getProva2()) / 2;
		return media;
	}
}

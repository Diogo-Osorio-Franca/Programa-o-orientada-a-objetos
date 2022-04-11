package br.fiap.aluno;

public class AlunoFundamental extends Aluno {
private int serie;
	

public double calcularMedia() {
	double media = (getProva1() + getProva2()) / 2;
	return media;
}
}

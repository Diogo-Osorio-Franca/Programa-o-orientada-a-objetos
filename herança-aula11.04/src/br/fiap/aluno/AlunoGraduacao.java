package br.fiap.aluno;

public class AlunoGraduacao extends Aluno{
private String curso;
private double trabalho;


public double calcularMedia() {
	double media = (getProva1() + getProva2()) / 2;
	return media;
}
}

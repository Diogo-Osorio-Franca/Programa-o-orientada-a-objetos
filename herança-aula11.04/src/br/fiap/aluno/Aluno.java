package br.fiap.aluno;

public abstract class Aluno {

	private long rm;
	private double prova1, prova2;
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getProva1() {
		return prova1;
	}
	public void setProva1(double prova1) {
		this.prova1 = prova1;
	}
	public double getProva2() {
		return prova2;
	}
	public void setProva2(double prova2) {
		this.prova2 = prova2;
	}
	public long getRm() {
		return rm;
	}
	public void setRm(long rm) {
		this.rm = rm;
	}
}

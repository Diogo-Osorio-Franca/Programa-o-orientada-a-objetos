import java.util.Random;

import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.*;

public class BilheteUnico {
	int numero;
	double saldo;
	static double valorDaPassagem = 4.40;
	Usuario usuario;

	public BilheteUnico(String nome, String cpf, String tipo) {
		Random random = new Random();

		this.numero = random.nextInt(10000);
		this.saldo = 0;
		this.usuario = new Usuario(nome, cpf, tipo);
	}

	public double ConsultaSaldo() {
		return saldo;
	}

	public void passarCatraca() {
		if (saldo >= valorDaPassagem) {
			if (usuario.tipo.equalsIgnoreCase("Estudante") || usuario.tipo.equalsIgnoreCase("Professor")) {
				saldo = saldo - (valorDaPassagem / 2);}
				else {saldo-=valorDaPassagem;}}
	}
	public void CarregarSaldo(double valor) {
		valor = Double.parseDouble(showInputDialog("Digite o valor a ser depositado: "));
		saldo+=valor;
	}
}

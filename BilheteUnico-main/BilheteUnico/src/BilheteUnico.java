import java.util.Random;

public class BilheteUnico {
	int numero;
	double saldo;
	static double valorDaPassagem = 4.40;
	Usuario usuario;

	public BilheteUnico(String nome, String cpf, String tipo) {
		Random random = new Random();

		numero = random.nextInt(10000);
		usuario = new Usuario(nome, cpf, tipo);
	}

	public double ConsultaSaldo() {
		return saldo;
	}
}

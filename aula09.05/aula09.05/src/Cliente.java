
public class Cliente extends Pessoa {

public Cliente(double valorDaDivida,String nome, String cpf) {
	super(nome, cpf);
	this.valorDaDivida = valorDaDivida;
}

private double valorDaDivida;
}

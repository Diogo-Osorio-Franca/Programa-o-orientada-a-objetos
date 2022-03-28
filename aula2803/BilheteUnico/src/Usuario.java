import static javax.swing.JOptionPane.*;

public class Usuario {
	String nome, cpf, tipo;
	double tarifa = 4.40;
	BilheteUnico[] bilhete = new BilheteUnico[5];

	public void menuUsuario() {
		int opcao = Integer.parseInt(showInputDialog(
				"digite 1 para consultar saldo, 2 para adicionar saldo, 3 para passar na catraca ou qualquer outro número pra finalizar"));
		{
			if (opcao == 1) {
				ConsultarSaldo();
			} else {
				if (opcao == 2) {
					AdicionarSaldo();
				} else {
					if (opcao == 3) {
						PassarCatraca();
					}
					else {
						showMessageDialog(null, "opção invalida");
						Main.main(null);
					}
				}
			}
		}
	}

	private void PassarCatraca() {
		cpf = showInputDialog("Digite o CPF: ");
		if (pesquisar(cpf) != -1) {

			if (bilhete[pesquisar(cpf)].saldo >= tarifa) {
				bilhete[pesquisar(cpf)].saldo -= tarifa;
			} else {
				showMessageDialog(null, "Saldo insuficiente");
				menuUsuario();
			}
		}

	}

	public Usuario(String nome, String cpf, String tipo) {
		this.nome = nome;
		this.cpf = cpf;
		this.tipo = tipo;
	}

	public int pesquisar(String cpf) {
		int aux = -1;
		for (int i = 0; i < bilhete.length; i++) {
			if (bilhete[i].usuario.cpf.equals(cpf)) {
				aux = i;
				break;
			}
		}
		return aux;
	}

	public void ConsultarSaldo() {
		cpf = showInputDialog("Digite o CPF: ");
		if (pesquisar(cpf) != -1) {
			showMessageDialog(null, "saldo do bilhete: " + bilhete[pesquisar(cpf)].saldo);
			menuUsuario();
		} else {
			showMessageDialog(null, "CPF não encontrado");
			ConsultarSaldo();
		}
	}

	public void AdicionarSaldo() {
		cpf = showInputDialog("Digite o CPF: ");
		if (pesquisar(cpf) != -1) {
			showMessageDialog(null, "saldo do bilhete: " + bilhete[pesquisar(cpf)].saldo);
			bilhete[pesquisar(cpf)].saldo += Double.parseDouble(("Digite o valor a ser adicionado ao saldo: "));
			menuUsuario();
		}
	}
}

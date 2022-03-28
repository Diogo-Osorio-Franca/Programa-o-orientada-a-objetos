import static javax.swing.JOptionPane.*;

import javax.swing.JOptionPane;

public class ADM {

	BilheteUnico[] bilhete = new BilheteUnico[5];

	public void menuAdm() {
		int opcao = Integer.parseInt(showInputDialog(
				"digite 1 para cadastrar um usuário, 2 para consultar um usuário ou qualquer outro número pra finalizar"));
		{
			if (opcao == 1) {
				criarUsuario();
			} else {
				if (opcao == 2) {
					ConsultarUsuario();
				} else {
					Main.main(null);
				}
			}
		}
	}

	public void criarUsuario() {
		int cont = 0;
		while (cont >= 0) {
			String nome = showInputDialog("Digite o nome do " + (cont + 1) + "º usuário: ");
			String cpf = showInputDialog("Digite o CPF do " + (cont + 1) + "º usuário: ");
			String tipo = showInputDialog("Digite o tipo do " + (cont + 1) + "º usuário: ");
			bilhete[cont] = new BilheteUnico(nome, cpf, tipo);
			int botao = showConfirmDialog(null, "Deseja cadastrar outro usuário? ");
			if (botao == 0) {
				cont++;
			} else {
				menuAdm();
				break;
			}
		}

	}

	public void ConsultarUsuario() {
		String cpfConsulta = showInputDialog("Digite o CPF do usuário a ser procurado: ");
		int cont = 0;
		while (cont < 5) {
			if (cpfConsulta.equalsIgnoreCase(bilhete[cont].usuario.cpf) && (this.bilhete[cont] != null))
			{
				showMessageDialog(null, "Nome do usuário: " + bilhete[cont].usuario.nome);
				showMessageDialog(null, "Tipo do usuário: " + bilhete[cont].usuario.tipo);
				showMessageDialog(null, "saldo: " + bilhete[cont].saldo);
			}
			cont++;
		}
		menuAdm();
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

}

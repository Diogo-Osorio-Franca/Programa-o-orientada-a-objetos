import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// javax.swing.JOptionPane.showMessageDialog(null, "Bom Dia");
		// JOptionPane.showMessageDialog(null, "bom dia","Minha Janela", 0)
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número: "));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número: "));
		JOptionPane.showMessageDialog(null, "Soma das notas:" + (valor1 + valor2));
		Scanner entrada = new Scanner(System.in);

		String nome, tipo, cpf;

		nome = JOptionPane.showInputDialog("Digite o nome: ");
		cpf = JOptionPane.showInputDialog("Digite o cpf: ");
		tipo = JOptionPane.showInputDialog("Digite o tipo: ");

		BilheteUnico bilhete1 = new BilheteUnico(nome, cpf, tipo);

		System.out.println("Saldo: " + bilhete1.ConsultaSaldo());

		entrada.close();
	}

}

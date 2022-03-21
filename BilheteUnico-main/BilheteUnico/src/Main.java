import static javax.swing.JOptionPane.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
    
	public static void main(String[] args) {
		Usuario usuario = new Usuario(null, null, null);
        ADM adm = new ADM();
		Scanner entrada = new Scanner(System.in);
		

		int botao = JOptionPane.showConfirmDialog(null, "É administrador?");
	    if (botao==0) {
	    	adm.menuAdm();
	    }
	    else {
	    	//usuario
	    }
		
		String nome = usuario.nome, tipo = usuario.tipo, cpf = usuario.cpf;
		BilheteUnico bilhete1 = new BilheteUnico(nome, cpf, tipo);

		entrada.close();
	}

}

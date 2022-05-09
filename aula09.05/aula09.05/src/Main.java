import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// TODO Auto-generated method stub
		int op = 0;
		while (op < 7) {
			System.out.println("Escolha uma operação:\r\n" + "1. Cadastrar Empregado\r\n" + "2. Cadastrar Cliente\r\n"
					+ "3. Pesquisar\r\n" + "4. Listar Empregados\r\n" + "5. Listar Clientes\r\n" + "6. Remover\r\n"
					+ "7. Finalizar ");
			op = entrada.nextInt();
			switch (op) {
			case 1:
				ArrayList<Empregado> listaEmpregados = new ArrayList<>();
				System.out.println("Digite 1 para Gerente e 2 para vendedor: ");
				int a = entrada.nextInt();
				if (a == 1) {
					System.out.println("Digite o nome e o cpf do gerente");
					listaEmpregados.add(new Gerente(entrada.next(), entrada.next(), null, 0, 0));
				}
				else {
					System.out.println("Digite o nome e o cpf do vendedor");
					listaEmpregados.add(new Gerente(entrada.next(), entrada.next(), null, 0, 0));
				}
				
				
				
			case 2:
				ArrayList<Cliente> listaClientes = new ArrayList<>();
				System.out.println("Digite o nome do e o cpf do cliente: ");
				listaClientes.add(new Cliente(0,entrada.next(), entrada.next()));
				
			case 3:
				
			
				
			case 4:
				
				
				
				
			case 5:
				
				
				
			case 6:
					
		}

	}
}}

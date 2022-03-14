import java.util.Scanner;
public class Aluno {

	String nome;
	int rm;

public static void iniciar(String nome, int rm) {
	Scanner entrada = new Scanner(System.in);
	int cont = 0;
	System.out.println("Digite o nome do aluno: ");
	nome = entrada.next();
	System.out.println("Digite o RM do aluno: ");
	rm = entrada.nextInt();
}}

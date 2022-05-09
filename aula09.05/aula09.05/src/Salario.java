
public interface Salario {

	public static double calcularSalario(double totalDeVendas, double comissao) {
		return totalDeVendas * (comissao/100);
	}
}

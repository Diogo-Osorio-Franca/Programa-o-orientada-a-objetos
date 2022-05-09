
public class Vendedor extends Empregado implements Salario {

	public Vendedor(String nome, String cpf,String matricula,double comissao, double totalDeVendas) {
		super(nome, cpf);
		// TODO Auto-generated constructor stub
	}
public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
public double getTotalDasVendas() {
		return totalDasVendas;
	}
	public void setTotalDasVendas(double totalDasVendas) {
		this.totalDasVendas = totalDasVendas;
	}
private double totalDasVendas,comissao;
}

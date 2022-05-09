
public class Gerente extends Empregado implements Bonus {

	public Gerente(String nome, String cpf, String matricula, double salario, double bonus) {
		super(nome, cpf);
		// TODO Auto-generated constructor stub
	}
public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
private double salario,bonus;
}

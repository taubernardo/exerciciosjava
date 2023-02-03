package entities;

public class Funcs {
	
	public String name;
	public double salarioBruto;
	public double taxa;
	
	public double SalarioLiq() {
		return salarioBruto - taxa;
	}
	
	public void aumentoSalario (double porcentagem) {
		salarioBruto += salarioBruto * porcentagem / 100.0;
	}
	
	public String toString() {
		return name + ", $" + String.format("%.2f", SalarioLiq());
	}
	

}

package entities;

public class Notas {
	
	public String name;
	public double a;
	public double b;
	public double c;
	
	
	
	public double Final() {
		return (a + b + c);
		}
	
	public double faltaPonto() {
		if (Final() < 60.0) {
			return 60.0 - Final();
		} else {
			return 0.0;
		}
		
	}
	
	
	

}

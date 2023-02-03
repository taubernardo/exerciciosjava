import java.util.Locale;
import java.util.Scanner;

public class leitura_valor {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		
		
		if ( x < 0.0 || x > 100.00 ) {
			System.out.println("Fora de intervalo");
		} else if (x <= 25) {
			System.out.println("[0,25]");
		} else if (x <= 50) {
			System.out.println("(25,50]");
		} else if (x <= 75.00) {
			System.out.println("(50,75]");
		} else {
			System.out.println("(75,100]");
		}
		
		sc.close();
		
		
	}

}

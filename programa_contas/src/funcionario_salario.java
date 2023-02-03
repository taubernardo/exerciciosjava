import java.util.Locale;
import java.util.Scanner;

public class func_salario {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		
		Scanner sc = new Scanner(System.in);
		
				
		int numero = sc.nextInt();
		int horas = sc.nextInt();
		double salariohora = sc.nextDouble();
		double salario = horas * salariohora;
		
		System.out.printf("NUMBER = %d%n", numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
		
		
		
		
		
		
	}

}

import java.util.Locale;
import java.util.Scanner;

public class calculadora_somaint {
	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int soma = n1 + n2;
		
		System.out.printf("A soma dos números inteiros são: %d%n", soma) ;
		
		sc.close();
		
		
	}
	

}

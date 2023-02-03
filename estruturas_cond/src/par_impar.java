import java.util.Scanner;

public class par_impar {
	
	public static void main(String[] args) {
		System.out.println("Digite o número: ");
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("Número par!");
		} else {
			System.err.println("Número ímpar!");
		}
		
		sc.close();
	}

}

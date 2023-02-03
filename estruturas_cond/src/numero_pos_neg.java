import java.util.Scanner;

public class numero_pos_neg {
	
	public static void main(String[] args) {
		
		System.out.println("Digite o número: ");
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if (x < 0) {
			System.out.println("Número negativo!");
		}
		else {
			System.out.println("Número positivo!");
		}
		
		sc.close();
		
	}

}

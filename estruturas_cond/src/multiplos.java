import java.util.Scanner;

public class multiplos {
	
	public static void main(String[] args) {
		System.out.println("Digite A e B:");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if ( a % b == 0 || b % a == 0) {
			System.out.println("São Multiplos!");
		} else {
			System.out.println("Não Multiplos!");
		}
		
		sc.close();
		
	}
	

}

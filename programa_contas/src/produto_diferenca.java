import java.util.Scanner;

public class produto_diferenca {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int produto = (a*b) - (c*d);
		
		System.out.printf("A diferença do produto é: %d%n", produto);
		
		sc.close();
		
		
		
	}

}

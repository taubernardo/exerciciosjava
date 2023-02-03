import java.util.Scanner;

public class sequencia_fibonacci {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int aux;
		
		for (int i=0; i<n; i++) {
			System.out.print(a+ " ");
			aux = a;
			a += b;
			b = aux;
		}
		
		sc.close();
	}

}



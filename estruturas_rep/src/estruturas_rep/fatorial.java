package estruturas_rep;

import java.util.Locale;
import java.util.Scanner;

public class fatorial {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fat = 1;
		
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		
		sc.close();
	}
	

}

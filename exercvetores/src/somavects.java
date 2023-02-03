import java.util.Locale;
import java.util.Scanner;

public class somavects {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] vecta = new int[n];
		int[] vectb = new int[n];
		int[] vectc = new int[n];
		
		System.out.println("Digite os valores do vetor A: ");
		for (int i=0; i<n; i++) {
			vecta[i] = sc.nextInt();
		}
		System.out.println("Digite os valores do vetor B: ");
		for (int i=0; i<n; i++) {
			vectb[i] = sc.nextInt();
		}
			
		for (int i=0; i<n; i++) {
			vectc[i] = vecta[i] + vectb[i];
		}
			
		System.out.println("VETOR RESULTANTE: ");
		for (int i=0; i<n; i++) {
			System.out.printf("%d\n", vectc[i]);
		}
		
		
		sc.close();
	}

}

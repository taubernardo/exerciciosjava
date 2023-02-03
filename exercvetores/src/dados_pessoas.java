import java.util.Locale;
import java.util.Scanner;

public class dados_pessoas {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double menoraltura, maioraltura, alturafemMedia, alturafemtotal;
		int qtdhomens, qtdmulheres;
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Altura da %d\na pessoa: ", i+i);
			altura[i] = sc.nextDouble();
			System.out.printf("Genero da %d\na pessoa: ", i+i);
			genero[i] = sc.next().charAt(0);
		}
		
		menoraltura = altura[0];
		maioraltura = altura[0];
		
		for(int i=0; i<n; i++) {
			if (altura[i] > maioraltura) {
				maioraltura = altura[i];
			}
			
			if (altura[i] < menoraltura) {
				menoraltura = altura[i];
			}
		}
		
		
		qtdhomens=0;
		qtdmulheres=0;
		alturafemtotal=0;
		
		for (int i=0; i<n; i++) {
			if(genero[i] == 'M') {
				qtdhomens++;
			} else {
				qtdmulheres++;
				alturafemtotal = alturafemtotal + altura[i];
			}
		}
		
		alturafemMedia = alturafemtotal / qtdmulheres;
		
		System.out.printf("Menor altura = %.2f%n", menoraltura);
		System.out.printf("Maior altura = %.2f%n", maioraltura);
		System.out.printf("Media da altura das mulhers = %.2f%n", alturafemMedia);
		System.out.printf("Numero de homens = %.2f%n", qtdhomens);
		
		
		
		
		sc.close();
	}

}

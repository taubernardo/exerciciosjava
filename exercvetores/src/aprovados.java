import java.util.Locale;
import java.util.Scanner;

public class aprovados {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Digite o nome, primeira e segunda nota do %do aluno\n", i+1);
			sc.nextLine();
			nome[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}
		
		
		System.out.println("Alunos aprovados: ");
		
		for(int i=0; i<n; i++) {
			double med = (nota1[i] + nota2[i]) / 2;
			
			if (med>=6) {
				System.out.printf("%s%n", nome[i]);
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}

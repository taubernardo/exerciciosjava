import java.util.Scanner;

public class hora_game {
	
	public static void main(String[] args) {
		System.out.println("Digite a hora inicial e final: ");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int duracao;
		
		if (a < b) {
			duracao = b - a;
		} else {
			duracao = 24 - a + b;
		}
		
		System.out.println("O jogo durou " + duracao + "hora(s).");
		
		sc.close();
		
	}

}

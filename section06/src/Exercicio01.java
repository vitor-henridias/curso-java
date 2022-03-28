import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int senha;
		
		senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha inválida: BURRÃOOO ANIMALLL");
			senha = sc.nextInt();
		}
		
		System.out.println("Senha válida!");
		
		sc.close();
	}
}
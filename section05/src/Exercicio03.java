import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		System.out.println("Digite um número: ");
		A = sc.nextInt();
		System.out.println("Digite mais um número: ");
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("São Multiplos!");
		} else {
			System.out.println("Não são Multiplos!");
		}
		
		sc.close();
	}
}
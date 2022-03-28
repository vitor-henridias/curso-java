import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		if (numero >= 0) {
			System.out.println("Positivo!");
		} else {
			System.out.println("Negativo!");
		}	
				
		sc.close();
	}
}
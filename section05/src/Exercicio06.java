import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valorQualquer;
		
		System.out.println("Digite um valor qualquer: ");
		valorQualquer = sc.nextDouble();
		
		if (valorQualquer >= 0 && valorQualquer <= 25) {
			System.out.println("Intervalo 0, 25");
		} else if (valorQualquer > 25 && valorQualquer <= 50) {
			System.out.println("Intervalo 25, 50");
		} else if (valorQualquer > 50 && valorQualquer <= 75) {
			System.out.println("Intervalo 50, 75");
		} else if (valorQualquer > 75 && valorQualquer <= 100) {
			System.out.println("Intervalo 75, 100");
		} else {
			System.out.println("Fora de intervalo!");
		}
		
		System.out.println("Valor digitado: " + valorQualquer);
		
		
		
		

		sc.close();
	}
}
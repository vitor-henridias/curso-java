import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		System.out.println("Digite o valor de X: ");
		x = sc.nextDouble();
		System.out.println("Digite o valor de Y: ");
		y = sc.nextDouble();
		
		if(x > 0 && y > 0) {
			System.out.println("Quadrante Q1");
			System.out.println("Valores:");
			System.out.printf("X = %.2f | Y = %.2f%n", x, y);
		} else if(x < 0 && y > 0) {
			System.out.println("Quadrante Q2");
			System.out.println("Valores:");
			System.out.printf("X = %.2f | Y = %.2f%n", x, y);
		} else if(x < 0 && y < 0) {
			System.out.println("Quadrante Q3");
			System.out.println("Valores:");
			System.out.printf("X = %.2f | Y = %.2f%n", x, y);
		} else if(x > 0 && y < 0) {
			System.out.println("Quadrante Q4");
			System.out.println("Valores:");
			System.out.printf("X = %.2f | Y = %.2f%n", x, y);
		}
		sc.close();
	}
}
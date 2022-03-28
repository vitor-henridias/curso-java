import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int tipoCombustivel;
		
		System.out.println("Digite tipo de combustivel: ");
		tipoCombustivel = sc.nextInt();
		
		while (tipoCombustivel != 4) {
			
			if(tipoCombustivel == 1) {
				alcool = alcool + 1;
			} else if (tipoCombustivel == 2) {
				gasolina = gasolina + 1;
			} else if (tipoCombustivel == 3) {
				diesel = diesel + 1;
			}
			
			System.out.println("Digite novamente: ");
			tipoCombustivel = sc.nextInt();
			
		}
		
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Álcool= " + alcool);
		System.out.println("Gasolina= " + gasolina);
		System.out.println("Diesel= " + diesel);

		sc.close();
	}
}
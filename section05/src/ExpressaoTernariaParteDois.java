import java.util.Locale;
import java.util.Scanner;

public class ExpressaoTernariaParteDois {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double preco = 34.5;
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05; //Isso é a expressão ternária.
		
		System.out.println(desconto);
		
		sc.close();
	}
}
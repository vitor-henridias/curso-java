import java.util.Locale;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();;
		String dia;
		
		if (x == 1) {
			dia = "domingo";
			System.out.println("" + dia);
		} else if (x == 2) {
			dia = "segunda";
			System.out.println("" + dia);
		} else if (x == 3) {
			dia = "terça";
			System.out.println("" + dia);
		}
		else if (x == 4) {
			dia = "quarta";
			System.out.println("" + dia);
		}
		else if (x == 5) {
			dia = "quinta";
			System.out.println("" + dia);
		}
		else if (x == 6) {
			dia = "sexta";
			System.out.println("" + dia);
		}
		else if (x == 7) {
			dia = "sabado";
			System.out.println("" + dia);
		} else {
			dia = "valor invalido";
			System.out.println("" + dia);
		}
		sc.close();
	}
}
import java.util.Locale;
import java.util.Scanner;

public class SwitchCaseParteDois {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();;
		String dia;
		
		switch (x) {
		case 1:
			dia = "domingo";
			System.out.println("" + dia);
			break;
		case 2:
			dia = "segunda";
			System.out.println("" + dia);
			break;
		case 3:
			dia = "terca";
			System.out.println("" + dia);
			break;
		case 4:
			dia = "quarta";
			System.out.println("" + dia);
			break;
		case 5:
			dia = "quinta";
			System.out.println("" + dia);
			break;
		case 6:
			dia = "sexta";
			System.out.println("" + dia);
			break;
		case 7:
			dia = "sabado";
			System.out.println("" + dia);
			break;
			default:
				dia = "valor invalido";
				System.out.println("" +  dia);
				break;			
		}
		sc.close();
	}
}
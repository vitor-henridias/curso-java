import java.util.Locale;
import java.util.Scanner;

public class ContagemRegressiva {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		for (int i=4; i>=0; i--) {
			System.out.println("Valor de i: " + i);
		}
		
		sc.close();
	}
}
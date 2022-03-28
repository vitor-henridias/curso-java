import java.util.Locale;
import java.util.Scanner;

public class TesteDeMesaFor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int y = 10;
		
		for (int i=0; i<4; i++) {
			System.out.println(i);
			y = y + i;
			System.out.println(y);
		}
		
		sc.close();
	}
}
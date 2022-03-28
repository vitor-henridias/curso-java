import java.util.Locale;

public class TesteProcessamento {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		int x, y;
		double z;

		x = 5;

		y = 2 * x;

		z = 2 * x;

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		double b, B, h, area;

		b = 6.0;
		B = 8.0;
		h = 5.0;

		area = (b + B) / 2.0 * h;

		System.out.printf("A area é de: %.2f%n%n", area);

		int a, c;
		double resultado;

		a = 5;
		c = 2;

		resultado = a / c;

		System.out.printf("Sem double entre parenteses: %.2f%n", resultado);

		resultado = (double) a / c;

		System.out.printf("Com double entre parenteses: %.2f%n%n", resultado);

		double d;
		int e;

		d = 5.0;
		e = (int) a;

		System.out.println(d);
		System.out.println(e);
	
	}
}
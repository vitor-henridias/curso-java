package util;

public class Calculator {

	public static final double PI = 3.14159; //Vai ser uma constante que ela independe de qualquer objeto tipo calculator.
	
	public static double circumference(double radius) { //Também vai ser static, porque ela pode ser calculada independente de objeto.
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) { //Também vai ser static.
		return 4.0 * PI * radius * radius * radius / 3.0; 
	}	
}
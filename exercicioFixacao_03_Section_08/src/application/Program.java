package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Nome: ");
		student.nome = sc.nextLine();
		System.out.println("Nota 1: ");
		student.nota1 = sc.nextDouble();
		System.out.println("Nota 2: ");
		student.nota2 = sc.nextDouble();
		System.out.println("Nota 3: ");
		student.nota3 = sc.nextDouble();

		System.out.printf("FINAL GRADE = %.2f%n", student.notaFinal());
		
		if (student.notaFinal() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		} else {
			System.out.println("PASS");
		}
		
		sc.close();
	}
}
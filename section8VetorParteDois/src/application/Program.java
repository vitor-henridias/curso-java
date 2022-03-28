package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine(); //Esse sc.nextLine(); porque eu dei um nextInt antes, e a quebra de linha ficou pendente, então vou ter que consumir a quebra de linha primeiro, para depois ter condição de dar um nextLine();   
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name,price); //Com  isso aqui vou instanciar o novo produto, e o vect[i] na posição i vai apontar para esse objeto.
		}
		
		double sum = 0;
		
		for (int i=0; i<vect.length; i++) { //Com esse for eu faço a soma de todo mundo.
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();
	}
}
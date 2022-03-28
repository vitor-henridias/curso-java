package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the dollar price? ");
		CurrencyConverter.dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		CurrencyConverter.dollarBuyQuantity = sc.nextDouble();
		
		System.out.println("Amount to be paid in reais = " + CurrencyConverter.amount());
		
		sc.close();
	}
}
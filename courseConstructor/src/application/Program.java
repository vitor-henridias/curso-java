package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		Product product = new Product(name, price);
		
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		product.setPrice(1200);
		System.out.println("Updated price: " + product.getPrice());

		System.out.println("");
		System.out.println("Product data: " + product);
		System.out.println();

		System.out.println("Enter the number of productsto be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity); // Isso faz a atualiza��o da quantidade dentro do objeto product
		System.out.println("");
		System.out.println("Update product data: " + product);

		System.out.println("");
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity); // Isso faz a atualiza��o da quantidade dentro do objeto product
		System.out.println("");
		System.out.println("Updated data: " + product);

		sc.close();
	}
}
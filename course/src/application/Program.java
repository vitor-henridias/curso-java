package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println("");
		System.out.println("Product data: " + product);
		System.out.println();
		
		System.out.println("Enter the number of productsto be added in stock: ");
		int quantity =  sc.nextInt();
		product.addProducts(quantity); //Isso faz a atualização da quantidade dentro do objeto product
		System.out.println("");
		System.out.println("Update product data: " + product);
		
		System.out.println("");
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity); //Isso faz a atualização da quantidade dentro do objeto product
		System.out.println("");
		System.out.println("Updated data: " + product);
		
		sc.close();
	}
}
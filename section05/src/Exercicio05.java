import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidadeDoItem;
		double preco, totalAPagar;
		
		System.out.println("Digite o código do item: ");
		codigo = sc.nextInt();
		System.out.println("");
		while (codigo <= 0 || codigo > 5)
		{
			System.out.println("Código inválido, digite novamente: ");
			codigo = sc.nextInt();
		}
		
		System.out.println("Digite a quantidade do item: ");
		quantidadeDoItem = sc.nextInt();
		System.out.println("");
		while (quantidadeDoItem <= 0)
		{
			System.out.println("Quantidade inválida, digite novamente: ");
			quantidadeDoItem = sc.nextInt();
		}
		
		System.out.println("Pedido:");
		
		if (codigo == 1) {
			System.out.println("Especificação: Cachorro Quente");
			preco = 4.00;
			totalAPagar = 4 * quantidadeDoItem;
			System.out.printf("Valor a pagar: R$ %.2f%n", totalAPagar);
		} else if (codigo == 2) {
			System.out.println("Especificação: X-Salada");
			preco = 4.50;
			totalAPagar = 4.50 * quantidadeDoItem;
			System.out.printf("Valor a pagar: R$ %.2f%n", totalAPagar);
		} else if (codigo == 3) {
			System.out.println("Especificação: X-Bacon");
			preco = 5.00;
			totalAPagar = 5.00 * quantidadeDoItem;
			System.out.printf("Valor a pagar: R$ %.2f%n", totalAPagar);
		} else if (codigo == 4) {
			System.out.println("Especificação: Torrada Simples");
			preco = 2.00;
			totalAPagar = 2.00 * quantidadeDoItem;
			System.out.printf("Valor a pagar: R$ %.2f%n", totalAPagar);
		} else {
			System.out.println("Especificação: Refrigerante");
			preco = 1.50;
			totalAPagar = 1.50 * quantidadeDoItem;
			System.out.printf("Valor a pagar: R$ %.2f%n", totalAPagar);
		}
		
		System.out.println("Código digitado: " + codigo);
		System.out.println("Quantidade digitada: " + quantidadeDoItem);
		
		sc.close();
	}
}
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine(); //Esse sc.nextLine(); aqui para que seja consumida a quebra de linha que ficou pendente no sc.nextInt(); 
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0); //Essa forma é para ler caracter.
		
		/*
		Para saber se a é igual a abc.
		String a = "abc";
		if(a.equals("abc")) {
			
		}
		*/
		
		if(response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}
		
		System.out.println("");
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println("");
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);//Essa ação realiza o depósito na conta.
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println("");
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);//Essa ação realiza o saque na conta.
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		sc.close();
	}
}
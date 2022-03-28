package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List <String> list = new ArrayList<>();
		
		//Preenchendo a lista.
		list.add("Maria");
		list.add("Alex");	
		list.add("Bob");	
		list.add("Anna");	
		list.add(2, "Marco"); //Adicionando na lista na posição 2.
		
		System.out.println(list.size()); //Ver o tamanho da lista.
		
		for (String x : list) { //Imprimindo a lista na tela
			System.out.println(x);
		}
		
		System.out.println("----------------------------------------");
		
		list.remove("Anna"); //Removendo da lista.
		list.remove(1); //Outra forma de remover.
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("Index of Bob: " + list.indexOf("Bob")); //Ver a posição do elemento na lista.
		System.out.println("Index of Bob: " + list.indexOf("Marco")); //Quando o indexOf não encontra ele elemento ele retorna -1.
		
		System.out.println("----------------------------------------");
		
		list.add("Maria");
		list.add("Alex");	
		list.add("Bob");	
		list.add("Anna");	
		list.add(2, "Marco");
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--------------------------");
		
		//Filtro para retornar apenas os nomes que começam com a letra M.
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		//Primeiro converte para stream, faço a operação lambida que eu quero, e volto para lista.
		
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("--------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
		//Para encontrar o primeiro elemento com a letra M, caso não encontre o .orElse retornara null.
		System.out.println(name);
		//Exemplo retornando null
		String name1 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name1);

	}
}
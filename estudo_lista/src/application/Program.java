package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Mauraum");
		list.add("Alex");
		list.add("Edu");
		list.add("Evair");
		list.add("Ede");
		list.add("Ana");
		list.add("Cris");
		list.add("Jr");
		//Adicionando elemento na lista;
		list.add("Joao");
		//Adicionando elemento na lista, setando a posição que irá ocupar.
		list.add(2, "Clara");
		
		//Removendo um elemento da lista(o terceiro elemento)
		list.remove(3);
		//Removendo um elemento da lista pelo nome.
		list.remove("Mauraum");
		//Removendo os elementos da lista por predicado
	
		
		
		
		
		for (String x : list) {
			
			System.out.println(x);
			
		}
		//Exibido o tamanho da lista.
		System.out.println(list.size());
		
		// Removendo elementos da Lista através do predicado.
		list.removeIf(x -> x.charAt(0) == 'E');
		System.out.println("--------------------------------");
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--------------------------------");
		
		
		System.out.println(list.indexOf("Cris"));
		
		list.add("Shakira");
		list.add("Somália");
		list.add("Suzana");
		list.add("Tiazinha");
		list.add("Monica");
		list.add("Silvana");
		list.add("Cezar");
		list.add("Sócrates");
		
		System.out.println("--------------------------------");
		System.out.println(list);
		System.out.println("--------------------------------");
		
		
		//Criação de um filtro para a lista através de captura de caracter.
		List <String> filtro = list.stream().filter(x-> x.charAt(0) == 'S').collect(Collectors.toList());
		
		for (String filtrado : filtro) {
			System.out.println(filtrado);
		}
		
		System.out.println("--------------------------------");
		
		//Devolvendo a primeira ocorrência na lista com um determinado filtro.
		String primeiro = list.stream().filter(x-> x.charAt(0) == 'S').findFirst().orElse(null);
		System.out.println(primeiro);
	}

}

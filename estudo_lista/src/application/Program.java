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
		//Adicionando elemento na lista, setando a posi��o que ir� ocupar.
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
		
		// Removendo elementos da Lista atrav�s do predicado.
		list.removeIf(x -> x.charAt(0) == 'E');
		System.out.println("--------------------------------");
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--------------------------------");
		
		
		System.out.println(list.indexOf("Cris"));
		
		list.add("Shakira");
		list.add("Som�lia");
		list.add("Suzana");
		list.add("Tiazinha");
		list.add("Monica");
		list.add("Silvana");
		list.add("Cezar");
		list.add("S�crates");
		
		System.out.println("--------------------------------");
		System.out.println(list);
		System.out.println("--------------------------------");
		
		
		//Cria��o de um filtro para a lista atrav�s de captura de caracter.
		List <String> filtro = list.stream().filter(x-> x.charAt(0) == 'S').collect(Collectors.toList());
		
		for (String filtrado : filtro) {
			System.out.println(filtrado);
		}
		
		System.out.println("--------------------------------");
		
		//Devolvendo a primeira ocorr�ncia na lista com um determinado filtro.
		String primeiro = list.stream().filter(x-> x.charAt(0) == 'S').findFirst().orElse(null);
		System.out.println(primeiro);
	}

}

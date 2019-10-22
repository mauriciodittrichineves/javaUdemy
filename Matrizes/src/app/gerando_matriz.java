package app;

import java.util.Scanner;

public class gerando_matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Lendo a variável que define o tamanho da Matriz.
		int n = sc.nextInt();
		//Criando a matriz bi-dimensional
		int matriz[][] = new int [n][n];
		//Preenchendo os itens da Matriz.
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		//Imprimindo a Matriz.
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
			System.out.print(matriz[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("---------------------");
		//Imprimindo as Diagonais da Matriz
		for (int i = 0; i < n ; i++) {
			System.out.print(matriz[i][i]);
		}
		System.out.println("");
		System.out.println("---------------------");
		System.out.println("");
		// Contando a Quantidade de negativos.
		int negativos = 0;
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j<n; j++) {
				if (matriz[i][j] < 0) {
					negativos++; 
				}
			}
		}
		System.out.println(negativos);
		
		
		sc.close();
	}

}

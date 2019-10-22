
//Importada a classe que permite utilizar os numeros no formato americano.
import java.util.Locale;

public class PrimeiroDesafio {
	public static void main(String[] args) {
	//Declarado sobre produto
	String product1 = "Computer";
	String product2 ="office desk";
	
	//Declarado sobre comprador
	int age = 30;
	int code = 5290;
	char gender = 'F';
	
	//Informações comerciais
	double price = 2100.0;
	double price2 = 650.5;
	double measure = 53.234567;
	
	
	//Imprimindo o ticket solicitado.
	System.out.println("Products:");
	System.out.printf("%s wich price is $ %.2f%n", product1, price);
	System.out.printf("%s wich price is $ %.2f%n",product2, price2);
	System.out.println("");
	System.out.printf("Record: %d years old, code %d and gender is %s", age, code, gender );
	System.out.println("");
	System.out.printf("%nMeasue with eight decimal places: %.8f%n", measure);
	System.out.printf("Rouded(three decimal places): %.3f%n", measure);
	System.out.printf("US decimal point: %.3f%n", measure);
	
	
	
	

	
		
	}		

}

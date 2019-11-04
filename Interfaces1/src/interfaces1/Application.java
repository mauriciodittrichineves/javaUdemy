package interfaces1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entitties.AluguelCarro;
import model.entitties.Veiculos;
import model.services.ServicoAluguel;
import model.services.TaxaImpostoBrasil;

public class Application {

	public static void main(String[] args) throws java.text.ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		System.out.println("Dados de Locação");
		System.out.println("Modelo do carro: ");
		String modelo = sc.nextLine();
		System.out.println("Data e horario da entrega(dd/MM/yyyy HH:mm): ");
		Date entrega = sdf.parse(sc.nextLine());
		System.out.println("Data e horario da devolucao(dd/MM/yyyy HH:mm): ");
		Date devolucao = sdf.parse(sc.nextLine());
		
		AluguelCarro carroAlugado = new AluguelCarro(entrega, devolucao, new Veiculos(modelo));
		
		System.out.println("Digite o valor de locação por hora: ");
		Double valorPorHora = sc.nextDouble();
		System.out.println("Digite o valor de locação por dia: ");
		Double valorPorDia = sc.nextDouble();
		
		ServicoAluguel veiculoAlugado = new ServicoAluguel(valorPorDia, valorPorHora, new TaxaImpostoBrasil());
		veiculoAlugado.notaPagamento(carroAlugado);
		
		System.out.println("*****NOTA DE ALUGUEL*****");
		System.out.println("Valor do Aluguel: " + String.format("%.2f", carroAlugado.getFatura().getTaxaBasica()));
	
		System.out.println("Valor dos Impostos: " + String.format("%.2f", carroAlugado.getFatura().getImposto()));
		
		System.out.println("Valor Total do  Aluguel: " + String.format("%.2f", carroAlugado.getFatura().getPagamentoTotal()));
		
	}

}

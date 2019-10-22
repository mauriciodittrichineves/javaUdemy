package trabalhando_datas;

//Ignora exceções que não tenham sido tratadas.
import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;


public class datas {

	public static void main (String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		
		//Formas de Colocar a data.
		Date y1 = sdf1.parse("12/12/1985");
		Date y2 = sdf2.parse("12/12/1985 14:42:22");
		Date y3 = sdf3.parse("12/12/85 14:20:13");
		// Fornece o horario atual.
		Date x1 = new Date();
		// Pega a data atual em milissegundos.
		Date x2 = new Date(System.currentTimeMillis());
		// Fornece uma data recebendo milissegundos, neste caso forneceu data de 01/01/1970.
		// com 3 horas a menos do que o meridiano de Greenwich horario de criação da lingua
		Date x3 = new Date(0L);
		//Chegando as 5 horas do dia de criação, multiplicando em milisegundos.
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		
		// Instanciando Data no Formato ISO 8601.
		Date iso8601 = Date.from(Instant.parse("1985-12-12T08:00:00Z"));
		//Date aniversario = iso8601.parse();
		
		System.out.println("===============================================");
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("No Formato ISO 8601:" + iso8601);
		System.out.println("===============================================");
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));
		System.out.println("No Formato ISO 8601:" + iso8601);
		
	}
	
}

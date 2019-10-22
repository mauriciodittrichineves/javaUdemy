package trabalhando_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class datas {

	public static void main (String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date y1 = sdf1.parse("12/12/1985");
		Date y2 = sdf2.parse("12/12/1985 14:42:22");
		
		System.out.println(y1);
		System.out.println(y2);
		
	}
	
}

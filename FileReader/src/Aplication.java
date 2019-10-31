import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aplication {

	public static void main(String[] args) {

		String path = "C:\\Trabalhos Mauricio\\in.txt";
		//FileReader fr = null; Strings que eram declarados no modo antigo
		//BufferedReader br = null; Strings que eram declarados no modo antigo

		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			//fr = new FileReader(path); Objeto String antiga sendo construida
			//br = new BufferedReader(fr); Objeto String antiga sendo construida
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e);
		} /*
			Bloco Finally era declarado sem usar o Bloco Try-with resources.
			finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}*/
	}
}

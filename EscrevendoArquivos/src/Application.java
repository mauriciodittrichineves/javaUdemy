import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		String[] lines = new String[] {"Vamos vamos Nacional", "Hoje eu vim te apoiar", "Para te ver campeão !!"};
		String path = "C:\\Trabalhos Mauricio\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
				
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e);
		}
		
		// Agora adicionando novas linhas no mesmo arquivo, apenas adicionando um true ao lado
		//da variavel que representa o arquivo.
		
		String [] lines2 = {"Para te ver ganhar", "e vamos vamos", "Vamos vamos Nacional "};
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (String line : lines2) {
				bw.write(line);
				bw.newLine();
				
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e);
		}

	}

}

import java.io.File;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o caminho da pasta");
		String strPath = sc.nextLine();
		
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Folders");
		for (File folder : folders) {
			System.out.println(folder.getName());
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files");
		for (File file : files) {
			System.out.println(file.getName());
		}
		
		boolean success = new File(strPath + "\\arquivoCriadoJava").mkdir();
		if (success == true) {System.out.println("Sucesso ao criar o diretorio");}

	}

}

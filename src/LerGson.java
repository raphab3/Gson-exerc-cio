import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LerGson {
	
	public static void main(String[] args) {

	Locale.setDefault(Locale.US);
		
	String path = "C:\\Users\\rapha\\Desktop\\Fujioka\\teste.json";
	File strPath = new File(path);

	
	
	
	try(BufferedReader br = new BufferedReader(new FileReader(strPath))){
		String line = br.readLine();
		
		if (line != null) {
			System.out.println(line);
		}
	}
	catch(IOException ioe) {
		System.out.println(ioe.getMessage());
	}
		
}

}

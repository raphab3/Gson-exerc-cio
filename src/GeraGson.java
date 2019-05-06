import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class GeraGson {
	
	public static void main(String[] args){
		
		Cerveja skol = new Cerveja();
		
		skol.setAno(2019);
		skol.setMalte("Puro malte");
		skol.setMarca("Skol");
		skol.setNome("Skol Ice Blue Red");
		
		
		Gson gson = new Gson();
		String skolJson = gson.toJson(skol);
		
		System.out.println(skolJson);
		
		FileWriter fw;
		try {
			fw = new FileWriter("C:\\Users\\rapha\\Desktop\\Fujioka\\teste.json");
			fw.write(skolJson);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;

public class Modele {

	HashMap<String,Integer> recettes = new HashMap<String,Integer>();
	
	public Modele() {
		try {
			List<String> recette = Files.readAllLines(new File("src/recettes.txt").toPath(), Charset.defaultCharset());
			for (int i = 0; i < recette.size(); i++) {
				this.recettes.put(recette.get(i), i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	

	public String toString() {
		return (this.recettes.entrySet()).toString();
	}
	
	public static void main(String[] args) {
		Modele m = new Modele();
		System.out.println(m);
		
	}
}
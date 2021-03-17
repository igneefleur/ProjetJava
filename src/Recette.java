import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;

public class Recette {

	ArrayList<String> recette;
	
	String nomRecette;
	int difficulte;
	ArrayList<String> tags;
	String consigne;
	
	public Recette() {
		this.nomRecette = "";
		this.difficulte = 0;
		this.tags = new ArrayList<String>();
		this.consigne = "";
	}
	
	/**
	 *	initRecette:
	 *	Initialise la liste des recettes à partir du documment situe a "src/recettes.txt" 
	 *	(Afin d'eviter de charger toutes les recettes pour chaque méthode a chaque fois).
	 *
	 *	Il doit imperativement etre utilise en premier pour le bon fonctionnement des methodes ci-dessous.
	 **/
	public void initRecette() {
		try {
			
			ArrayList<String> r = (ArrayList<String>) Files.readAllLines(new File("src/recettes.txt").toPath(), Charset.defaultCharset());
			this.recette = r;
			System.out.println(this.recette);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	/**
	 *	ajouterRecette(index):
	 *	Initialise les variables de la classe Recette avec celle de la recette a l'endroit index dans le document situé a "src/recettes.txt".
	 **/
	public void ajouterRecette(int index) {
		if (this.recette != null) {
			
			String[] rSplit = this.recette.get(index).split(";");
			
			this.nomRecette = rSplit[0].substring(1);
			this.difficulte = Integer.parseInt(rSplit[1].substring(1));
			this.tags.add(rSplit[2].substring(1));
			this.consigne = (rSplit[3].substring(1,rSplit[3].length()-1));
			
		} else {
			
			System.out.println("Document de recette non initialise.");
			
		}
	}
	
	public static void main(String[] args) {
		Recette rec = new Recette();
		rec.initRecette();
		rec.ajouterRecette(1);
		System.out.println(rec.nomRecette);
		rec.ajouterRecette(0);
		System.out.println(rec.nomRecette);
	}
}

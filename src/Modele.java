import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Observable;

public class Modele implements PropertyChangeListener {

	ArrayList<Recette> recettes = new ArrayList<Recette>();
	File fichier = new File("recettes.xml");
	
	public void ajouterRecette(Recette r) {
		if (!this.recettes.contains(r)) {
			this.recettes.add(r);
		} else {
			System.out.println("Recette déjà existante");
		}
	}
	
	public void supprimerRecette(Recette r) {
		if (this.recettes.contains(r)) {
			this.recettes.remove(r);
		} else {
			System.out.println("Recette inexistante");
		}
	}
	
	public void saveRecettes() {
		XMLEncoder encoder = null;
		try {
			FileOutputStream fos = new FileOutputStream("recettes.xml");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			encoder = new XMLEncoder(bos);
			
			encoder.writeObject(this.recettes);
			encoder.flush();
			
		} catch (final java.io.IOException e1) {
			throw new RuntimeException("Ecriture des données impossible");
		} finally {
			if (encoder != null) encoder.close();
		}
	}
	
	public void loadRecettes() {
		XMLDecoder decoder = null;
		
		try {
			FileInputStream fis = new FileInputStream(fichier);
			BufferedInputStream bis = new BufferedInputStream(fis);
			decoder = new XMLDecoder(bis);
			
			this.recettes = (ArrayList<Recette>)decoder.readObject();

		} catch (IOException e2) {
			throw new RuntimeException("Chargement impossible");
		} finally {
			if (decoder != null) decoder.close();
		}
	}
	
	public String toString() {
		String s = "";
		for (int i=0; i<this.recettes.size(); i++) {
			Recette r = this.recettes.get(i);
			s = s + r.nomRecette + ", " + r.difficulte + ", [";
			for (int j=0; j<r.tags.length; j++) {
				s = s + r.tags[j]+ ", ";
			}
			s = s.substring(0, s.length()-2);
			s = s + "], '" + r.consigne + "'\n";
		}
		return s;
	}
	
	public static void main(String[] args) {
		Modele m = new Modele();
		Recette r1 = new Recette("Moelleux au chocolat",2,new String[]{"Sucre", "Moelleux"},"Etape 1 : \n Faire fondre le chocolat \n"
                + "Etape 2 : \n Ajouter le beurre en morceaux peu à peu et l'incorporer pour obtenir un crème bien lisse. \n "
                + "Etape 3 : \n Mettre la farine et le sucre glace dans un saladier. Ajouter les oeufs entiers et mélanger jusqu'à obtention d'une émulsion homogène. \n "
                + "Etape 4 : \n Verser le mélange chocolat-beurre sur cette préparation. Mélanger. \n "
                + "Etape 5 : \n Beurrer et fariner 6 moules individuels ou un grand moule. \n "
                + "Etape 6 : \n Verser la préparation et mettre à four chaud (200°C) - 10 min pour les petits gâteaux, 15 pour le grand. \n "
                + "Etape 7 : \n Servir tiède avec une crème anglaise (le centre doit être coulant) ou servir froid nappé de ganache au chocolat."
                );
		Recette r2 = new Recette("Crepes",1,new String[]{"Sucre"},"Etape 1 : \n Dans un saladier, mélanger la farine, le sel et le sucre. \n "
                + "Etape 2 : \n Faire une Fontaine \n "
                + "Etape 3 : \n Ajouter les oeufs et commencer à les incorporer à la farine avec une cuillère en bois, ajouter le beure fondu (tiédi) peu à peu et bien malaxer.\n"
                + "Etape 4 : \n Incorporer le lait (par petites quantités au début pour éviter les grumeaux), ajouter le parfum. \n "
                + "Etape 5 : \n Faire cuire les crêpes dans une poêle chaude huilée."
                );
		Recette r3 = new Recette("Quiche",1,new String[]{"Sale"},
                "Etape 1 \n Prechauffer le four, etaler la pate dans le moule \n "
                + "Etape 2 \n la piquer avec une fourchette. Parsemer de copeaux de buerre \n "
                + "Etape 3 : \n Faire rissoler les lardons à la poele \n "
                + "Etape 4 : \n Battre les oeufs, la creme fraiche et le lait \n"
                + "Etape 5 : \n Ajouter les lardons \n "
                + "Etape 6 : \n Assaisonner de sel, poivre et de muscade \n "
                + "Etape 7 : \n verser sur la pate \n "
                + "Etape 8 : \n Cuire 45 à 50min \n "
                );
		ArrayList<Recette> r = new ArrayList<Recette>(Arrays.asList(r1,r2));
		for (int i=0; i<r.size(); i++) {
			m.ajouterRecette(r.get(i));
		}
		m.saveRecettes();
		
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		System.out.println(evt.getPropertyName() + "a change");
		System.out.println(evt.getOldValue() + "is now" + evt.getNewValue() + "dans" + evt.getSource());
		
	}
}
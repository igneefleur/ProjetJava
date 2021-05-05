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
	
	Recette[] current_recipes = new Recette[10];
	private int page = 0;
	
	public ArrayList<Recette> recettes_affichees = new ArrayList<Recette>();
	
	public Recette current_recipe;
	
	public Window window;
	
	public void rechercher(String s) {
		
		recettes_affichees = new ArrayList<Recette>();
		
		for(int i = 0; i < this.recettes.size(); i++) {
			if(this.recettes.get(i).string_is_in(s)) {
				recettes_affichees.add(this.recettes.get(i));
			}
		}
		
	}
	
	public int get_page() {
		return this.page;
	}
	
	public void set_page(int n) {
		this.page = n;
		for(int i = 0; i < this.current_recipes.length; i++) {
			try {
				this.current_recipes[i] = this.recettes_affichees.get(n * 10 + i);
			} catch(Exception e) {
				this.current_recipes[i] = null;
			}
		
		}
		
		window.menu_selector.reload();
	}
	
	public void ajouterRecette(Recette r) {
		if (!this.recettes.contains(r)) {
			this.recettes.add(r);
		} else {
			System.out.println("Recette deja existante");
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
			throw new RuntimeException("Ecriture des donnees impossible");
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
	
	public void change_page() {
		for(int i = 0; i < 10; i++) {
			try {
				this.current_recipes[i] = this.recettes_affichees.get(i);
			} catch(IndexOutOfBoundsException e) {
				
			}
		}
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		System.out.println(evt.getPropertyName() + "a change");
		System.out.println(evt.getOldValue() + "is now" + evt.getNewValue() + "dans" + evt.getSource());
		
	}
}
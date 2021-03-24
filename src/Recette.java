import java.io.Serializable;

public class Recette implements Serializable {

	private static final long serialVersionUID = 1L;
	
	String nomRecette;
	int difficulte;
	String[] tags;
	String consigne;
	
	public Recette() {}
	
	public Recette(String n, int d, String[] t, String c) {
		this.nomRecette = n;
		this.difficulte = d;
		this.tags = t;
		this.consigne = c;
	}
	
	public String toString() {
		String out = this.nomRecette + " " + this.difficulte + " " + this.tags + " " + this.consigne;
		return out;
	}
	
	public String getNomRecette() {
		return nomRecette;
	}
		
	public void setNomRecette(String n) {
		this.nomRecette = n;
	}
	
	public int getDifficulte() {
		return difficulte;
	}
	
	public void setDifficulte(int d) {
		this.difficulte = d;
	}
	
	public String[] getTags() {
		return tags;
	}
	
	public void setTags (String[] t) {
		this.tags = t;
	}
	
	public String getConsigne() {
		return consigne;
	}
		
	public void setConsigne(String c) {
		this.consigne = c;
	}
}

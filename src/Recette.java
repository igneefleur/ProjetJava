import java.io.Serializable;

public class Recette implements Serializable {

	private static final long serialVersionUID = 1L;
	
	int num;
	String nomRecette;
	int difficulte;
	String[] tags;
	String consigne;
	boolean fav;
	
	public Recette() {}
	
	public Recette(int u, String n, int d, String[] t, String c, boolean f) {
		this.num = u;
		this.nomRecette = n;
		this.difficulte = d;
		this.tags = t;
		this.consigne = c;
		this.fav = f;
	}
	
	public String toString() {
		String out = this.num + ". " + this.nomRecette + " " + this.difficulte + " " + this.tags + " " + this.consigne;
		return out;
	}
	
	public int getNum() {
		return num;
	}
		
	public void setNum(int u) {
		this.num = u;
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
	
	public boolean getFav() {
		return fav;
	}
		
	public void setFav(boolean f) {
		this.fav = f;
	}
}

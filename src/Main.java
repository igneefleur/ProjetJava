
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modele modele = new Modele();
		
		modele.loadRecettes();
		System.out.println(modele.recettes.size());
		
		Controleur controleur = new Controleur(modele);
		new Window(modele, controleur);
	}

}

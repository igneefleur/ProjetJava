
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modele modele = new Modele();
		
		new CreationRecipes(modele);
		//modele.loadRecettes();
		System.out.println(modele.recettes.size());
		
		Controleur controleur = new Controleur(modele);
		new Window(modele, controleur);
	}

}

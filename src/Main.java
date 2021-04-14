
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modele modele = new Modele();
		Controleur controleur = new Controleur(modele);
		new Window(modele, controleur);
	}

}

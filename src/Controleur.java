import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Controleur implements ItemListener{
	
	private Modele mdl;
	
	public Controleur (Modele mdl) {
		this.mdl =mdl;
	}
	
	public void itemStateChanged(ItemEvent arg) {
		System.out.println(arg.getItem());
		Integer n = (Integer)arg.getItem();
		this.mdl.selctImage();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

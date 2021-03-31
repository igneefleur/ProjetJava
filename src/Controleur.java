import java.awt.event.ItemEvent; 
import java.awt.event.ItemListener;
import java.util.Arrays;


public class Controleur implements ItemListener{
	
	private Modele mdl;
	
	public Controleur (Modele mdl) {
		this.mdl = mdl;
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		if (arg0.getSource()instanceof java.awt.List) {
			
			
			
		}
		else if (arg0.getSource() instanceof java.awt.Checkbox) {
			
			
		}
			
		}
		
	

}


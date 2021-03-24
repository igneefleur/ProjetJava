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
Checkbox[] note = new Checkbox[5];

String[] descrip = {"1 étoile", "2 étoiles","3 étoiles", "4 étoiles", "5 étoiles"};


	CheckboxGroup CG = new CheckboxGroup();
	ItemListener itemlistener = new ItemListener() {
		@Override
		public void itemStateChanged(ItemEvent arg0) {
			
			// TODO Auto-generated method stub
		}
	};
	
	
	for (int i=0; i<5; i++){
		note[i] = new Checkbox(descrip[i], false, CG);
		note[i].addItemListener(itemlistener);
		add(note[i]);
	}
	
	Modele.addObserver(this);
}

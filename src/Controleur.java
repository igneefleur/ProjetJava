import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent; 
import java.awt.event.ItemListener;
import java.util.Arrays;


public class Controleur implements ItemListener{
	
	private Modele modele;
	public Window window;
	
	public ActionListener search = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			modele.rechercher(window.menu_selector.search_bar.getText());
			modele.set_page(0);
		}
		
	};
	
	public ActionListener button_start = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
				modele.set_page(0);
		}
		
	};
	public ActionListener button_previous = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			int n = modele.get_page();
			if(n > 0) {
				modele.set_page(n - 1);
			}
		}
		
	};
	public ActionListener button_next = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			int n = modele.get_page();
			modele.set_page(n + 1);
			
		}
		
	};
	public ActionListener button_end = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			int n = modele.recettes.size() % 10;
			modele.set_page(n);
			
		}
		
	};
	
	public ActionListener button_retour = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			window.to_menu_selector();
		}
		
	};
	
	public Controleur (Modele mdl) {
		this.modele = mdl;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	

}


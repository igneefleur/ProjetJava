import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

@SuppressWarnings("serial")
public class Window extends JFrame implements WindowListener {
	
	public Modele modele;
	public Controleur controleur;
	
	public MenuSelector menu_selector;
	public AWT_Recipe awt_recipe;
	

	public Window(Modele modele, Controleur controleur) {
		this.modele = modele;
		this.controleur = controleur;
		
		
		this.setSize(700, 900);
		
		this.addWindowListener(this);
		
		this.setLayout(new BorderLayout());
		
		this.menu_selector = new MenuSelector(this, modele, controleur);
		this.awt_recipe = new AWT_Recipe(this.modele, this.controleur);
		
		
		this.add(menu_selector, BorderLayout.CENTER);

		//this.add(awt_recipe, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
	
	public void change_panel() {
		this.remove(menu_selector);
		this.add(awt_recipe, BorderLayout.CENTER);
		this.revalidate();
		this.repaint();
		this.awt_recipe.reload();
	}
	
	public void to_menu_selector() {
		this.remove(awt_recipe);
		this.add(menu_selector, BorderLayout.CENTER);
		this.revalidate();
		this.repaint();
		this.menu_selector.reload();
	}

	@Override
	public void windowActivated(WindowEvent arg0) {}

	@Override
	public void windowClosed(WindowEvent arg0) {}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {}

	@Override
	public void windowDeiconified(WindowEvent arg0) {}

	@Override
	public void windowIconified(WindowEvent arg0) {}

	@Override
	public void windowOpened(WindowEvent arg0) {}
}

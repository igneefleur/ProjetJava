import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class Window extends Frame implements WindowListener {
	
	public Modele modele;
	public Controleur controleur;
	

	public Window(Modele modele, Controleur controleur) {
		this.modele = modele;
		this.controleur = controleur;
		
		
		this.setSize(700, 900);
		
		this.addWindowListener(this);
		//this.add(new AWT_Recipe(modele, controleur));
		this.add(new MenuSelector(modele, controleur));
		
		this.setVisible(true);
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

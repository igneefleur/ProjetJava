import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

// changer le nom en RecipeSelector
@SuppressWarnings("serial")
public class MenuSelector extends Panel {
	
	public Panel[] menus = new Panel[10];
	public Button[] buttons = new Button[4];
	public Image[] images = new Image[10];
	
	public MenuSelector() {
		
		this.setLayout(new BorderLayout());
		
		Panel NORTH = new Panel();
		// debut contenu du haut de la page...
		
		
		// ...fin contenu du haut de la page.
		NORTH.setPreferredSize(new Dimension(0, 50));
		this.add(NORTH, BorderLayout.NORTH);
		
		
		Panel CENTER = new Panel();
		CENTER.setLayout(new GridLayout(10, 1));
		// debut contenu du centre de la page...
		
		int j = 0; // A SUPPRIMER APRES TEST
		for(Panel menu : menus) {
			final int index = j; // A SUPPRIMER APRES TEST
			
			menu = new Panel();
			menu.setLayout(new BorderLayout());
			
			Panel menu_WEST = new Panel();
			menu_WEST.setBackground(Color.MAGENTA); // A SUPPRIMER APRES TEST
			menu_WEST.setLayout(new BorderLayout());
			
			Canvas menu_WEST_canvas = new Canvas() {
				public void paint(Graphics g) {
					//g.drawString("image " + String.valueOf(index), 20, 20); // A SUPPRIMER APRES TEST
					try {
						g.drawImage(ImageIO.read(new File("images/pdf.png")), 0, 0, this.getWidth(), this.getHeight(), this);
					} catch (IOException e) {
						System.out.println("marche pas");
					}

				}
			};
			menu_WEST.add(menu_WEST_canvas, BorderLayout.CENTER);
			
			menu_WEST.setPreferredSize(new Dimension(100, 0));
			menu.add(menu_WEST, BorderLayout.WEST);
			
			
			Panel menu_EAST = new Panel();
			
			menu_EAST.setBackground(Color.CYAN); // A SUPPRIMER APRES TEST
			menu_EAST.setLayout(new BorderLayout());
			Canvas menu_EAST_canvas = new Canvas() {
				public void paint(Graphics g) {
					g.drawString("texte inutile " + String.valueOf(index), 20, 20);
				}
			};
			menu_EAST.add(menu_EAST_canvas, BorderLayout.CENTER);
			
			menu.add(menu_EAST, BorderLayout.CENTER);
			
			CENTER.add(menu);
			
			j++; // A SUPPRIMER APRES TEST
		}
		
		// ...fin contenu du centre de la page.
		this.add(CENTER, BorderLayout.CENTER);
		
		Panel SOUTH = new Panel();
		// debut contenu du bas de la page...
		String[] names = {"debut", "precedent", "suivant", "fin"};
		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new Button(names[i]);
			buttons[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					System.out.println("ah, quelqu'un a appuye sur un bouton");
					// ici l'event des boutons en bas de l'affichage
				}
			});
			SOUTH.add(buttons[i]);
		}
		// ...fin contenu du bas de la page.
		
		SOUTH.setPreferredSize(new Dimension(0, 50));
		this.add(SOUTH, BorderLayout.SOUTH);
	}
}

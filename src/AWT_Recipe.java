import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Panel;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

@SuppressWarnings("serial")
public class AWT_Recipe extends Panel {
	
	public AWT_Recipe() {
		this.setLayout(new BorderLayout());
		
		Panel head_panel = new Panel();
		head_panel.setLayout(new BorderLayout());
		// debut de la tete..
		
		Panel head_image_panel = new Panel();
		head_image_panel.setLayout(new BorderLayout());
		// debut du panneau contenant l'image
		
		Canvas head_image_canvas = new Canvas() {
			public void paint(Graphics g) {
				try {
					g.drawImage(ImageIO.read(new File("images/soupe-legumes-du-potager.jpg")), 0, 0, this.getWidth(), this.getHeight(), this); // affichage image
				} catch (IOException e) {
					System.out.println("la soupe marche pas");
				}
			}
		};
		head_image_panel.add(head_image_canvas, BorderLayout.CENTER);
		
		// fin du panneau contenant l'image
		head_image_panel.setPreferredSize(new Dimension(200, 0));
		head_panel.add(head_image_panel, BorderLayout.WEST);
		
		
		Panel head_text_panel = new Panel();
		head_text_panel.setLayout(new BorderLayout());
		// debut du panneau contenant les textes..
		
		Panel head_text_up_panel = new Panel();
		head_text_up_panel.setLayout(new BorderLayout());
		// debut du panneau contenant les textes en haut..
		
		Panel head_text_up_title_panel = new Panel();
		head_text_up_title_panel.setLayout(new BorderLayout());
		// debut du titre de la recette
		
		Canvas head_text_up_title_canvas = new Canvas() {
			public void paint(Graphics g) {
				g.drawString("TITLE", 5, 20);
			}
		};
		
		head_text_up_title_panel.add(head_text_up_title_canvas, BorderLayout.CENTER);
		// fin du titre de la recette
		head_text_up_panel.add(head_text_up_title_panel, BorderLayout.CENTER);
		
		// ..fin du panneau contenant les textes en haut
		head_text_up_panel.setBackground(Color.CYAN);
		head_text_up_panel.setPreferredSize(new Dimension(0, 50));
		head_text_panel.add(head_text_up_panel, BorderLayout.NORTH);
		
		Panel head_text_down_panel = new Panel();
		head_text_down_panel.setLayout(new BorderLayout());
		// debut du panneau contenant les textes en bas..
		
		
		// ..fin du panneau contenant les textes en bas
		head_text_down_panel.setBackground(Color.PINK);
		head_text_panel.add(head_text_down_panel, BorderLayout.CENTER);
		
		// ..fin du panneau contenant les textes
		head_panel.add(head_text_panel, BorderLayout.CENTER);
		
		
		// ..fin de la tete
		head_panel.setPreferredSize(new Dimension(0, 200));
		this.add(head_panel, BorderLayout.NORTH);
		
		Panel body_panel = new Panel();
		body_panel.setLayout(new BorderLayout());
		// debut du corps..
		
		
		// ..fin du corps
		
		this.add(body_panel, BorderLayout.CENTER);
	}
}

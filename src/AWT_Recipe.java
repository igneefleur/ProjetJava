import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.font.FontRenderContext;
import java.awt.font.LineBreakMeasurer;
import java.awt.font.TextLayout;
import java.io.File;
import java.io.IOException;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.util.StringTokenizer;

import javax.imageio.ImageIO;

@SuppressWarnings("serial")
public class AWT_Recipe extends Panel {
	
	public Color background_color = new Color(203, 198, 198);
	
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
		
		String title_string = "    TITLE";
		Label head_text_up_title_textarea = new Label(title_string);
		Font font01 = new Font("Serif", Font.ITALIC, 36);
		head_text_up_title_textarea.setFont(font01);
		
		head_text_up_title_panel.add(head_text_up_title_textarea, BorderLayout.CENTER);
		// fin du titre de la recette
		head_text_up_panel.add(head_text_up_title_panel, BorderLayout.CENTER);
		
		// ..fin du panneau contenant les textes en haut
		head_text_up_panel.setBackground(Color.PINK);
		head_text_up_panel.setPreferredSize(new Dimension(0, 50));
		head_text_panel.add(head_text_up_panel, BorderLayout.NORTH);
		
		Panel head_text_down_panel = new Panel();
		//head_text_down_panel.setLayout(new BorderLayout());
		// debut du panneau contenant les textes en bas..
		
		
		Label label = new Label("TAGS :");
		Font font02 = new Font("Serif", Font.ITALIC, 12);
		label.setFont(font02);
		head_text_down_panel.add(label);
		
		
		String[] s02 = {"SUCRE", "SALE", "CHOCOLAT", "CHOCOLAT", "CHOCOLAT", "CHOCOLAT", "CHOCOLAT", "CHOCOLAT"};
		for(String tag : s02) {
			Button button = new Button(tag);
			button.setFont(font02);
			head_text_down_panel.add(button);
		}
		
		
		
		
		// ..fin du panneau contenant les textes en bas
		head_text_down_panel.setBackground(this.background_color);
		head_text_panel.add(head_text_down_panel, BorderLayout.CENTER);
		
		// ..fin du panneau contenant les textes
		head_panel.add(head_text_panel, BorderLayout.CENTER);
		
		
		// ..fin de la tete
		head_panel.setPreferredSize(new Dimension(0, 200));
		this.add(head_panel, BorderLayout.NORTH);
		
		Panel body_panel = new Panel();
		body_panel.setLayout(new BorderLayout());
		// debut du corps..
		
		
				
		String s = "\n"
				+ "Etape 1 : \n Faire fondre le chocolat \n\n"
                + "Etape 2 : \n Ajouter le beurre en morceaux peu à peu et l'incorporer pour obtenir un creme bien lisse. \n\n"
                + "Etape 3 : \n Mettre la farine et le sucre glace dans un saladier. Ajouter les oeufs entiers et mélanger jusqu'à obtention d'une émulsion homogène. \n\n"
                + "Etape 4 : \n Verser le melange chocolat-beurre sur cette preparation. Melanger. \n\n"
                + "Etape 5 : \n Beurrer et fariner 6 moules individuels ou un grand moule. \n\n"
                + "Etape 6 : \n Verser la préparation et mettre à four chaud (200°C) - 10 min pour les petits gateaux, 15 pour le grand. \n\n"
                + "Etape 7 : \n Servir tiede avec une creme anglaise (le centre doit être coulant) ou servir froid nappé de ganache au chocolat.";
		
		TextArea body_textarea = new TextArea(s, 3 , 100 , TextArea.SCROLLBARS_NONE); 
		body_textarea.setBackground(this.background_color);
		body_textarea.setEditable(false);
		Font font03 = new Font("Serif", Font.PLAIN, 18);
		body_textarea.setFont(font03);
		
		// ..fin du corps
		body_panel.add(body_textarea, BorderLayout.CENTER);
		
		this.add(body_panel, BorderLayout.CENTER);
	}
}

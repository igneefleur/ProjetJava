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
	
	public Modele modele;
	public Controleur controleur;
	
	public String title;
	public String[] tags;
	public String image; // peut etre une class speciale pour l'image
	public String description;
	
	public Font title_font = new Font("Serif", Font.ITALIC, 36);
	public Font tag_font = new Font("Serif", Font.ITALIC, 12);
	public Font description_font = new Font("Serif", Font.PLAIN, 18);
	
	
	public AWT_Recipe(Modele modele, Controleur controleur) {
		this.modele = modele;
		this.controleur = controleur;
		
		this.title = this.modele.recettes.get(0).nomRecette;
		this.tags = this.modele.recettes.get(0).tags;
		this.description = this.modele.recettes.get(0).consigne;
		
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
		
		String title_string = "    " + this.title;
		Label head_text_up_title_textarea = new Label(title_string);
		head_text_up_title_textarea.setFont(this.title_font);
		
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
		label.setFont(this.tag_font);
		head_text_down_panel.add(label);
		
		for(String tag : this.tags) {
			Button button = new Button(tag);
			button.setFont(this.tag_font);
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
		
		
		TextArea body_textarea = new TextArea(this.description, 3 , 100 , TextArea.SCROLLBARS_NONE); 
		body_textarea.setBackground(this.background_color);
		body_textarea.setEditable(false);
		body_textarea.setFont(this.description_font);
		
		// ..fin du corps
		body_panel.add(body_textarea, BorderLayout.CENTER);
		
		this.add(body_panel, BorderLayout.CENTER);
	}
}

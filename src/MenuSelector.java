import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemEvent;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

// changer le nom en RecipeSelector
@SuppressWarnings("serial")
public class MenuSelector extends JPanel {
	
	public JPanel[] menus = new JPanel[10];
	public Button[] buttons = new Button[4];
	public Image[] images = new Image[10];
	
	public Window window;
	public Modele modele;
	public Controleur controleur;
	
	public TextArea search_bar;
	
	Canvas menu_WEST_canvass[];
	String link_images[];
	TitledBorder title_borders[];
	JPanel menu_EASTs[];
	Label recipe_tagss[];
	
	public void reload() {
		System.out.println(title_borders);
		for(int i = 0; i < this.menus.length; i++) {
			try {
				link_images[i] = this.modele.current_recipes[i].img;
				menu_EASTs[i].setBorder(BorderFactory.createTitledBorder(modele.current_recipes[i].nomRecette));
				Label recipes_tags = recipe_tagss[i];
				try {
					for (int j = 0; j < (this.modele.current_recipes[i].getTags().length); j++) {
						System.out.println(j);
						System.out.println(this.modele.current_recipes[i].getTags());
						try {
							recipes_tags.setText(this.modele.current_recipes[i].getTags()[j]);
						} catch(NullPointerException e){
							recipes_tags.setText("");
						}
					}
				} catch(NullPointerException e) {
				}
			} catch(NullPointerException e) {
				link_images[i] = "";
				menu_EASTs[i].setBorder(BorderFactory.createTitledBorder(""));
			}
			
			menu_WEST_canvass[i].repaint();			
		}
	}
	
	public MenuSelector(Window w, Modele modele, Controleur controleur) {
		this.window = w;
		this.modele = modele;
		this.controleur = controleur;
		
		this.modele.rechercher("");
		
		this.modele.change_page();
		
		this.setLayout(new BorderLayout());
		
		Panel NORTH = new Panel();
		NORTH.setLayout(new BorderLayout());
		// debut contenu du haut de la page...
		
		Button search_button = new Button("Rechercher");
		search_button.addActionListener(controleur.search);
		NORTH.add(search_button, BorderLayout.EAST);
		
		this.search_bar = new TextArea("", 3 , 100 , TextArea.SCROLLBARS_NONE); 
		
		NORTH.add(this.search_bar, BorderLayout.CENTER);
		// ...fin contenu du haut de la page.
		NORTH.setPreferredSize(new Dimension(0, 50));
		this.add(NORTH, BorderLayout.NORTH);
		
		
		Panel CENTER = new Panel();
		CENTER.setLayout(new GridLayout(10, 1));
		
		// debut contenu du centre de la page...
		
		
		this.menu_WEST_canvass = new Canvas[this.menus.length];
		this.link_images = new String[this.menus.length];
		this.title_borders = new TitledBorder[this.menus.length];
		this.menu_EASTs = new JPanel[this.menus.length];
		this.recipe_tagss = new Label[this.menus.length];
		
		
		for(int i = 0; i < this.menus.length; i++) {
			JPanel menu = menus[i];
			final int final_i = i;
			
			
			menu = new JPanel();
			menu.setLayout(new BorderLayout());
			
			MouseListener mouse_listener = new MouseListener() {

				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
					modele.current_recipe = modele.current_recipes[final_i];
					window.change_panel();
				}

				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
			};
			
			JPanel menu_WEST = new JPanel();
			menu_WEST.setLayout(new BorderLayout());
			menu_WEST.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
			
			String link_image;
			if (this.modele.current_recipes[i] != null) {
				link_image = this.modele.current_recipes[i].img;
			} else {
				link_image = "";
			}
			link_images[i] = link_image;
			
			Canvas menu_WEST_canvas = new Canvas() {
				public void paint(Graphics g) {
					try {
						g.drawImage(ImageIO.read(new File(link_images[final_i])), 0, 0, this.getWidth(), this.getHeight(), this); // affichage image
					} catch (IOException e) {
						System.out.println("marche pas");
					}

				}
			};
			this.menu_WEST_canvass[i] = menu_WEST_canvas;
			
			menu_WEST_canvas.addMouseListener(mouse_listener);
			menu_WEST.add(menu_WEST_canvas, BorderLayout.CENTER);
			
			menu_WEST.setPreferredSize(new Dimension(100, 0));
			menu.add(menu_WEST, BorderLayout.WEST);
			
			
			JPanel menu_EAST = new JPanel();
			menu_EAST.setLayout(new BorderLayout());
			TitledBorder title_border;
			try {
				title_border = BorderFactory.createTitledBorder(this.modele.current_recipes[i].nomRecette);
			} catch(NullPointerException e) {
				title_border = BorderFactory.createTitledBorder("");
			}
			menu_EAST.setBorder(title_border);
			this.menu_EASTs[i] = menu_EAST;
			title_borders[i] = title_border;
			
			Panel menu_EAST_NORTH = new Panel();
			menu_EAST_NORTH.setLayout(new BorderLayout());
			
			Panel menu_EAST_NORTH_EAST = new Panel();
			
			
			
			
				
			
			
			
			Panel menu_EAST_NORTH_WEST = new Panel();
				menu_EAST_NORTH_WEST.setLayout(new BorderLayout());
				// debut de l'affichage du titre de la recette..
				/* Label recipe_title;
				try {
					recipe_title = new Label(this.modele.current_recipes[i].getNomRecette());
				} catch(NullPointerException e){
					recipe_title = new Label("");
				}
			
			recipe_title.addMouseListener(mouse_listener);
			
			menu_EAST_NORTH_WEST.add(recipe_title, BorderLayout.CENTER);
			*/
				// ..fin de l'affichage du titre de la recette
			menu_EAST_NORTH.add(menu_EAST_NORTH_WEST, BorderLayout.CENTER);
			
			menu_EAST_NORTH.setPreferredSize(new Dimension(0, 20));
			
			menu_EAST.add(menu_EAST_NORTH, BorderLayout.NORTH);
			
			
			Panel menu_EAST_SOUTH = new Panel();
			
			Label recipe_tags;
			recipe_tags = new Label("");
			try {
				for (int j = 0; j < (this.modele.current_recipes[i].getTags().length); j++) {
					System.out.println(j);
					System.out.println(this.modele.current_recipes[i].getTags());
					try {
						recipe_tags = new Label(this.modele.current_recipes[i].getTags()[j]);
					} catch(NullPointerException e){
						recipe_tags = new Label("");
					}
					menu_EAST_SOUTH.add(recipe_tags);
				}
			} catch(NullPointerException e) {
				menu_EAST_SOUTH.add(new Label(""));
			}
			recipe_tagss[i] = recipe_tags;
			
			
				
			menu_EAST.add(menu_EAST_SOUTH, BorderLayout.CENTER);
			
			menu.add(menu_EAST, BorderLayout.CENTER);
			
			CENTER.add(menu);
			

		}
		
		// ...fin contenu du centre de la page.
		this.add(CENTER, BorderLayout.CENTER);
		
		Panel SOUTH = new Panel();
		// debut contenu du bas de la page...
		String[] names = {"debut", "precedent", "suivant", "fin"};
		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new Button(names[i]);
			final int index = i;
			SOUTH.add(buttons[i]);
		}
		buttons[0].addActionListener(controleur.button_start);
		buttons[1].addActionListener(controleur.button_previous);
		buttons[2].addActionListener(controleur.button_next);
		buttons[3].addActionListener(controleur.button_end);
		
		// ...fin contenu du bas de la page.
		
		SOUTH.setPreferredSize(new Dimension(0, 50));
		this.add(SOUTH, BorderLayout.SOUTH);
	}
}

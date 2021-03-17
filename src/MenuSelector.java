import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;

// changer le nom en RecipeSelector
@SuppressWarnings("serial")
public class MenuSelector extends Panel {
	
	public Panel[] menus = new Panel[10];
	
	public MenuSelector() {
		
		this.setLayout(new BorderLayout());
		
		Panel NORTH = new Panel();
		
		
		NORTH.setPreferredSize(new Dimension(0, 50));
		this.add(NORTH, BorderLayout.NORTH);
		
		
		Panel CENTER = new Panel();
		CENTER.setLayout(new GridLayout(10, 1));
		
		int i = 0; // delete this
		for(Panel menu : menus) {
			final int index = i; // delete this
			
			menu = new Panel();
			menu.setLayout(new BorderLayout());
			
			Panel menu_WEST = new Panel();
			menu_WEST.setBackground(Color.MAGENTA); // delete this
			menu_WEST.setLayout(new BorderLayout());
			Canvas menu_WEST_canvas = new Canvas() {
				public void paint(Graphics g) {
					g.drawString("image " + String.valueOf(index), 20, 20); // delete this 
				}
			};
			menu_WEST.add(menu_WEST_canvas, BorderLayout.CENTER);
			
			menu_WEST.setPreferredSize(new Dimension(100, 0));
			menu.add(menu_WEST, BorderLayout.WEST);
			
			
			Panel menu_EAST = new Panel();
			
			menu_EAST.setBackground(Color.CYAN); // delete this
			menu_EAST.setLayout(new BorderLayout());
			Canvas menu_EAST_canvas = new Canvas() {
				public void paint(Graphics g) {
					g.drawString("texte inutile " + String.valueOf(index), 20, 20);
				}
			};
			menu_EAST.add(menu_EAST_canvas, BorderLayout.CENTER);
			
			menu.add(menu_EAST, BorderLayout.CENTER);
			
			CENTER.add(menu);
			
			i++; // delete this
		}
		
		this.add(CENTER, BorderLayout.CENTER);
		
		Panel SOUTH = new Panel();
		SOUTH.setPreferredSize(new Dimension(0, 50));
		this.add(SOUTH, BorderLayout.SOUTH);
	}
}

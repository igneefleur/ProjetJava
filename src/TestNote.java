import java.awt.Checkbox; 
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Polygon;

import javax.swing.JCheckBox;
import javax.swing.Icon;

public class TestNote {

public static void main(String[] args) {
    Frame frame =new Frame();
    frame.setLayout(new GridLayout(1,5));
    Icon icone = new Icon() {

		@Override
		public int getIconHeight() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getIconWidth() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void paintIcon(Component c, Graphics g, int x, int y) {
			// TODO Auto-generated method stub
			g.setColor(Color.red);
		    g.translate(x, y);
		    Polygon poly = new Polygon();
		    poly.addPoint(5,37);
		    poly.addPoint(0, 35);
		    
		    // interieur
		    poly.addPoint(7,31);
		    poly.addPoint(20, 21);
		    poly.addPoint(22, 14);
		    poly.addPoint(21,13);
		    poly.addPoint(19, 14);
		    poly.addPoint(15, 21);
		    poly.addPoint(7,31);
		    
		    //exterieur
		    poly.addPoint(0,35);
		    poly.addPoint(10, 20);
		    poly.addPoint(15, 13);
		    poly.addPoint(25, 10);
		    poly.addPoint(33, 15);
		    poly.addPoint(32,23);
		    g.fillPolygon(poly);
		    g.translate(-x, -y);
		  }
		
    	
    };
    
    
    
    JCheckBox[] etoiles = new JCheckBox[5];
    CheckboxGroup cbg = new CheckboxGroup();
    
    String[] descrip = { "", "","","",""};
    
    for (int i = 0; i<5; i++) {
    
    	JCheckBox cb = new JCheckBox(descrip[i], false);
    	
    	cb.setIcon(icone);
    	
    	
    	cb.setBounds(100,50*i,50,50); 
    	
    	frame.add(cb);
        
    }
    
    
    
    
    frame.setSize(400, 400);
    frame.setVisible(true);
    
    
    try {
        Thread.sleep(40000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    System.exit(0);
    
}

}

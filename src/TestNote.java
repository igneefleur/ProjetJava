import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;

public class TestNote {

public static void main(String[] args) {
    Frame frame =new Frame();
    
    
    Checkbox[] etoiles = new Checkbox[5];
    CheckboxGroup cbg = new CheckboxGroup();
    
    String[] descrip = { "1 etoiles", "2 etoiles","3 etoiles","4 etoiles","5 etoiles"};
    
    for (int i = 0; i<5; i++) {
    
    	Checkbox cb = new Checkbox(descrip, cbg, false);
    
    	
    	
    	
    	
    	
    	
    	
    	
    	cb.setBounds(100,50, 50,50); 
    	
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

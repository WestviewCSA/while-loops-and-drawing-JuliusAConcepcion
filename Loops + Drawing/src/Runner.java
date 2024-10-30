import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Runner extends JPanel{
	
	// Practice using Loops, random #s and 
	// methods
	public void paint(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(1));
        int x = 0;
        int y = 650;
        while(x <= 1000 && y > 0) {
        g2.drawLine(0, y, x, 0);
        x+=25;
        y-=25;
       
        }
        int x2 = 325;
        int y2 = 0;
        while(x2 <= 1000 && y2 < 650) {
        g2.drawLine(x2, 0, 1000, y2);
        x2+=25;
        y2+=25;
       
        }
        
        for(int x3 = 0, y3 = 0; x3 <= 1000 && y3 < 0; x3+=25, y3+=25) {
        	g2.drawLine(0, 0, x3, y3);
        }
        
        
        
        
		
	
	
	
	}


	public static void main(String[] arg) {
		Runner m = new Runner();
	}
	
	public Runner() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1000,650);
		f.add(this);
		f.setVisible(true);
		
	}
}

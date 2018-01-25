package hangman.view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class HangmanNoViolent extends Hangman {

	@Override
	public void setColor() {
		// TODO Auto-generated method stub
		
	}

	 public void paint(Graphics g){
	        super.paint(g);
	        ((Graphics2D)g).setStroke(new BasicStroke(5));
	        int panelWidth = this.getWidth();
	        int panelHeight = this.getHeight();        
	        
	        g.setColor(Color.blue);
	        if(incorrectCount > 0){	    
	        	g.drawLine((panelWidth / 4) - 10,((panelHeight/6)*2) + (panelHeight/18)-40,((panelWidth / 4) + 10) - (panelHeight/6)-12,
	                    (((panelHeight/6)*2) + (panelHeight/18))-(panelHeight/12)-44); // First !
	            g.fillOval((panelWidth/4)+ 10 - (panelHeight / 12),(panelHeight/6),panelHeight/6,panelHeight/6); // Head
	        }	        
	        if(incorrectCount > 1){
	        	g.drawLine((panelWidth / 4) + 4,((panelHeight/6)*2) + (panelHeight/18)-40,((panelWidth / 4) + 10) - (panelHeight/6)+12,
	                    (((panelHeight/6)*2) + (panelHeight/18))-(panelHeight/12)-44); // second !
	        	g.drawOval((panelWidth/4)+ 15- (panelHeight / 12),(panelHeight/6)*2,panelHeight/6-10,2*panelHeight/6);
	        }
	        if(incorrectCount > 2){
	        	g.drawLine((panelWidth / 4) + 10,(((panelHeight/6)*2) + (panelHeight/18))-(panelHeight/12)-44,((panelWidth / 4) + 10) - (panelHeight/6)+30,
	                    ((panelHeight/6)*2) + (panelHeight/18)-40); // 3 !
	            g.drawLine((panelWidth / 4) + 10,  (((panelHeight/6)*2) + (panelHeight/18))-(panelHeight/12),((panelWidth / 4) + 10) - (panelHeight/6),
	                  ((panelHeight/6)*2) + (panelHeight/18)); // Left Arm
	        }
	        if(incorrectCount > 3){
	        	g.drawLine((panelWidth / 4) + 18,((panelHeight/6)*2) + (panelHeight/18)-40,((panelWidth / 4) + 10) - (panelHeight/6)+45,
	                    (((panelHeight/6)*2) + (panelHeight/18))-(panelHeight/12)-44); // 4 !
	            g.drawLine((panelWidth / 4) + 10,(((panelHeight/6)*2) + (panelHeight/18))-(panelHeight/12),((panelWidth / 4) + 10) + (panelHeight/6),
	            		((panelHeight/6)*2) + (panelHeight/18)); // Right Arm
	        }
	        if(incorrectCount > 4){
	        	g.drawLine((panelWidth / 4) + 24,((panelHeight/6)*2) + (panelHeight/18)-40,((panelWidth / 4) + 10) - (panelHeight/6)+60,
	                    (((panelHeight/6)*2) + (panelHeight/18))-(panelHeight/12)-44); // 5 !
	            g.drawLine((panelWidth / 4) + 10,(panelHeight/6)*4,((panelWidth / 4) + 10) - (panelHeight/6),
	                    (((panelHeight/6)*4) + (panelHeight/18))+(panelHeight/12)); // Left Leg
	        }
	        if(incorrectCount > 5){
	            g.drawLine((panelWidth / 4) + 10,(panelHeight/6)*4,((panelWidth / 4) + 10) + (panelHeight/6),
	                    (((panelHeight/6)*4) + (panelHeight/18))+(panelHeight/12)); // Left Leg        
	        }
	    }

}

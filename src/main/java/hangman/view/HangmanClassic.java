package hangman.view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class HangmanClassic extends Hangman{

	Color[] colours;
	//method: paint
    //purpose: paint the panel with the features of a hangman game, depending on 
    // how many incorrect guesses by the player
	public HangmanClassic(){
		colours=new Color[]{Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK};
	}
	
    @Override
    public void paint(Graphics g){
        super.paint(g);
        ((Graphics2D)g).setStroke(new BasicStroke(5));
        int panelWidth = this.getWidth();
        int panelHeight = this.getHeight();
        createHorca(g,panelWidth,panelHeight);      
        
        
        if(incorrectCount > 0){
        	g.setColor(colours[0]);
            g.drawOval((panelWidth/4)+ 10 - (panelHeight / 12),(panelHeight/6),panelHeight/6,panelHeight/6); // Head
        }
        if(incorrectCount > 1){
        	g.setColor(colours[1]);
            g.drawLine((panelWidth / 4) + 10,(panelHeight/6)*2,(panelWidth / 4) + 10,(panelHeight/6)*3); // Torso
        }
        if(incorrectCount > 2){
        	g.setColor(colours[2]);
            g.drawLine((panelWidth / 4) + 10,((panelHeight/6)*2) + (panelHeight/18),((panelWidth / 4) + 10) - (panelHeight/6),
                    (((panelHeight/6)*2) + (panelHeight/18))-(panelHeight/12)); // Left Arm
        }
        if(incorrectCount > 3){
        	g.setColor(colours[3]);
            g.drawLine((panelWidth / 4) + 10,((panelHeight/6)*2) + (panelHeight/18),((panelWidth / 4) + 10) + (panelHeight/6),
                    (((panelHeight/6)*2) + (panelHeight/18))-(panelHeight/12)); // Right Arm
        }
        if(incorrectCount > 4){
        	g.setColor(colours[4]);
            g.drawLine((panelWidth / 4) + 10,(panelHeight/6)*3,((panelWidth / 4) + 10) - (panelHeight/6),
                    (((panelHeight/6)*3) + (panelHeight/18))+(panelHeight/12)); // Left Leg
        }
        if(incorrectCount > 5){
        	g.setColor(colours[5]);
            g.drawLine((panelWidth / 4) + 10,(panelHeight/6)*3,((panelWidth / 4) + 10) + (panelHeight/6),
                    (((panelHeight/6)*3) + (panelHeight/18))+(panelHeight/12)); // Left Leg        
        }
    }

	@Override
	public void setColor() {
		colours=new Color[]{Color.BLACK,Color.GREEN,Color.RED,Color.RED,Color.BLUE,Color.BLUE};				
	}
}

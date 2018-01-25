package hangman.view;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public abstract class Hangman extends JPanel implements Colorido{
int incorrectCount;
    
    public Hangman(){
        incorrectCount = 0;
    }

    //method: incrementIncorrectGuesses
    //purpose: increase the number of incorrect guesses from the player
    public void incrementIncorrectGuesses() {
        incorrectCount++;
    }

    //method: setIncorrectGuesses
    //purpose: manually setting number of incorrect guesses
    public void setIncorrectGuesses(int incorrectGuesses) {
        this.incorrectCount = incorrectGuesses;
    }
    
    public void createHorca(Graphics g, int panelWidth, int panelHeight){
        g.drawLine(10, panelHeight - 10, (panelWidth / 4) + 10, panelHeight - 10);
        g.drawLine(((panelWidth/4)/2) + 10, panelHeight - 10,((panelWidth/4)/2) + 10, 10);
        g.drawLine(((panelWidth/4)/2) + 10, 10, (panelWidth / 4) + 10, 10);
        g.drawLine((panelWidth / 4) + 10, 10, (panelWidth / 4) + 10, panelHeight / 6);
    }
    
}

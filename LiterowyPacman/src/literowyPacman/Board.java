package literowyPacman;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Board extends JPanel
		implements ActionListener
{
	    
	private final int B_WIDTH = 850;
	private final int B_HEIGHT = 850;
	private final int INITIAL_X = 0;
	private final int INITIAL_Y = 0;
        private final String WORD ="LiterowyPacman";
        
        private final int LENGTH = (WORD.length());
        
        private int timer = 0;
	private Image sprite, happy, theend;
	private int x, y;
        private boolean czy = true;      
        protected int[][] koordynaty = new int[LENGTH][2];
        protected int punkty = 0, step = 0;
        protected char[] tablicaChar;
        
	public Board () {
		
		initBoard();
		
	}
	
	private void loadImages () {
		
		ImageIcon ii = new ImageIcon("src\\literowyPacman\\pacman.png");
		sprite = ii.getImage();
                ImageIcon i2 = new ImageIcon("src\\literowyPacman\\happy.png");
		happy = i2.getImage();	
                ImageIcon i3 = new ImageIcon("src\\literowyPacman\\theend.png");
		theend = i3.getImage();
	}
        
       
	private void initBoard()
	{
		
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
		setDoubleBuffered(true);
		
                
		loadImages();
               
		x = INITIAL_X;
		y = INITIAL_Y;
		
                	
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);

                
                drawLetter(g);
                drawSprite(g);
                g.drawLine((B_WIDTH-50), 0, (B_WIDTH-50), (B_HEIGHT-50));
                g.drawLine(0, (B_HEIGHT-50), (B_WIDTH-50), (B_HEIGHT-50) );
                
                       if (x == koordynaty[step][0]){
                           
                           if (y+50 == koordynaty[step][1]){
                            
                            g.drawImage(happy, x, y, this);
                            koordynaty[step][0]=B_WIDTH-50;
                            koordynaty[step][1]=50+step*50;
                            g.drawString(String.valueOf(tablicaChar[step]) , (koordynaty[step][0]), (koordynaty[step][1]));
                            punkty += 5;
                            
                            g.drawString("--> Twoj wynik to " + punkty + " punktow!", 0, (B_HEIGHT-10));
                            step++;
                            
                            if (step>=LENGTH){
                                step = 0;
                            }
                           }
                    }
                
                
                if (punkty == (5*LENGTH)){
                  
                  g.drawImage(theend, 0, 0, this);
                  g.drawString("--> Twoj wynik to " + punkty + " punktow!", 0, (B_HEIGHT-10));
                }
	}
	
        protected int[][] setKoordynaty() {
            Random generator = new Random();
          
            while (czy){
            for (int i = 0; i < LENGTH; i++) {
                for (int j = 0; j < 2; j++) {
                    koordynaty[i][j]= (50 + 50 * generator.nextInt(15));
                } 
            }
            czy = false;
            }

            return   koordynaty;
        }
        
        private char[] tokenizeWord (String str){
            
            char[] charArray = str.toCharArray();
            return charArray;
        } 
        
                
        protected void drawLetter (Graphics b){
            int[][] koord;
            Font myFont = new Font("Serif", Font.BOLD, 50);
           
            b.setColor(Color.green);
            b.setFont(myFont);
            
            koord = setKoordynaty();
            tablicaChar = tokenizeWord(WORD);        
              
            for (int i = 0; i < LENGTH; i++) {
                b.drawString(String.valueOf(tablicaChar[i]) , koord[i][0], koord[i][1]);    
            }
            
        }   
           
        
	private void drawSprite (Graphics g) {
		
		g.drawImage(sprite, x, y, this);
		Toolkit.getDefaultToolkit().sync();
		
                if (x <0){
                    x=0;
                    repaint();
                }
                if (x > (B_WIDTH-100)){
                    x = (B_WIDTH-100);
                    repaint();
                }
                if (y <0){
                    y=0;
                    repaint();
                }
                if (y > (B_HEIGHT-100)){
                    y = (B_HEIGHT-100);
                    repaint();
                }
                
                
                
	}
	
	public void moveLeft()
	{
		x -= 50;
		
		repaint();
	}
	
	public void moveRight()
	{
		x += 50;
		
		repaint();
	}
	
	public void moveUp()
	{
		y -= 50;
		
		repaint();
	}
	
	public void moveDown()
	{
		y += 50;
		
		repaint();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		repaint();
		
	}

}

package literowyPacman;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class MainPacman extends JFrame implements KeyListener
{
	protected Board displayBoard;
        
        
	public MainPacman() {
		
		initUI();
		
	}
	
        
	protected void initUI()
	{		
		displayBoard = new Board();
		add(displayBoard);
		addKeyListener(this);
		setResizable(false);
                
		pack();
		
		setTitle("Literowy Pacman ver. 0.1");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
				
	}
	
	
	@Override
    public void keyTyped(KeyEvent e)
	{
    }

    @Override
    public void keyPressed(KeyEvent e)
	{
		switch(e.getKeyCode())
		{
			case KeyEvent.VK_LEFT:
				displayBoard.moveLeft();
				break;
			case KeyEvent.VK_RIGHT:
				displayBoard.moveRight();
				break;
			case KeyEvent.VK_UP:
				displayBoard.moveUp();
				break;
			case KeyEvent.VK_DOWN:
				displayBoard.moveDown();
				break;
			default:
				break;
		}
                
                
    }

    @Override
    public void keyReleased(KeyEvent e)
	{
		
    }
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(() -> {
                    JFrame ex = new MainPacman();
                    
                    ex.setVisible(true);
                });
		
	}
	
}

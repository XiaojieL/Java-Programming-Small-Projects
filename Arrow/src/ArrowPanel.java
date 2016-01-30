import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class ArrowPanel extends LinePanel implements KeyListener{
	private int x, y;
	private ImageIcon up = new ImageIcon("img/arrowUp.png");
	private ImageIcon down = new ImageIcon("img/arrowDown.png");
	private ImageIcon left = new ImageIcon("img/arrowLeft.png");
	private ImageIcon right = new ImageIcon("img/arrowRight.png");
	private ImageIcon icon;
	
	
	
	public ArrowPanel() {
		icon = up;
	    setPreferredSize (new Dimension(600, 600));
	    x = 300-25;
	    y = 300-30;
	  
	    
	    addMouseListener(this);
	    addKeyListener(this);
	    setFocusable(true);
        requestFocusInWindow();

	}
	
	public static void main (String[] args){
		JFrame frame = new JFrame ("Arrow");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

		ArrowPanel arrowP = new ArrowPanel();
		frame.getContentPane().add(arrowP);

		frame.pack();
		frame.setVisible(true);
	}
	
	public void paintComponent(Graphics page){
		super.paintComponent(page);
		setBackground(Color.black);
		
		icon.paintIcon(this, page, x, y);
		
		

	}
	


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_UP){
			icon = up;
			y -=10;
			repaint();
		
		}
		

		if(e.getKeyCode() == KeyEvent.VK_DOWN){
			icon = down;
			y += 10;
			repaint();
		}
		

		if(e.getKeyCode() == KeyEvent.VK_LEFT){
			icon = left;
			x -= 10;
			repaint();
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			icon = right;
			x += 10;
			repaint();
		}
		
		if(e.getKeyCode() == KeyEvent.VK_SPACE){
			
			x = this.getWidth()/2 - icon.getIconWidth()/2;
			y = this.getHeight()/2 - icon.getIconHeight()/2;
			repaint();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}

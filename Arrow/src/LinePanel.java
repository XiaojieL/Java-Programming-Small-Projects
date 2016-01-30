import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LinePanel extends JPanel implements MouseListener, MouseMotionListener{
	private Point point1, point2;
	private int x1,y1,x2,y2;
	
	

	
	public LinePanel() {
		
	    setPreferredSize (new Dimension(600, 600));
	    addMouseListener(this);
	    addMouseMotionListener(this);

	}
	
	public static void main (String[] args){
		JFrame frame = new JFrame ("Line");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

		LinePanel lineP = new LinePanel();
		frame.getContentPane().add(lineP);

		frame.pack();
		frame.setVisible(true);
	}
	
	
	public void paintComponent(Graphics page){
		super.paintComponent(page);
		setBackground(Color.black);
		page.setColor(Color.yellow);
		page.drawLine(x1,y1,x2,y2);
	

	}
	


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		point1 = new Point (e.getX(),e.getY());
		x1 = point1.x;
		y1 = point1.y;
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}







	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		point2 = new Point(e.getX(),e.getY());
		x2 = point2.x;
		y2 = point2.y;
		repaint();
	}












	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}

package ForTheGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ForTheGame1 extends JPanel {							//This extension is needed
	int x = 0;
	int y = 200;
	
	private void moveBall(){
		x +=15;
		y = y;
	}

	@Override
	public void paint(Graphics g){
		super.paint(g);												//With super. we call ForTheGame1 end that way we delete the screen 
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(Color.RED);
		g2d.fillOval(x, y, 50, 50);
		
			
	}
	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Submarine");
		ForTheGame1 game = new ForTheGame1();						//
		frame.add(new ForTheGame1());								//And this frame.add so that the two classes can work together
		frame.add(game);											//
		frame.setSize(800, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while(true){
			game.moveBall();
			game.repaint();
			Thread.sleep(50);
		}
	}

}

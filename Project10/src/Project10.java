// James Dizikes
// CS 1324 Fall 2019
// Maintained by D. Trytten 4/12/2020
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Project10 extends JPanel
{
	// Change these constants to adjust the size and title of the window.
	private static final int WIDTH = 640;
	private static final int HEIGHT = 480;
	private static final String WINDOW_TITLE = "My Image Title!";
	
	// Do not change the main method.
	public static void main(String[] args)
	{
		JPanel panel = new Project10();
		panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		JFrame frame = new JFrame(WINDOW_TITLE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		frame.pack();
	}
	
	// Add your drawing code to this method.
	public void paintComponent(Graphics g)
	{
		// Do not change these two lines.
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		// Replace the example below with your code.
		
		// Draw a horizontal, blue line in the middle of the screen.
		Line2D.Double line = new Line2D.Double(0, HEIGHT/2, WIDTH, HEIGHT/2);
		
		//grass
		
		Rectangle2D.Double grass = new Rectangle2D.Double(0, HEIGHT/2 + 100, WIDTH, 200);
		g2d.setColor(new Color(0 , 148, 0));
		g2d.draw(grass);
		g.fillRect(0, HEIGHT/2 + 100, WIDTH, 200);
		
		//house
		Rectangle2D.Double house = new Rectangle2D.Double(WIDTH/2 -100 , HEIGHT/2 - 100, 200, 200);
		g2d.setColor(new Color(152, 0, 0));
		g.fillRect(WIDTH/2 -100 , HEIGHT/2 - 100, 200, 200);
		g2d.draw(house);
		
		//roof
		Polygon roof = new Polygon();
		roof.addPoint(WIDTH/2 -100, HEIGHT/2 -100);
		roof.addPoint(WIDTH/2, HEIGHT/2 - 200);
		roof.addPoint(WIDTH/2 + 100, HEIGHT/2 -100);
		g2d.setColor(new Color(150, 75, 0));
		g2d.setStroke(new BasicStroke((float) 7));
		g.fillPolygon(roof);
		g2d.draw(roof);
		
		// windows
		Ellipse2D.Double window1 = new Ellipse2D.Double(WIDTH / 2 -60, HEIGHT/2 -15, 40, 40 );
		Ellipse2D.Double window2 = new Ellipse2D.Double(WIDTH / 2 + 20, HEIGHT/2 -15, 40, 40 );
		g2d.setColor(new Color(137,207, 240));
		g2d.fill(window1);
		g2d.fill(window2);
		g2d.draw(window1);
		g2d.draw(window2);
		
		// door
		Rectangle2D.Double door = new Rectangle2D.Double(WIDTH/2 - 30, HEIGHT/2 +35, 60, 62);
		g2d.setColor(new Color(152,80, 0));
		g2d.fill(door);
		g2d.draw(door);
		
		
		
		
		// Draw a vertical, red line in the middle of the screen.
		
	}
}
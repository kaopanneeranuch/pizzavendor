package Logo;

import java.awt.*;

import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class Logo extends JPanel implements ActionListener{
	
	private Timer timer = new Timer(100,this);
	private Random r = new Random();
	
	public Logo(){
		timer.start();
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(new Color(238,184,66));
		g.fillOval(0,0,100,100);
		
		g.setColor(new Color(225,225,162));
		g.fillOval(10,10,80,80);
		
		g.setColor(new Color(238,184,66));
		g.drawLine(50, 0, 50, 100);
		g.drawLine(0, 50, 100, 50);
		
		g.setColor(Color.BLACK);
		g.setFont(new Font("Arail", Font.BOLD, 32));
		g.drawString("Pizza Shop", 150, 50);
		
	}
	protected void drawVeg(Graphics g){
		g.setColor(new Color(78,156,90));
		g.fillRect(getRandomXVeg(), getRandomYVeg(), 10, 10);
	}
	
	private void drawPep(Graphics g) {
		g.setColor(new Color(144,30,30));
		g.fillOval(getRandomXPep(), getRandomYPep(), 15, 15);
	}
	
	private int getRandomXVeg() {
		return 5 + r.nextInt(50);
	}
	
	private int getRandomYVeg() {
		return 5 + r.nextInt(50);
	}
	
	private int getRandomXPep() {
		return 5 + r.nextInt(50);
	}
	
	private int getRandomYPep() {
		return 5 + r.nextInt(50);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Graphics g = getGraphics();
		for(int i=0; i>10; i++) {
			System.out.println("hghghgh");
			getRandomXVeg();
			getRandomYVeg();
			drawVeg(g);
			getRandomXPep();
			getRandomYPep();
			drawPep(g);
		}
		
		repaint();
	}
}

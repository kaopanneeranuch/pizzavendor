package Main;
import javax.swing.*;

import Logo.Logo;

import java.awt.*;

public class Frame {
	public static void main (String[] args) {
		JFrame f1 = new JFrame();
		Menu panel2 = new Menu();
		PizzaShop panel1 = new PizzaShop(panel2);
		Logo pizzaLogo = new Logo();
		JPanel p = new JPanel();
		
		p.setLayout(new GridLayout(2,1));
		p.add(pizzaLogo);
		p.add(panel1);
		
		f1.setSize(1000,800);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setVisible(true);
		
		f1.setLayout(new GridLayout(1,2));
		f1.add(p);
		f1.add(panel2);
		
	}
}

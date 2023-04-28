package Main;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PizzaShop extends JPanel implements ActionListener{
	
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JButton menu1 = new JButton("Pepperoni");
	JButton menu2 = new JButton("Cheese");
	JButton menu3 = new JButton("Veggie");
	JButton menu4 = new JButton("Hawaiian");
	JPanel menu1p = new JPanel();
	JPanel menu2p = new JPanel();
	JPanel menu3p = new JPanel();
	JPanel menu4p = new JPanel();
	JButton add = new JButton();
	ImageIcon imgcheese;
	JLabel displaycheese;
	ImageIcon imghawaiian;
	JLabel displayhawaiian;
	ImageIcon imgpepporoni;
	JLabel displaypepporoni;
	ImageIcon imgveggie;
	JLabel displayveggie;


	Menu menu;
	
	PizzaShop(Menu menu){

		this.menu = menu;

		try{
			imgcheese = new ImageIcon(getClass().getResource("/Picture/cheese.png"));
			displaycheese = resize(imgcheese);
			imghawaiian = new ImageIcon(getClass().getResource("/Picture/hawaiian.png"));
			displayhawaiian = resize(imghawaiian); 
			imgpepporoni = new ImageIcon(getClass().getResource("/Picture/pepporoni.png"));
			displaypepporoni = resize(imgpepporoni); 
			imgveggie = new ImageIcon(getClass().getResource("/Picture/veggie.png"));
			displayveggie = resize(imgveggie); 
		}catch (Exception ex){}

		menu1p.add(displaypepporoni);
		menu1p.add(menu1);

		menu2p.add(displaycheese);
		menu2p.add(menu2);

		menu3p.add(displayveggie);
		menu3p.add(menu3);

		menu4p.add(displayhawaiian);
		menu4p.add(menu4);

		p1.setLayout(new FlowLayout());
		p1.add(menu1p);
		p1.add(menu2p);
		p2.setLayout(new FlowLayout());
		p2.add(menu3p);
		p2.add(menu4p);
		
		this.setLayout(new GridLayout(2,1));
		this.add(p1);
		this.add(p2);
	
		
		menu1.addActionListener(this);
		menu2.addActionListener(this);
		menu3.addActionListener(this);
		menu4.addActionListener(this);
	
	}

	JLabel resize (ImageIcon img){

		Image imgget;
		Image resizedImg;
		ImageIcon resizedIcon;
		JLabel label;
			
		imgget = img.getImage();
		resizedImg = imgget.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		resizedIcon = new ImageIcon(resizedImg);
		label = new JLabel(resizedIcon);

		return label;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == menu1) {
			menu.countPrice = 200;
			menu.checkOrder = true;
		}else if (e.getSource() == menu2) {
			menu.countPrice = 250;
			menu.checkOrder = true;
		}else if (e.getSource() == menu3) {
			menu.countPrice = 300;
			menu.checkOrder = true;
		}else if (e.getSource() == menu4) {
			menu.countPrice = 350;
			menu.checkOrder = true;
			System.out.print(menu.checkOrder);
		}
	}
}

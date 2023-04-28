package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JPanel implements ActionListener{
    
    PizzaShop pizza = new PizzaShop(this);
    JLabel title = new JLabel("Order Summary", SwingConstants.CENTER);
    JLabel item = new JLabel("No Item", SwingConstants.CENTER);
    JLabel price = new JLabel("Price: ");
    JPanel p = new JPanel();
    JPanel p1 = new JPanel();
    JRadioButton cheese = new JRadioButton("Extra Cheese");
    JRadioButton sauce = new JRadioButton("Extra Sauce");
    JRadioButton size = new JRadioButton("Extra Size");
    JButton pricebt = new JButton("PRICE");
    JButton reset = new JButton("Reset");
	JPanel resetp = new JPanel(new FlowLayout());
    private Timer timer = new Timer(100, this);
    int countPrice;
    boolean checkOrder;
    
    Menu(){
        timer.start();
        this.setLayout(new GridLayout(3,1));
        p.setLayout(new GridLayout(3,1));
        
        p.add(title);
        p.add(cheese);
        p.add(sauce);
        p.add(size);

        p1.add(p);
        p1.add(pricebt);
        p1.add(price);
        
        title.setFont(new Font("Arial", Font.BOLD, 20));
        item.setFont(new Font("Arial", Font.BOLD, 16));

		resetp.add(reset);
        
        this.add(title);
		this.add(resetp);
        this.add(item);
        
        cheese.addActionListener(this);
        sauce.addActionListener(this);
        size.addActionListener(this);
        pricebt.addActionListener(this);
        reset.addActionListener(this);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cheese && cheese.isSelected()) {
            countPrice += 50;
        } else if (e.getSource() == sauce && sauce.isSelected()) {
            countPrice += 30;
        } else if (e.getSource() == size && size.isSelected()) {
            countPrice += 40;
        } else if (e.getSource() == timer) {
            if (checkOrder) {
                this.removeAll();
                this.add(title);
                this.add(p1);
				this.add(resetp);
                this.revalidate();
            }
        } else if (e.getSource() == pricebt) {
            price.setText("Price: " + countPrice);
        } else if (e.getSource() == reset) {
			cheese.setSelected(false);
			sauce.setSelected(false);
			size.setSelected(false);
			countPrice = 0;
			checkOrder = false;
			price.setText("Price: ");
			this.remove(p1);
            this.add(item);
            this.revalidate();
        }
    }
}

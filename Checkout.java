package kioskGui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;



public class Checkout{
	private JTextField textField;
	double BurgerTotal,DrinkTotal, SideTotal;
	double NumBurgers, NumSides, NumDrinks;
	
	
	

	private JFrame f = new JFrame("Checkout");

	/**
	 * Launch the application.
	 * @wbp.parser.entryPoint
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Checkout window = new Checkout();
					window.f.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	double ConvertBurgers(String a) {
		BurgerTotal = Double.parseDouble(a);
		//NumBurgers = Double.parseDouble(b);
		
		return (BurgerTotal);
	}
	void ConvertDrinks(String c, String d) {
		DrinkTotal = Double.parseDouble(c);
		NumDrinks = Double.parseDouble(d);
		
	}
	void ConvertSides(String e, String f) {
		SideTotal = Double.parseDouble(e);
		NumSides = Double.parseDouble(f);
	}
	
	
	double total = BurgerTotal;
	String t = String.valueOf(total);
	
	double items = NumBurgers + NumDrinks + NumSides;
	
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void CheckoutTotal(String y) {
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300,300);
		f.setVisible(true);
		f.getContentPane().setBackground(new Color(255, 255, 204));
        f.setBounds(100, 100, 679, 693);
        f.getContentPane().setLayout(null);
        
        
        
        //Displays total price
        textField = new JTextField();
        textField.setEditable(false);
        textField.setBounds(390, 407, 130, 26);
        textField.setText(y);
        f.getContentPane().add(textField);
        textField.setColumns(10);
        
        JLabel lblTotalPrice = new JLabel("Total Price:");
        lblTotalPrice.setBounds(309, 412, 82, 16);
        f.getContentPane().add(lblTotalPrice);
		

        
        
      

	}

}


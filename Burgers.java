package kioskGui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Burgers{

	private JFrame f = new JFrame("Burgers");
	double total = 0.00;
	double i = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Burgers window = new Burgers();
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
	public Burgers() {
		
		NumberFormat formatter = new DecimalFormat("#0.00");
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300,300);
		f.setVisible(true);
		f.getContentPane().setBackground(new Color(255, 255, 204));
        f.setBounds(100, 100, 679, 693);
        f.getContentPane().setLayout(null);
        
        JTextField textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(807, 420, 124, 34);
		f.getContentPane().add(textField);
		textField.setColumns(10);
        
		//WHOPPER
        JButton btnWhopper = new JButton("Whopper");
        btnWhopper.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                
                total = total + 3.00;
                textField.setText(formatter.format(total));
                i++;
                
        	}
        });
        btnWhopper.setBounds(27, 6, 227, 189);
        f.getContentPane().add(btnWhopper);
        
        JLabel lblWhopper = new JLabel("Whopper");
        lblWhopper.setBounds(117, 198, 61, 16);
        f.getContentPane().add(lblWhopper);
        
     	
     	//BIG MAC
     	JButton btnNewButton_1 = new JButton("Big Mac");
     	btnWhopper.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                
                total = total + 2.50;
                textField.setText(formatter.format(total));
                i++;
                
        	}
        });
     	btnNewButton_1.setBounds(27, 226, 227, 189);
     	f.getContentPane().add(btnNewButton_1);
     	
     	JLabel lblBigMac = new JLabel("Big Mac");
     	lblBigMac.setBounds(117, 420, 61, 16);
     	f.getContentPane().add(lblBigMac);
     	
     	//Big Joe's Burger
     	JButton btnNewButton_2 = new JButton("Big Joe's Burger");
     	btnWhopper.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                
                total = total + 4.00;
                textField.setText(formatter.format(total));
                i++;
                
        	}
        });
     	btnNewButton_2.setBounds(27, 448, 227, 189);
     	f.getContentPane().add(btnNewButton_2);
     	
     	JLabel lblNewLabel = new JLabel("Big Joe's Burger");
     	lblNewLabel.setBounds(89, 649, 109, 16);
     	f.getContentPane().add(lblNewLabel);
     	
     	
     	
        // SUBMIT Button
     	JButton btnNewButton = new JButton("SUBMIT");
     	btnNewButton.addActionListener(new ActionListener() {
     		public void actionPerformed(ActionEvent e) 
     		{
     			
     			//String index = String.valueOf(i);
     			Checkout ch = new Checkout();
     			ch.CheckoutTotal(textField.getText());
     		}
    				
   			});
     	btnNewButton.setBounds(324, 401, 89, 23);
     	f.getContentPane().add(btnNewButton);
     	
     	
    
   
        

        
        

		
	

	}
}
	

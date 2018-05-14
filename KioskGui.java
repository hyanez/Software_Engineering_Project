package kioskGui;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.util.Date;
import java.awt.BorderLayout;
import java.awt.Checkbox;
import javax.swing.JCheckBox;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class KioskGui {

    private JFrame frame;
    private JTextField Payment;
    //double total = 0.00;
    public static JTextArea txtrTime;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    KioskGui window = new KioskGui();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    
    

    
    public KioskGui() {
        initialize();
        
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        
        NumberFormat formatter = new DecimalFormat("#0.00");
        
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(255, 255, 204));
        frame.setBounds(100, 100, 679, 693);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JLabel lblTotal = new JLabel("Total.................");
        lblTotal.setBounds(493, 486, 100, 43);
        frame.getContentPane().add(lblTotal);
        
        JLabel lblPayment = new JLabel("Payment...............");
        lblPayment.setBounds(493, 573, 105, 20);
        frame.getContentPane().add(lblPayment);
        
        //List of selected items
        JTextArea txtpnItemlist = new JTextArea();
        txtpnItemlist.setBackground(SystemColor.window);
        txtpnItemlist.setBounds(493, 74, 180, 395);
        frame.getContentPane().add(txtpnItemlist);
        txtpnItemlist.setEditable(false);
        
        //Displays total amount of money due
        JTextPane txtpnTotalDisplay = new JTextPane();
        txtpnTotalDisplay.setBackground(SystemColor.window);
        txtpnTotalDisplay.setBounds(596, 496, 77, 21);
        frame.getContentPane().add(txtpnTotalDisplay);
        txtpnTotalDisplay.setEditable(false);
        
        //Field to enter payment given to cashier
        Payment = new JTextField();
        Payment.setBackground(SystemColor.window);
        Payment.setBounds(596, 572, 77, 21);
        frame.getContentPane().add(Payment);
        Payment.setColumns(10);
        
        //Text area to display change due to customer
        JTextPane txtpnChangedisplay = new JTextPane();
        txtpnChangedisplay.setBackground(SystemColor.window);
        txtpnChangedisplay.setBounds(596, 644, 77, 21);
        frame.getContentPane().add(txtpnChangedisplay);
        txtpnChangedisplay.setEditable(false);
        
        //Button to calculate change due to customer
        JButton btnChange = new JButton("Change");
        btnChange.setBounds(493, 644, 91, 21);
        frame.getContentPane().add(btnChange);
        btnChange.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                double a = Double.parseDouble(txtpnTotalDisplay.getText());
                double b = Double.parseDouble(Payment.getText()); 
                double c = b - a;                
                txtpnChangedisplay.setText('$' + String.valueOf(c));
            }
        });
        
        //Food item buttons
        /*JButton btnBurger = new JButton("Burger");
        btnBurger.setBounds(6, 77, 202, 190);
        frame.getContentPane().add(btnBurger);
        btnBurger.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                txtpnItemlist.append("Burger..........$3.00\r\n");
                total = total + 3.00;
            
                txtpnTotalDisplay.setText(formatter.format(total));
                txtpnTotalDisplay.repaint();
            }
        });*/
        
       
		// Burger Button
		JButton btnBurger = new JButton("Burger");
		btnBurger.setBounds(6, 77, 202, 190);
		frame.getContentPane().add(btnBurger);
		btnBurger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				//frame.dispose();
				new Burgers();
			}
		});
		

        
        JButton btnSides = new JButton("Sides");
        btnSides.setBounds(6, 279, 202, 190);
        frame.getContentPane().add(btnSides);    
        /*btnSides.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                txtpnItemlist.append("Fries..........$2.00\r\n");
                total = total + 2.00;
            
                txtpnTotalDisplay.setText(formatter.format(total));
                txtpnTotalDisplay.repaint();
            }
        });*/
        
        JButton btnDrink = new JButton("Drink");
        btnDrink.setBounds(6, 480, 202, 185);
        frame.getContentPane().add(btnDrink);
        
        /*btnDrink.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                txtpnItemlist.append("Drink..........$2.00\r\n");
                total = total + 2.00;
            
                txtpnTotalDisplay.setText(formatter.format(total));
                txtpnTotalDisplay.repaint();
            }
        });*/
        
        JTextArea txtrTime = new JTextArea();
        txtrTime.setFont(new Font("AppleGothic", Font.BOLD, 20));
        txtrTime.setEditable(false);
        txtrTime.setBackground(new Color(255, 255, 204));
        txtrTime.setBounds(499, 9, 180, 53);
        frame.getContentPane().add(txtrTime);
        
        JLabel lblFoodKiosk = new JLabel("Food Kiosk");
        lblFoodKiosk.setFont(new Font("Impact", Font.BOLD, 62));
        lblFoodKiosk.setBounds(6, 13, 317, 52);
        frame.getContentPane().add(lblFoodKiosk);
        
        JCheckBox checkBox = new JCheckBox("TakeOut");
        checkBox.setBounds(359, 39, 128, 23);
        frame.getContentPane().add(checkBox);
        
        JCheckBox chckbxDineIn = new JCheckBox("Dine In");
        chckbxDineIn.setBounds(359, 10, 128, 23);
        frame.getContentPane().add(chckbxDineIn);
        
        //Where user can input comments and rate us.
        JLabel lblComments = new JLabel("Comments:");
        lblComments.setBounds(220, 519, 91, 16);
        frame.getContentPane().add(lblComments);
       
        JTextPane textPaneComment = new JTextPane();
        textPaneComment.setBounds(220, 541, 249, 111);
        frame.getContentPane().add(textPaneComment);
        
    }
}

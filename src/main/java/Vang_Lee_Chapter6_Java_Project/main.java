package Vang_Lee_Chapter6_Java_Project;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main {

	private JFrame frame;
	private JTextField numerator;
	private JTextField denominator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
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
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		numerator = new JTextField();
		numerator.setText("numerator");
		numerator.setBounds(23, 67, 96, 19);
		frame.getContentPane().add(numerator);
		numerator.setColumns(10);
		
		JLabel Num = new JLabel("Num");
		Num.setBounds(44, 44, 45, 13);
		frame.getContentPane().add(Num);
		
		denominator = new JTextField();
		denominator.setText("denominator");
		denominator.setBounds(23, 122, 96, 19);
		frame.getContentPane().add(denominator);
		denominator.setColumns(10);
		
		JLabel Den = new JLabel("Den");
		Den.setBounds(43, 99, 45, 13);
		frame.getContentPane().add(Den);
		
		JLabel calculation = new JLabel("division");
		calculation.setBounds(184, 96, 62, 19);
		frame.getContentPane().add(calculation);
		
		JButton Calculate = new JButton("Calculate");
		Calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		Calculate.setBounds(304, 92, 85, 21);
		frame.getContentPane().add(Calculate);
		
		
		
		
		Calculate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double num = Double.parseDouble(numerator.getText());
				double den = Double.parseDouble(denominator.getText());
				SimpleMath Math = new SimpleMath();
				 
				try { 	
					double result = Math.divide(num, den);			}
				catch ( ArithmeticException e1) {
					calculation.setText("Cannot divide by 0");
					
				}
				}
			});
	}
}

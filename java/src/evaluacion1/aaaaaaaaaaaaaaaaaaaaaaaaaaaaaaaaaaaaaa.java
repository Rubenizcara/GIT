package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6055034503420411584L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa frame = new aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		textField = new JTextField();
		toolBar.add(textField);
		textField.setColumns(10);
		
		JButton btnAceptar = new JButton("ACEPTAR");
		toolBar.add(btnAceptar);
		
		JLabel lblPedroPicapiedra = new JLabel("Pedro picapiedra");
		contentPane.add(lblPedroPicapiedra, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 3, 0, 0));
		
		JButton btnHola = new JButton("hola");
		panel.add(btnHola);
		
		JButton button = new JButton("2");
		panel.add(button);
		
		JButton button_1 = new JButton("3");
		panel.add(button_1);
		
		JButton btnAdios = new JButton("adios");
		panel.add(btnAdios);
	}

}

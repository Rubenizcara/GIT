package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class VentanaActionListenerComunBoton extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7432671980495821429L;
	private JPanel contentPane;
	private JLabel lbltexto;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JPanel panelBotones;
	private JPanel panel;
	private JLabel lblPulsaUnBoton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaActionListenerComunBoton frame = new VentanaActionListenerComunBoton();
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
	public VentanaActionListenerComunBoton() {
		setTitle("Hola");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 145);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lbltexto = new JLabel("Ningun boton pulsado ");
		lbltexto.setBackground(new Color(204, 102, 0));
		lbltexto.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbltexto.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbltexto, BorderLayout.SOUTH);
		
		panelBotones = new JPanel();
		panelBotones.setBackground(new Color(153, 0, 0));
		contentPane.add(panelBotones, BorderLayout.CENTER);
		
		btn1 = new JButton("1");
		btn1.setFont(new Font("Segoe UI Emoji", Font.BOLD, 11));
		btn1.setForeground(Color.DARK_GRAY);
		
		btn1.setBackground(Color.WHITE);
		panelBotones.add(btn1);
		btn1.addActionListener(this);
		
		btn2 = new JButton("2");
		btn2.setFont(new Font("Segoe UI Emoji", Font.BOLD, 11));
		btn2.setForeground(Color.DARK_GRAY);
		btn2.setBackground(Color.WHITE);
		btn2.addActionListener(this);
		panelBotones.add(btn2);
		
		btn3 = new JButton("3");
		btn3.setFont(new Font("Segoe UI Emoji", Font.BOLD, 11));
		btn3.setForeground(Color.DARK_GRAY);
		btn3.setBackground(Color.WHITE);
		btn3.addActionListener(this);
		panelBotones.add(btn3);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		lblPulsaUnBoton = new JLabel("PULSA UN BOTON");
		lblPulsaUnBoton.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblPulsaUnBoton);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		String mensaje="";
		//condicional 
		Object o = ae.getSource();
		
		if (o == btn1){
		// si se ha pulsado btn1
			mensaje =("se ha pulsado el 1");
		}
		else if (o == btn2){
		// si se ha pulsado btn2
			mensaje ="se ha pulsado el 2";
		}
		else if (o == btn3){
		// si se ha pulsado btn3
			mensaje ="se ha pulsado el 3";
		}
		lbltexto.setText(mensaje);
		}}
		
	



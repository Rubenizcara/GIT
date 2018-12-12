package examen1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Examen1Menu extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2273407437605657701L;
	private JPanel contentPane, panel;
	private JTextField textField;
	private JLabel lblResultado;
	private JButton btnEsPrimo, btnCircunferencia, btn10Multiplos, btnParImpar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen1Menu frame = new Examen1Menu();
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
	public Examen1Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		lblResultado = new JLabel("Resultado");
		contentPane.add(lblResultado, BorderLayout.SOUTH);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 0, 0));
		
		btnEsPrimo = new JButton("EsPrimo");
		panel.add(btnEsPrimo);
		btnEsPrimo.addActionListener(this);
		
		btnCircunferencia = new JButton("Circunferencia");
		panel.add(btnCircunferencia);
		btnCircunferencia.addActionListener(this);
		
		btn10Multiplos = new JButton("10 Multiplos");
		panel.add(btn10Multiplos);
		btn10Multiplos.addActionListener(this);
		
		btnParImpar = new JButton("Par o Impar");
		panel.add(btnParImpar);
		btnParImpar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		
		double numero = Integer.parseInt(textField.getText());
		double radio;
		double diametro;
		double circunferencia;
		double posicion = 1;
		double multiplo;
		
		Object o = evento.getSource();
		
		if (btnEsPrimo == o) {
			if(numero/numero == 1 || numero/1 == numero) {
				lblResultado.setText(" El número " +(int)numero+ " es primo");
			}
					
			else {
				lblResultado.setText("El número " +(int)numero+ " no es primo");
			}
			}
		
		
		else if (btnCircunferencia == o) {
			
			radio = numero;
			diametro = radio * 2;
			circunferencia = (Math.PI * diametro);
			lblResultado.setText(" El valor de la circunferencia de radio " +radio+ " es " +circunferencia);
		}
		
		else if(btn10Multiplos == o){
			multiplo = numero;
			//if (posicion <=10);{
			do {
				multiplo = multiplo + numero;
				posicion = posicion + 1;
			}while(posicion <10);

			lblResultado.setText("Los 10 primeros múltiplos de " +numero+ " son " +multiplo);
		}
		
		else if (btnParImpar == o){
			if ((numero % 2) == 0) {
				lblResultado.setText("El número " +(int)numero+ " es par");
			}
			else {
				lblResultado.setText("El número " +(int)numero+ " es impar");
			}
		}
	}

}

package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;


public class BotonesMensajes extends JFrame implements ActionListener{

	private static final long serialVersionUID = -7432671980495821429L;
	private JPanel contentPane;
	private JButton btnHola;
	private JButton btnKaixo;
	private JButton btnAdios;
	private JButton btnAgur;
	private JPanel panel;
	private JLabel lblMensaje;
	private JTextField txtNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BotonesMensajes frame = new BotonesMensajes();
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
	public BotonesMensajes() {
		setResizable(false);
		setTitle("VentanaActionListenerComunFoco");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 164);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(2, 2, 0, 0));
		
		btnAdios = new JButton("Adios");
		btnAdios.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnAdios.setForeground(Color.WHITE);
		btnAdios.setBackground(Color.DARK_GRAY);
		btnAdios.addActionListener(this);
		panel.add(btnAdios);
		
		btnHola = new JButton("Hola");
		btnHola.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnHola.setForeground(Color.WHITE);
		btnHola.setBackground(Color.DARK_GRAY);
		btnHola.addActionListener(this);
		panel.add(btnHola);
		
		btnKaixo = new JButton("Kaixo");
		btnKaixo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnKaixo.setForeground(Color.WHITE);
		btnKaixo.setBackground(Color.DARK_GRAY);
		btnKaixo.addActionListener(this);
		panel.add(btnKaixo);
		
		btnAgur = new JButton("Agur");
		btnAgur.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnAgur.setForeground(Color.WHITE);
		btnAgur.setBackground(Color.DARK_GRAY);
		btnAgur.addActionListener(this);
		panel.add(btnAgur);
		
		lblMensaje = new JLabel("No hay mensaje ");
		lblMensaje.setBackground(new Color(192, 192, 192));
		lblMensaje.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblMensaje, BorderLayout.SOUTH);
		
		txtNombre = new JTextField();
		txtNombre.setBackground(Color.WHITE);
		contentPane.add(txtNombre, BorderLayout.NORTH);
		txtNombre.setColumns(10);
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		String mensaje="";
		//cojo el boton del mensaje que se ha pulsado 
		//obtengo el boton que ha sido pulsado
		Object o = ae.getSource();
		//obtengo el texto de ese boton y se lo doy a mensaje
		mensaje = ((JButton)o).getText();
		//completo el mensaje con el texto
		mensaje = mensaje + " " +txtNombre.getText();
		// muestro el mensaje en la etiqueta 
		lblMensaje.setText(mensaje);
		
		/*if (o == btnHola){
		// si se ha pulsado hola
			mensaje =("Hola "+textNombre.getText());
		}
		else if (o == btnAgur){
		// si se ha pulsado agur
			mensaje =("Agur "+textNombre.getText());
		}
		else if (o == btnKaixo){
		// si se ha pulsado kaixo
			mensaje =("Kaixo "+textNombre.getText());
		}
		else if (o == btnAdios)
		//si he pulsado el boton adios
		{mensaje =("Adios "+textNombre.getText());
		}*/
		lblMensaje.setText(mensaje);
		}}

package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class VentanaJPasswordField extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7432671980495821429L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblUsuario;
	private JLabel lblResultado;
	private JButton btnAceptar;
	private JPasswordField pwdPassword;
	private JLabel lblContrasea;
	private JTextField txtUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaJPasswordField frame = new VentanaJPasswordField();
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
	public VentanaJPasswordField() {
		setType(Type.UTILITY);
		setTitle("Hola");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 111);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		lblUsuario = new JLabel("Usuario");
		panel.add(lblUsuario);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//acciones a realizar al pulsar el botón
				//Tiene que comprobar si es correcto el usuario y 
				//la contraseña al pulsar el boton de aceptar
				String usuario = txtUsuario.getText();
				String password = new String(pwdPassword.getPassword());
				String mensaje;
				
				if (usuario.equals("1dw3")&& password.equals("1dw3")){
					//si los datos coinciden
					mensaje = "bienvenido" +txtUsuario.getText();
				}
				
				else {
					//si los datos no coinciden
					mensaje = "datos incorrectos";
				}
				lblResultado.setText(mensaje);
				
			}
			
		});
		
		txtUsuario = new JTextField();
		txtUsuario.setText("Usuario");
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		lblContrasea = new JLabel("Contrase\u00F1a");
		panel.add(lblContrasea);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setText("Contrase\u00F1a");
		panel.add(pwdPassword);
		panel.add(btnAceptar);
		
		lblResultado = new JLabel("An\u00F3nimo");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblResultado, BorderLayout.SOUTH);
	}

}

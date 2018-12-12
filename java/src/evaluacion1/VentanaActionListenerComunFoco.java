package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class VentanaActionListenerComunFoco extends JFrame implements ActionListener{

	private static final long serialVersionUID = -7432671980495821429L;
	private JPanel contentPane;
	private JPanel panelDatos;
	private JTextField txtUsuario;
	private JLabel lblTexto;
	private JLabel lblNmero;
	private JButton btnOk;
	private JPasswordField pwdPassword;
	private JLabel lblPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaActionListenerComunFoco frame = new VentanaActionListenerComunFoco();
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
	public VentanaActionListenerComunFoco() {
		setResizable(false);
		setTitle("VentanaActionListenerComunFoco");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 656, 120);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panelDatos = new JPanel();
		contentPane.add(panelDatos, BorderLayout.NORTH);
		
		lblNmero = new JLabel("Usuario");
		lblNmero.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelDatos.add(lblNmero);
		
		lblTexto = new JLabel("An\u00F3nimo");
		lblTexto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTexto, BorderLayout.SOUTH);
		
		txtUsuario = new JTextField();
		txtUsuario.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				txtUsuario.select(0, txtUsuario.getText().length());
			}
			@Override
			public void focusLost(FocusEvent e) {
				txtUsuario.select(0, 0);
			}
		});
		txtUsuario.addActionListener(this);
		txtUsuario.setText("Usuario");
		txtUsuario.setColumns(10);
		txtUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelDatos.add(txtUsuario);
		
		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDatos.add(lblPassword);
		
		pwdPassword = new JPasswordField();
		pwdPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				pwdPassword.setSelectionStart(0);
				String contrasena = new String(pwdPassword.getPassword()); 
				pwdPassword.setSelectionEnd(contrasena.length());
			}
			@Override
			public void focusLost(FocusEvent e) {
				pwdPassword.select(0, 0);
			}
		});
		pwdPassword.addActionListener(this);
		pwdPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pwdPassword.setText("Password\u2026");
		panelDatos.add(pwdPassword);
		
		btnOk = new JButton("Ok");
		btnOk.addActionListener(this);
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelDatos.add(btnOk);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// accciones a realizar al pulsar el botón
		// compruebo el usuario y la password
		String usuario = txtUsuario.getText();
		String password = new String(pwdPassword.getPassword());
		String mensaje;
		if(usuario.equals("1dw3") && password.equals("1dw3")) {
			// si los datos coinciden
			mensaje = "Bienvenido "+ txtUsuario.getText();
		}
		else {
			// si los datos NO coinciden
			mensaje = "Datos Incorrectos.";
		}
		lblTexto.setText(mensaje);
	}

}

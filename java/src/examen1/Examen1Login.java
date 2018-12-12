package examen1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

public class Examen1Login extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4923947275106098399L;
	private JPanel contentPane, panel;
	private JTextField txtUsuario;
	private JPasswordField pwdPassword;
	private JLabel lblUsuario, lblPassword, lblListo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen1Login frame = new Examen1Login();
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
	public Examen1Login() {
		setTitle("Examen de Ruben Izcara");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 116);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblListo = new JLabel("Listo");
		lblListo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblListo, BorderLayout.SOUTH);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		lblUsuario = new JLabel("Usuario");
		panel.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setText("Usuario");
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);
		txtUsuario.addActionListener(this);
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
	
		
		lblPassword = new JLabel("Password");
		panel.add(lblPassword);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setText("Password");
		panel.add(pwdPassword);
		pwdPassword.addActionListener(this);
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
		}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		String usuario = txtUsuario.getText();
		String contraseña = new String(pwdPassword.getPassword());
		int intentos = 3;
		
		if (usuario.equals("ruben") && contraseña.equals("izcara")){
			Examen1Menu E1M = new Examen1Menu();
			E1M.setTitle("Bienvenido Ruben");
			E1M.setVisible(true);
			this.dispose();
			
		}
		
		else {
			intentos = intentos - 1;
			lblListo.setText("Error. Los datos no son correctos. Le quedan " +intentos+ " intentos");
			if(intentos == 0) {
				System.exit(0);
			}
		}
	}

}

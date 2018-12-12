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
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;


public class BotonesMensajesMenu extends JFrame implements ActionListener{

	private static final long serialVersionUID = -7432671980495821429L;
	private JPanel contentPane;
	private JButton btnHola;
	private JButton btnKaixo;
	private JButton btnAdios;
	private JButton btnAgur;
	private JPanel panel;
	private JLabel lblMensaje;
	private JTextField txtNombre;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenuItem mntmHola;
	private JMenuItem mntmAdios;
	private JMenuItem mntmKaixo;
	private JMenuItem mntmAgur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BotonesMensajesMenu frame = new BotonesMensajesMenu();
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
	public BotonesMensajesMenu() {
		setResizable(false);
		setTitle("VentanaActionListenerComunFoco");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 164);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		mnArchivo.addActionListener(this);
		
		mntmHola = new JMenuItem("Hola");
		mntmHola.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_MASK));
		mnArchivo.add(mntmHola);
		mntmHola.addActionListener(this);
		
		mntmAdios = new JMenuItem("Adios");
		mntmAdios.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
		mnArchivo.add(mntmAdios);
		mntmAdios.addActionListener(this);
		
		mntmKaixo = new JMenuItem("Kaixo");
		mntmKaixo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_MASK));
		mnArchivo.add(mntmKaixo);
		mntmKaixo.addActionListener(this);
		
		mntmAgur = new JMenuItem("Agur");
		mntmAgur.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_MASK));
		mnArchivo.add(mntmAgur);
		mntmAgur.addActionListener(this);
		
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
		mensaje = o.getClass().getName();
		
		if(mensaje.equals("javax.swing.JButton")) {
			//si es un boton
			//obtengo el texto de ese boton y se lo doy a mensaje
			mensaje = ((JButton)o).getText();	
			}
		
		else if(mensaje.equals("javax.swing.JMenuItem")) {
			//si es un boton
			//obtengo el texto de ese boton y se lo doy a mensaje
			mensaje = ((JMenuItem)o).getText();	
			}

		//completo el mensaje con el texto
		mensaje = mensaje + " " +txtNombre.getText();
		//muestro  el mensaje en la etiqueta
		lblMensaje.setText(mensaje);
	
		}}

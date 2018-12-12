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
import javax.swing.JToolBar;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;


public class BotonesMensajesMenuBarra extends JFrame implements ActionListener{

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
	private JToolBar toolBar;
	private JPanel panel_1;
	private JButton btnHola_1;
	private JButton btnKaixo_1;
	private JButton btnAdios_1;
	private JButton btnAgur_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BotonesMensajesMenuBarra frame = new BotonesMensajesMenuBarra();
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
	public BotonesMensajesMenuBarra() {
		setResizable(false);
		setTitle("VentanaActionListenerComunFoco");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 283);
		
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
		
		lblMensaje = new JLabel("No hay mensaje ");
		lblMensaje.setBackground(new Color(192, 192, 192));
		lblMensaje.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblMensaje, BorderLayout.SOUTH);
		
		toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		btnHola_1 = new JButton("Hola");
		btnHola_1.addActionListener(this);
			
		btnHola_1.setIcon(new ImageIcon(BotonesMensajesMenuBarra.class.getResource("/iconos/cortar.gif")));
		toolBar.add(btnHola_1);
		
		btnAdios_1 = new JButton("Adios");
		btnAdios_1.setIcon(new ImageIcon(BotonesMensajesMenuBarra.class.getResource("/iconos/guardarcomo.gif")));
		toolBar.add(btnAdios_1);
		btnAdios_1.addActionListener(this);
		
		btnKaixo_1 = new JButton("Kaixo");
		btnKaixo_1.setIcon(new ImageIcon(BotonesMensajesMenuBarra.class.getResource("/iconos/acercade.gif")));
		toolBar.add(btnKaixo_1);
		btnKaixo_1.addActionListener(this);
		
		btnAgur_1 = new JButton("Agur");
		btnAgur_1.setIcon(new ImageIcon(BotonesMensajesMenuBarra.class.getResource("/iconos/pegar.gif")));
		toolBar.add(btnAgur_1);
		btnAgur_1.addActionListener(this);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		
		panel = new JPanel();
		panel_1.add(panel, BorderLayout.CENTER);
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
		
		txtNombre = new JTextField();
		panel_1.add(txtNombre, BorderLayout.NORTH);
		txtNombre.setBackground(Color.WHITE);
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

package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.*;

public class VentanaRegistroMujer extends JFrame  {
	
	public static final long serialVersionUID = 1L;
	private JTextField txtnombre, txtaltura, txtcorreo, txtusuario, txtcontraseña, txtdivorcio;
	private JLabel fondo;
	private JButton registrate;
	public static final String REGISTRATEF = "Registrate";
	
	public VentanaRegistroMujer() {
		setSize(715, 440);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Registrarse");
		setLocationRelativeTo(null);
		setLayout(null);

		fondo = new JLabel();
		ImageIcon img1 = new ImageIcon(getClass().getResource("/Imagenes/FondoRegistroMujer.png"));
		ImageIcon icono1 = new ImageIcon(img1.getImage().getScaledInstance(700, 400, Image.SCALE_DEFAULT));
		fondo.setIcon(icono1);
		fondo.setBounds(0,0, 700, 400);
		txtnombre = new JTextField();
		txtnombre.setBounds(100, 80, 200, 25);
		txtcorreo = new JTextField();
		txtcorreo.setBounds(100, 150, 100, 25);
		txtusuario = new JTextField();
		txtusuario.setBounds(400, 80, 200, 25);
		txtcontraseña = new JTextField();
		txtcontraseña.setBounds(400, 150 , 200, 25);
		txtaltura = new JTextField();
		txtaltura.setBounds(100, 220, 60, 25);
		txtdivorcio = new JTextField();
		txtdivorcio.setBounds(400, 220 , 200, 25);
		registrate = new JButton("Registrate");
		ImageIcon imag2 = new ImageIcon(getClass().getResource("/Imagenes/BotonRegistrate.png"));
		ImageIcon icono2 = new ImageIcon(imag2.getImage().getScaledInstance(210, 40, Image.SCALE_DEFAULT));
		registrate.setIcon(icono2);
		registrate.setActionCommand(REGISTRATEF);
		registrate.setBounds(240, 300, 200, 40);

		add(txtnombre);
		add(txtcorreo);
		add(txtusuario);
		add(txtcontraseña);
		add(txtaltura);
		add(txtdivorcio);
		add(registrate);
		add(fondo);
	}

	public JTextField getTxtnombre() {
		return txtnombre;
	}

	public void setTxtnombre(JTextField txtnombre) {
		this.txtnombre = txtnombre;
	}


	public JTextField getTxtaltura() {
		return txtaltura;
	}

	public void setTxtaltura(JTextField txtaltura) {
		this.txtaltura = txtaltura;
	}

	public JTextField getTxtcorreo() {
		return txtcorreo;
	}

	public void setTxtcorreo(JTextField txtcorreo) {
		this.txtcorreo = txtcorreo;
	}

	public JTextField getTxtusuario() {
		return txtusuario;
	}

	public void setTxtusuario(JTextField txtusuario) {
		this.txtusuario = txtusuario;
	}

	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}

	public JTextField getTxtcontraseña() {
		return txtcontraseña;
	}

	public void setTxtcontraseña(JTextField txtcontraseña) {
		this.txtcontraseña = txtcontraseña;
	}

	public JTextField gettxtdivorcio() {
		return txtdivorcio;
	}

	public void settxtdivorcio(JTextField txtdivorcio) {
		this.txtdivorcio = txtdivorcio;
	}

	public JButton getRegistrate() {
		return registrate;
	}

	public void setRegistrate(JButton registrate) {
		this.registrate = registrate;
	}
	
	
}

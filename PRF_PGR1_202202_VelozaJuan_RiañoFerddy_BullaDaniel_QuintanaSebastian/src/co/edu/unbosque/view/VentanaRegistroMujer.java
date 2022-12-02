package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.*;

public class VentanaRegistroMujer extends JFrame  {
	
	public static final long serialVersionUID = 1L;
	private JTextField txtnombre, txtestatura,txtapellido1, txtapellido2, txtcorreo, txtusuario, txtcontraseña, txtdivorcio, txtdnacimiento, txtmnacimiento, txtanacimiento, txtedad;
	private JLabel fondo, sm, sa;
	private JButton registratem;
	public static final String REGISTRATEF = "Registratem";
	
	public VentanaRegistroMujer() {
		setSize(715, 440);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Registrarse Mujer");
		setLocationRelativeTo(null);
		setLayout(null);

		fondo = new JLabel();
		ImageIcon img1 = new ImageIcon(getClass().getResource("/Imagenes/FondoRegistroMujer.png"));
		ImageIcon icono1 = new ImageIcon(img1.getImage().getScaledInstance(700, 400, Image.SCALE_DEFAULT));
		fondo.setIcon(icono1);
		fondo.setBounds(0,0, 700, 400);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(100, 30, 150, 25);
		
		txtapellido1 = new JTextField();
		txtapellido1.setBounds(100, 80, 100, 25);
		
		txtapellido2 = new JTextField();
		txtapellido2.setBounds(245, 80, 100, 25);
		
		txtcorreo = new JTextField();
		txtcorreo.setBounds(100, 150, 100, 25);
		
		txtusuario = new JTextField();
		txtusuario.setBounds(400, 80, 200, 25);
		
		txtcontraseña = new JTextField();
		txtcontraseña.setBounds(400, 150 , 200, 25);
		
		txtestatura = new JTextField();
		txtestatura.setBounds(100, 220, 60, 25);
		
		txtdivorcio = new JTextField();
		txtdivorcio.setBounds(400, 220 , 200, 25);
		
		txtdnacimiento = new JTextField();
		txtdnacimiento.setBounds(100, 275, 20, 25);
		
		sm = new JLabel("/");
		sm.setBounds(125, 275, 3, 25);
		
		txtmnacimiento = new JTextField();
		txtmnacimiento.setBounds(132, 275, 20, 25);
		
		sa = new JLabel("/");
		sa.setBounds(157, 275, 3, 25);
		txtanacimiento = new JTextField();
		txtanacimiento.setBounds(165, 275, 40, 25);
		
		txtedad = new JTextField();
		txtedad.setBounds(400, 275, 100, 25);
		
		registratem = new JButton("Registrate");
		ImageIcon imag2 = new ImageIcon(getClass().getResource("/Imagenes/BotonRegistrate.png"));
		ImageIcon icono2 = new ImageIcon(imag2.getImage().getScaledInstance(210, 40, Image.SCALE_DEFAULT));
		registratem.setIcon(icono2);
		registratem.setActionCommand(REGISTRATEF);
		registratem.setBounds(240, 320, 200, 40);

		add(txtnombre);
		add(txtapellido1);
		add(txtapellido2);
		add(txtcorreo);
		add(txtusuario);
		add(txtcontraseña);
		add(txtestatura);
		add(txtdivorcio);
		add(txtdnacimiento);
		add(sm);
		add(txtmnacimiento);
		add(sa);
		add(txtanacimiento);
		add(txtedad);
		add(registratem);
		add(fondo);
	}
	public JTextField getTxtnombre() {
		return txtnombre;
	}

	public void setTxtnombre(JTextField txtnombre) {
		this.txtnombre = txtnombre;
	}

	public JTextField getTxtestatura() {
		return txtestatura;
	}

	public void setTxtestatura(JTextField txtestatura) {
		this.txtestatura = txtestatura;
	}

	public JTextField getTxtapellido1() {
		return txtapellido1;
	}

	public void setTxtapellido1(JTextField txtapellido1) {
		this.txtapellido1 = txtapellido1;
	}

	public JTextField getTxtapellido2() {
		return txtapellido2;
	}

	public void setTxtapellido2(JTextField txtapellido2) {
		this.txtapellido2 = txtapellido2;
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

	public JTextField getTxtcontraseña() {
		return txtcontraseña;
	}

	public void setTxtcontraseña(JTextField txtcontraseña) {
		this.txtcontraseña = txtcontraseña;
	}

	public JTextField getTxtdivorcio() {
		return txtdivorcio;
	}

	public void setTxtdivorcio(JTextField txtdivorcio) {
		this.txtdivorcio = txtdivorcio;
	}

	public JTextField getTxtdnacimiento() {
		return txtdnacimiento;
	}

	public void setTxtdnacimiento(JTextField txtdnacimiento) {
		this.txtdnacimiento = txtdnacimiento;
	}

	public JTextField getTxtmnacimiento() {
		return txtmnacimiento;
	}

	public void setTxtmnacimiento(JTextField txtmnacimiento) {
		this.txtmnacimiento = txtmnacimiento;
	}

	public JTextField getTxtanacimiento() {
		return txtanacimiento;
	}

	public void setTxtanacimiento(JTextField txtanacimiento) {
		this.txtanacimiento = txtanacimiento;
	}

	public JTextField getTxtedad() {
		return txtedad;
	}

	public void setTxtedad(JTextField txtedad) {
		this.txtedad = txtedad;
	}

	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}

	public JLabel getSm() {
		return sm;
	}

	public void setSm(JLabel sm) {
		this.sm = sm;
	}

	public JLabel getSa() {
		return sa;
	}

	public void setSa(JLabel sa) {
		this.sa = sa;
	}
	public static String getRegistratef() {
		return REGISTRATEF;
	}
	public JButton getRegistratem() {
		return registratem;
	}
	public void setRegistratem(JButton registratem) {
		this.registratem = registratem;
	}
}

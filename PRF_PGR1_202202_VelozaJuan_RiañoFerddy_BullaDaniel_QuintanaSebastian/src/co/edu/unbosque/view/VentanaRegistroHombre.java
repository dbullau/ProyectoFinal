package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.*;

public class VentanaRegistroHombre extends JFrame  {
	
	public static final long serialVersionUID = 1L;
	private JTextField txtnombre,txtapellido1, txtapellido2, txtestatura, txtcorreo, txtusuario, txtcontraseña, txtingresos, txtdnacimiento, txtmnacimiento, txtanacimiento, txtedad;
	private JLabel fondo, sm, sa;
	private JButton registrate;
	public static final String REGISTRATEM = "Registrate";
	
	public VentanaRegistroHombre() {
		setSize(715, 440);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Registrarse");
		setLocationRelativeTo(null);
		setLayout(null);

		fondo = new JLabel();
		ImageIcon img1 = new ImageIcon(getClass().getResource("/Imagenes/FondoRegistroHombre.png"));
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
		txtingresos = new JTextField();
		txtingresos.setBounds(400, 220 , 200, 25);
		txtdnacimiento = new JTextField();
		txtdnacimiento.setBounds(100, 235, 20, 25);
		sm = new JLabel("/");
		sm.setBounds(125, 235, 3, 25);
		txtmnacimiento = new JTextField();
		txtmnacimiento.setBounds(132, 235, 20, 25);
		sa = new JLabel("/");
		sa.setBounds(157, 235, 3, 25);
		txtanacimiento = new JTextField();
		txtanacimiento.setBounds(165, 235, 40, 25);
		txtedad = new JTextField();
		txtedad.setBounds(400, 235, 100, 25);
		registrate = new JButton("Registrate");
		ImageIcon imag2 = new ImageIcon(getClass().getResource("/Imagenes/BotonRegistrate.png"));
		ImageIcon icono2 = new ImageIcon(imag2.getImage().getScaledInstance(210, 40, Image.SCALE_DEFAULT));
		registrate.setIcon(icono2);
		registrate.setActionCommand(REGISTRATEM);
		registrate.setBounds(250, 300, 200, 40);
		

		add(txtnombre);
		add(txtapellido1);
		add(txtapellido2);
		add(txtcorreo);
		add(txtusuario);
		add(txtcontraseña);
		add(txtestatura);
		add(txtingresos);
		add(txtdnacimiento);
		add(sm);
		add(txtmnacimiento);
		add(sa);
		add(txtanacimiento);
		add(txtedad);
		add(registrate);
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

	public JTextField getTxtingresos() {
		return txtingresos;
	}

	public void setTxtingresos(JTextField txtingresos) {
		this.txtingresos = txtingresos;
	}

	public JButton getRegistrate() {
		return registrate;
	}

	public void setRegistrate(JButton registrate) {
		this.registrate = registrate;
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
}

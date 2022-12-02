package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class VentanaAplicacion extends JFrame{

	private static final long serialVersionUID = 1L;
	private JLabel nombre, edad, nacimiento, estado, divorcio, ingresos, sexo, fotohombre,fotomujer,fondo ;
	private JButton Like, Dislike;
	
	public static final String LIKE = "like";
	public static final String DISLIKE= "dislike";
	
	public VentanaAplicacion() {
		setSize(715,440);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		setTitle("Bostinder");
		
		fotohombre = new JLabel("");
		fotohombre.setVisible(true);
		ImageIcon image1 = new ImageIcon(getClass().getResource("/Imagenes/FondoHombre.png"));
		ImageIcon icono1 = new ImageIcon(image1.getImage().getScaledInstance(219, 245, Image.SCALE_DEFAULT ));
		fotohombre.setIcon(icono1);
		fotohombre.setBounds(426, 60, 219, 245);
		
		fotomujer= new JLabel();
		fotomujer.setVisible(false);
		
		nombre = new JLabel ("me llamo ...");
		nombre.setForeground(Color.black);
		nombre.setBounds(50, 120, 300,50);
		
		edad = new JLabel ("tengo ...");
		edad.setForeground(Color.black);
		edad.setBounds(50, 180, 120,50);
		
		nacimiento = new JLabel ("mido ....");
		nacimiento.setForeground(Color.black);
		nacimiento.setBounds(50, 240, 120,50);
		
		estado = new JLabel ("ingreso....");
		estado.setForeground(Color.black);
		estado.setBounds(50, 300, 180,50);
		estado.setVisible(true);
		
		divorcio = new JLabel ("me llamo ...");
		divorcio.setForeground(Color.black);
		divorcio.setBounds(300, 120, 300,50);
		
		ingresos = new JLabel ("tengo ...");
		ingresos.setForeground(Color.black);
		ingresos.setBounds(300, 180, 120,50);
		
		sexo = new JLabel ("mido ....");
		sexo.setForeground(Color.black);
		sexo.setBounds(300, 240, 120,50);
		
		Like = new JButton("l");
		ImageIcon imag2 = new ImageIcon(getClass().getResource("/Imagenes/BotonLike.png"));
		ImageIcon icono2 = new ImageIcon(imag2.getImage().getScaledInstance(70, 40, Image.SCALE_DEFAULT));
		Like.setIcon(icono2);
		Like.setActionCommand(LIKE);
		Like.setBounds(411, 350, 60,40);
		
		Dislike = new JButton("d");
		ImageIcon imag3 = new ImageIcon(getClass().getResource("/Imagenes/BotonDislike.png"));
		ImageIcon icono3 = new ImageIcon(imag3.getImage().getScaledInstance(70, 40, Image.SCALE_DEFAULT));
		Dislike.setIcon(icono3);
		Dislike.setActionCommand(DISLIKE);
		Dislike.setBounds(505, 350, 60,40);
		
		fondo = new JLabel();
		ImageIcon imag5 = new ImageIcon(getClass().getResource("/Imagenes/FondoVentanaAplicacion.png"));
		ImageIcon icono5 = new ImageIcon(imag5.getImage().getScaledInstance(700, 400, Image.SCALE_DEFAULT));
		fondo.setIcon(icono5);
		fondo.setBounds(0, 0, 700, 400);
		
		add(fotohombre);
		add(nombre);
		add(edad);
		add(nacimiento);
		add(estado);
		add(divorcio);
		add(ingresos);
		add(sexo);
		add(Like);
		add(Dislike);
		add(fondo);
	}
	public JLabel getNombre() {
		return nombre;
	}

	public void setNombre(JLabel nombre) {
		this.nombre = nombre;
	}

	public JLabel getEdad() {
		return edad;
	}

	public void setEdad(JLabel edad) {
		this.edad = edad;
	}

	public JLabel getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(JLabel nacimiento) {
		this.nacimiento = nacimiento;
	}

	public JLabel getEstado() {
		return estado;
	}

	public void setEstado(JLabel estado) {
		this.estado = estado;
	}

	public JLabel getFotohombre() {
		return fotohombre;
	}

	public void setFotohombre(JLabel fotohombre) {
		this.fotohombre = fotohombre;
	}

	public JLabel getFotomujer() {
		return fotomujer;
	}

	public void setFotomujer(JLabel fotomujer) {
		this.fotomujer = fotomujer;
	}

	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}

	public JButton getLike() {
		return Like;
	}

	public void setLike(JButton like) {
		Like = like;
	}

	public JButton getDislike() {
		return Dislike;
	}

	public void setDislike(JButton dislike) {
		Dislike = dislike;
	}
	public JLabel getDivorcios() {
		return divorcio;
	}
	public void setDivorcios(JLabel divorcios) {
		this.divorcio = divorcios;
	}
	public JLabel getIngresos() {
		return ingresos;
	}
	public void setIngresos(JLabel ingresos) {
		this.ingresos = ingresos;
	}
	public JLabel getSexo() {
		return sexo;
	}
	public void setSexo(JLabel sexo) {
		this.sexo = sexo;
	}
}

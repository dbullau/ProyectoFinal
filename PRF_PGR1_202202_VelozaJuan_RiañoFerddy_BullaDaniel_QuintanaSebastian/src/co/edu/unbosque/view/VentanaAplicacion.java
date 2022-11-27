package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class VentanaAplicacion extends JFrame{

	private static final long serialVersionUID = 1L;
	private JLabel nombre, edad, altura, ingresos, divorcios, fotohombre,fotomujer, quiensoy,fondo ;
	private JButton Like, Dislike, Bloquear;
	
	public static final String LIKE = "like";
	public static final String DISLIKE= "dislike";
	public static final String BLOQUEAR= "bloquear";
	
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
		quiensoy = new JLabel("¿Quien Soy?");
		quiensoy.setForeground(Color.black);
		quiensoy.setBounds(105, 25, 80, 50);
		nombre = new JLabel ("me llamo ...");
		nombre.setForeground(Color.black);
		nombre.setBounds(80, 120, 300,50);
		edad = new JLabel ("tengo ...");
		edad.setForeground(Color.black);
		edad.setBounds(80, 180, 120,50);
		altura = new JLabel ("mido ....");
		altura.setForeground(Color.black);
		altura.setBounds(80, 240, 120,50);
		ingresos = new JLabel ("ingreso....");
		ingresos.setForeground(Color.black);
		ingresos.setBounds(80, 300, 180,50);
		ingresos.setVisible(true);
		divorcios = new JLabel ("me he divorciado.....");
		divorcios.setForeground(Color.black);
		divorcios.setBounds(80, 340, 180,50);
		divorcios.setVisible(false);
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
		Bloquear = new JButton("b");
		ImageIcon imag4 = new ImageIcon(getClass().getResource("/Imagenes/BotonBloquear.png"));
		ImageIcon icono4 = new ImageIcon(imag4.getImage().getScaledInstance(70, 40, Image.SCALE_DEFAULT));
		Bloquear.setIcon(icono4);
		Bloquear.setActionCommand(BLOQUEAR);
		Bloquear.setBounds(600, 350, 60,40);
		fondo = new JLabel();
		ImageIcon imag5 = new ImageIcon(getClass().getResource("/Imagenes/FondoVentanaAplicacion.png"));
		ImageIcon icono5 = new ImageIcon(imag5.getImage().getScaledInstance(700, 400, Image.SCALE_DEFAULT));
		fondo.setIcon(icono5);
		fondo.setBounds(0, 0, 700, 400);
		
		add(fotohombre);
		//add(quiensoy);
		//add(nombre);
		//add(edad);
		//add(altura);
		//add(ingresos);
		//add(divorcios);
		add(Like);
		add(Dislike);
		add(Bloquear);
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

	public JLabel getAltura() {
		return altura;
	}

	public void setAltura(JLabel altura) {
		this.altura = altura;
	}

	public JLabel getIngresos() {
		return ingresos;
	}

	public void setIngresos(JLabel ingresos) {
		this.ingresos = ingresos;
	}

	public JLabel getDivorcios() {
		return divorcios;
	}

	public void setDivorcios(JLabel divorcios) {
		this.divorcios = divorcios;
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

	public JLabel getQuiensoy() {
		return quiensoy;
	}

	public void setQuiensoy(JLabel quiensoy) {
		this.quiensoy = quiensoy;
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

	public JButton getBloquear() {
		return Bloquear;
	}

	public void setBloquear(JButton bloquear) {
		Bloquear = bloquear;
	}
	
}

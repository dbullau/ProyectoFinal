package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class VentanaAplicacion extends JFrame{

	private static final long serialVersionUID = 1L;
	private JLabel nombre, edad, altura, ingresos, divorcios, fotohombre,fotomujer, quiensoy ;
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
		ImageIcon image1 = new ImageIcon(getClass().getResource("/Imagenes/hombre.png "));
		ImageIcon icono1 = new ImageIcon(image1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT ));
		fotohombre.setIcon(icono1);
		fotohombre.setBounds(420, 10, 200, 200);
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
		Like = new JButton("like");
		Like.setActionCommand(LIKE);
		Like.setBounds(360, 320, 80,25);
		Dislike = new JButton("dislike");
		Dislike.setActionCommand(DISLIKE);
		Dislike.setBounds(480, 320, 80,25);
		Bloquear = new JButton("bloquear");
		Bloquear.setActionCommand(BLOQUEAR);
		Bloquear.setBounds(600, 320, 80,25);
		
		add(fotohombre);
		add(quiensoy);
		add(nombre);
		add(edad);
		add(altura);
		add(ingresos);
		add(divorcios);
		add(Like);
		add(Dislike);
		add(Bloquear);
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

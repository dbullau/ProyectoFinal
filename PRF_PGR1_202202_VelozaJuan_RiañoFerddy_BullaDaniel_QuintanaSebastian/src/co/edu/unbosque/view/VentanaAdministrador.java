package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.*;

public class VentanaAdministrador extends JFrame{

	private static final long serialVersionUID = 1L;
	private JTextArea informacioncompleta,informacionfiltrada;
	private JTextField txtnumusuario;
	private JButton btbuscar, btactualizar, btborrar , btingresos, btlikes, btgenerarpdf ;
	private JComboBox ordenar, genero;
	private JScrollPane scroll1, scroll2;
	private JLabel fondo;
	private Color colorMorado = new Color(84, 24, 52);
	
	public Color getColorMorado() {
		return colorMorado;
	}

	public void setColorMorado(Color colorMorado) {
		this.colorMorado = colorMorado;
	}

	public static final String LIKES = "likes";
	public static final String INGRESOS = "ingresos";
	public static final String GENERAR= "generar";
	public static final String BUSCAR = "buscar";
	public static final String ACTUALIZAR = "actualizar";
	public static final String BORRAR = "borrar";
	
	public VentanaAdministrador() {
		setSize(715,440);
		setResizable(false);
		setTitle("Bostinder - Administrador");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		informacioncompleta = new JTextArea();
		informacioncompleta.setEditable(false);
		scroll1 = new JScrollPane(informacioncompleta);
		scroll1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		informacioncompleta.setBackground(Color.white);
		informacioncompleta.setForeground(Color.black);
		scroll1.setBounds(20, 20, 430, 220);
		
		informacionfiltrada = new JTextArea();
		informacionfiltrada.setEditable(false);
		scroll2 = new JScrollPane(informacionfiltrada);
		scroll2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		informacionfiltrada.setBackground(Color.white);
		informacionfiltrada.setForeground(Color.black);
		scroll2.setBounds(20, 250, 280, 130);
		
		txtnumusuario = new JTextField();
		txtnumusuario.setBackground(Color.white);
		txtnumusuario.setForeground(Color.black);
		txtnumusuario.setBounds(350,250, 60, 20);
		
		btbuscar = new JButton("Buscar");
		btbuscar.setBackground(colorMorado);
		btbuscar.setForeground(Color.WHITE);
		btbuscar.setBounds(340, 280, 80, 20);
		btbuscar.setActionCommand(BUSCAR);
		
		btborrar = new JButton("Borrar");
		btborrar.setBackground(colorMorado);
		btborrar.setForeground(Color.WHITE);
		btborrar.setBounds(340, 310, 80, 20);
		btborrar.setActionCommand(BORRAR);
	
		ordenar = new JComboBox();
		ordenar.addItem("Ascendente");
		ordenar.addItem("Descendente");
		ordenar.setBounds(530, 40, 100, 20);
		
		btactualizar = new JButton("Actualizar");
		ImageIcon imag1 = new ImageIcon(getClass().getResource("/Imagenes/BotonActualizar.png"));
		ImageIcon icono1 = new ImageIcon(imag1.getImage().getScaledInstance(110, 40, Image.SCALE_DEFAULT));
		btactualizar.setIcon(icono1);
		btactualizar.setActionCommand(ACTUALIZAR);
		btactualizar.setBounds(530, 85, 100, 40);
	
		btlikes = new JButton("Likes");
		ImageIcon imag2 = new ImageIcon(getClass().getResource("/Imagenes/BotonLikeAdmin.png"));
		ImageIcon icono2 = new ImageIcon(imag2.getImage().getScaledInstance(110, 40, Image.SCALE_DEFAULT));
		btlikes.setIcon(icono2);
		btlikes.setBounds(530, 280, 100, 40);
		btlikes.setActionCommand(LIKES);
		
		btingresos = new JButton("Ingresos");
		ImageIcon imag3 = new ImageIcon(getClass().getResource("/Imagenes/BotonIngresos.png"));
		ImageIcon icono3 = new ImageIcon(imag3.getImage().getScaledInstance(110, 40, Image.SCALE_DEFAULT));
		btingresos.setIcon(icono3);
		btingresos.setActionCommand(INGRESOS);
		btingresos.setBounds(530, 340, 100, 40);
		
		genero = new JComboBox();
		genero.addItem("Hombre");
		genero.addItem("Mujer");
		genero.setBounds(530, 235, 100, 20);
		
		btgenerarpdf = new JButton("Generar PDF");
		ImageIcon imag5 = new ImageIcon(getClass().getResource("/Imagenes/BotonGenerarPDF.png"));
		ImageIcon icono5 = new ImageIcon(imag5.getImage().getScaledInstance(130, 40, Image.SCALE_DEFAULT));
		btgenerarpdf.setIcon(icono5);
		btgenerarpdf.setActionCommand(GENERAR);
		btgenerarpdf.setBounds(320, 340, 120, 40);
	
		fondo = new JLabel();
		ImageIcon imag4 = new ImageIcon(getClass().getResource("/Imagenes/FondoVentanaAdministrador.png"));
		ImageIcon icono4 = new ImageIcon(imag4.getImage().getScaledInstance(700, 400, Image.SCALE_DEFAULT));
		fondo.setIcon(icono4);
		fondo.setBounds(0, 0, 700, 400);
		this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/IconoLogo.png")).getImage());
		
		add(scroll1);
		add(scroll2);
		add(txtnumusuario);
		add(btbuscar);
		add(btborrar);
		add(ordenar);
		add(genero);
		add(btlikes);
		add(btingresos);
		add(btactualizar);
		add(btgenerarpdf);
		add(fondo);
		
	}

	public JTextArea getInformacioncompleta() {
		return informacioncompleta;
	}

	public void setInformacioncompleta(JTextArea informacioncompleta) {
		this.informacioncompleta = informacioncompleta;
	}

	public JTextArea getInformacionfiltrada() {
		return informacionfiltrada;
	}

	public void setInformacionfiltrada(JTextArea informacionfiltrada) {
		this.informacionfiltrada = informacionfiltrada;
	}

	public JTextField getTxtnumusuario() {
		return txtnumusuario;
	}

	public void setTxtnumusuario(JTextField txtnumusuario) {
		this.txtnumusuario = txtnumusuario;
	}

	public JButton getBtbuscar() {
		return btbuscar;
	}

	public void setBtbuscar(JButton btbuscar) {
		this.btbuscar = btbuscar;
	}

	public JButton getBtactualizar() {
		return btactualizar;
	}

	public void setBtactualizar(JButton btactualizar) {
		this.btactualizar = btactualizar;
	}

	public JButton getBtborrar() {
		return btborrar;
	}

	public void setBtborrar(JButton btborrar) {
		this.btborrar = btborrar;
	}


	public JComboBox getGenero() {
		return genero;
	}

	public void setGenero(JComboBox genero) {
		this.genero = genero;
	}

	public JButton getBtingresos() {
		return btingresos;
	}

	public void setBtingresos(JButton btingresos) {
		this.btingresos = btingresos;
	}

	public JButton getBtlikes() {
		return btlikes;
	}

	public void setBtlikes(JButton btlikes) {
		this.btlikes = btlikes;
	}

	public JComboBox getOrdenar() {
		return ordenar;
	}

	public void setOrdenar(JComboBox ordenar) {
		this.ordenar = ordenar;
	}

	public JScrollPane getScroll1() {
		return scroll1;
	}

	public void setScroll1(JScrollPane scroll1) {
		this.scroll1 = scroll1;
	}

	public JScrollPane getScroll2() {
		return scroll2;
	}

	public void setScroll2(JScrollPane scroll2) {
		this.scroll2 = scroll2;
	}

	public JButton getBtgenerarpdf() {
		return btgenerarpdf;
	}

	public void setBtgenerarpdf(JButton btgenerarpdf) {
		this.btgenerarpdf = btgenerarpdf;
	}
	
	
	
}

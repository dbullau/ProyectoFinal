package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.*;

public class VentanaAdministrador extends JFrame{

	private static final long serialVersionUID = 1L;
	private JTextArea informacioncompleta,informacionfiltrada;
	private JTextField txtnumusuario;
	private JButton btbuscar, btactualizar, btborrar , btingresos, btlikes, btgenerarpdf ;
	private JComboBox genero;
	private JMenuBar barramenu;
    private JMenu menuordenar;
    private JMenu likes;
    private JMenu nombre;
    private JMenu apellido;
    private JMenu edad;
    private JMenu usuario;
    private JMenuItem likesascendente;
    private JMenuItem likesdescendente;
    private JMenuItem nombreascendente;
    private JMenuItem nombredescendente;
    private JMenuItem apellidoascendente;
    private JMenuItem apellidodescendente;
    private JMenuItem edadascendente;
    private JMenuItem edaddescendente;
    private JMenuItem usuarioascendente;
    private JMenuItem usuariodescendente;
	private JScrollPane scroll1, scroll2;
	private JLabel fondo;
	private Color colorMorado = new Color(84, 24, 52);
	
	public Color getColorMorado() {
		return colorMorado;
	}

	public void setColorMorado(Color colorMorado) {
		this.colorMorado = colorMorado;
	}

	public static final String LIKESG = "likes";
	public static final String INGRESOS = "ingresos";
	public static final String GENERAR= "generar";
	public static final String BUSCAR = "buscar";
	public static final String ACTUALIZAR = "actualizar";
	public static final String BORRAR = "borrar";
	public static final String LIKESA = "likesascendente";
    public static final String LIKESD = "likesdescendente";
    public static final String NOMBREA = "nombreascendente";
    public static final String NOMBRED = "nombredescendente";
    public static final String APELLIDOA = "apellidoascendente";
    public static final String APELLIDOD = "apellidodescendente";
    public static final String EDADA = "edadascendente";
    public static final String EDADD = "edaddescendente";
    public static final String USUARIOA = "usuarioascendente";
    public static final String USUARIOD = "usuariodescendente";
	
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
	
		barramenu = new JMenuBar();
		barramenu.setBackground(colorMorado);
		setJMenuBar(barramenu);
		
		menuordenar = new JMenu("Ordenar");
		menuordenar.setForeground(Color.white);
		barramenu.add(menuordenar);
	
		likes = new JMenu("Likes");
		menuordenar.add(likes);
		
		nombre = new JMenu("Nombre");
		menuordenar.add(nombre);
		
		apellido = new JMenu("Apellido");
		menuordenar.add(apellido);
		
		edad = new JMenu("Edad");
		menuordenar.add(edad);
		
		usuario = new JMenu("Usuario");
		menuordenar.add(usuario);
		
		likesascendente = new JMenuItem("Ascendente");
		likesascendente.setActionCommand(LIKESA);
		likes.add(likesascendente);
		
		likesdescendente = new JMenuItem("Descendente");
		likesdescendente.setActionCommand(LIKESD);
		likes.add(likesdescendente);
		
		nombreascendente = new JMenuItem("Ascendente");
		nombreascendente.setActionCommand(NOMBREA);
		nombre.add(nombreascendente);
		
		nombredescendente = new JMenuItem("Descendnte");
		nombredescendente.setActionCommand(NOMBRED);
		nombre.add(nombredescendente);
		
		apellidoascendente = new JMenuItem("Ascendente");
		apellidoascendente.setActionCommand(APELLIDOA);
		apellido.add(apellidoascendente);
		
		apellidodescendente = new JMenuItem("Descendente");
		apellidodescendente.setActionCommand(APELLIDOD);
		apellido.add(apellidodescendente);
		
		edadascendente = new JMenuItem("Ascendente");
		edadascendente.setActionCommand(EDADA);
		edad.add(edadascendente);
		
		edaddescendente = new JMenuItem("Ascendente");
		edaddescendente.setActionCommand(EDADD);
		edad.add(edaddescendente);
		
		usuarioascendente = new JMenuItem("Ascendente");
		usuarioascendente.setActionCommand(USUARIOA);
		usuario.add(usuarioascendente);
		
		usuariodescendente= new JMenuItem("Descendente");
		usuariodescendente.setActionCommand(USUARIOD);
		usuario.add(usuariodescendente);
		
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
		btlikes.setActionCommand(LIKESG);
		
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

	public JButton getBtgenerarpdf() {
		return btgenerarpdf;
	}

	public void setBtgenerarpdf(JButton btgenerarpdf) {
		this.btgenerarpdf = btgenerarpdf;
	}

	public JComboBox getGenero() {
		return genero;
	}

	public void setGenero(JComboBox genero) {
		this.genero = genero;
	}

	public JMenuBar getBarramenu() {
		return barramenu;
	}

	public void setBarramenu(JMenuBar barramenu) {
		this.barramenu = barramenu;
	}

	public JMenu getMenuordenar() {
		return menuordenar;
	}

	public void setMenuordenar(JMenu menuordenar) {
		this.menuordenar = menuordenar;
	}

	public JMenu getLikes() {
		return likes;
	}

	public void setLikes(JMenu likes) {
		this.likes = likes;
	}

	public JMenu getNombre() {
		return nombre;
	}

	public void setNombre(JMenu nombre) {
		this.nombre = nombre;
	}

	public JMenu getApellido() {
		return apellido;
	}

	public void setApellido(JMenu apellido) {
		this.apellido = apellido;
	}

	public JMenu getEdad() {
		return edad;
	}

	public void setEdad(JMenu edad) {
		this.edad = edad;
	}

	public JMenu getUsuario() {
		return usuario;
	}

	public void setUsuario(JMenu usuario) {
		this.usuario = usuario;
	}

	public JMenuItem getLikesascendente() {
		return likesascendente;
	}

	public void setLikesascendente(JMenuItem likesascendente) {
		this.likesascendente = likesascendente;
	}

	public JMenuItem getLikesdescendente() {
		return likesdescendente;
	}

	public void setLikesdescendente(JMenuItem likesdescendente) {
		this.likesdescendente = likesdescendente;
	}

	public JMenuItem getNombreascendente() {
		return nombreascendente;
	}

	public void setNombreascendente(JMenuItem nombreascendente) {
		this.nombreascendente = nombreascendente;
	}

	public JMenuItem getNombredescendente() {
		return nombredescendente;
	}

	public void setNombredescendente(JMenuItem nombredescendente) {
		this.nombredescendente = nombredescendente;
	}

	public JMenuItem getApellidoascendente() {
		return apellidoascendente;
	}

	public void setApellidoascendente(JMenuItem apellidoascendente) {
		this.apellidoascendente = apellidoascendente;
	}

	public JMenuItem getApellidodescendente() {
		return apellidodescendente;
	}

	public void setApellidodescendente(JMenuItem apellidodescendente) {
		this.apellidodescendente = apellidodescendente;
	}

	public JMenuItem getEdadascendente() {
		return edadascendente;
	}

	public void setEdadascendente(JMenuItem edadascendente) {
		this.edadascendente = edadascendente;
	}

	public JMenuItem getEdaddescendente() {
		return edaddescendente;
	}

	public void setEdaddescendente(JMenuItem edaddescendente) {
		this.edaddescendente = edaddescendente;
	}

	public JMenuItem getUsuarioascendente() {
		return usuarioascendente;
	}

	public void setUsuarioascendente(JMenuItem usuarioascendente) {
		this.usuarioascendente = usuarioascendente;
	}

	public JMenuItem getUsuariodescendente() {
		return usuariodescendente;
	}

	public void setUsuariodescendente(JMenuItem usuariodescendente) {
		this.usuariodescendente = usuariodescendente;
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

	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static String getLikesg() {
		return LIKESG;
	}

	public static String getIngresos() {
		return INGRESOS;
	}

	public static String getGenerar() {
		return GENERAR;
	}

	public static String getBuscar() {
		return BUSCAR;
	}

	public static String getActualizar() {
		return ACTUALIZAR;
	}

	public static String getBorrar() {
		return BORRAR;
	}

	public static String getLikesa() {
		return LIKESA;
	}

	public static String getLikesd() {
		return LIKESD;
	}

	public static String getNombrea() {
		return NOMBREA;
	}

	public static String getNombred() {
		return NOMBRED;
	}

	public static String getApellidoa() {
		return APELLIDOA;
	}

	public static String getApellidod() {
		return APELLIDOD;
	}

	public static String getEdada() {
		return EDADA;
	}

	public static String getEdadd() {
		return EDADD;
	}

	public static String getUsuarioa() {
		return USUARIOA;
	}

	public static String getUsuariod() {
		return USUARIOD;
	}	
}

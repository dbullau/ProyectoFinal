package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.util.Random;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class VentanaAplicacion extends JFrame{

	private static final long serialVersionUID = 1L;
	private JLabel nombre, edad, nacimiento, estado, divorcio, ingresos, sexo, estatura, fondo, perfil;
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
		
		perfil = new JLabel("");
		perfil.setBounds(426, 60, 219, 245);
		add(perfil);
		
		nombre = new JLabel ("me llamo ...");
		nombre.setForeground(Color.black);
		nombre.setBounds(44, 115, 300,50);
		
		edad = new JLabel ("tengo ...");
		edad.setForeground(Color.black);
		edad.setBounds(44, 175, 120,50);
		
		estatura = new JLabel ("mido ....");
		estatura.setForeground(Color.black);
		estatura.setBounds(44, 235, 120,50);
		
		ingresos = new JLabel ("ingreso....");
		ingresos.setForeground(Color.black);
		ingresos.setBounds(44, 295, 180,50);
		
		divorcio = new JLabel ("me llamo ...");
		divorcio.setForeground(Color.black);
		divorcio.setBounds(272, 115, 300,50);
		
		sexo = new JLabel ("tengo ...");
		sexo.setForeground(Color.black);
		sexo.setBounds(272, 175, 120,50);
		
		nacimiento = new JLabel ("mido ....");
		nacimiento.setForeground(Color.black);
		nacimiento.setBounds(272, 235, 120,50);
		
		estado = new JLabel ("mido ....");
		estado.setForeground(Color.black);
		estado.setBounds(272, 295, 120,50);
		
		Like = new JButton("l");
		ImageIcon imag2 = new ImageIcon(getClass().getResource("/Imagenes/BotonLike.png"));
		ImageIcon icono2 = new ImageIcon(imag2.getImage().getScaledInstance(70, 40, Image.SCALE_DEFAULT));
		Like.setIcon(icono2);
		Like.setActionCommand(LIKE);
		Like.setBounds(460, 350, 60,40);
		
		Dislike = new JButton("d");
		ImageIcon imag3 = new ImageIcon(getClass().getResource("/Imagenes/BotonDislike.png"));
		ImageIcon icono3 = new ImageIcon(imag3.getImage().getScaledInstance(70, 40, Image.SCALE_DEFAULT));
		Dislike.setIcon(icono3);
		Dislike.setActionCommand(DISLIKE);
		Dislike.setBounds(550, 350, 60,40);
		
		fondo = new JLabel();
		ImageIcon imag5 = new ImageIcon(getClass().getResource("/Imagenes/FondoVentanaAplicacion.png"));
		ImageIcon icono5 = new ImageIcon(imag5.getImage().getScaledInstance(700, 400, Image.SCALE_DEFAULT));
		fondo.setIcon(icono5);
		fondo.setBounds(0, 0, 700, 400);
		
		add(nombre);
		add(edad);
		add(estatura);
		add(ingresos);
		add(divorcio);
		add(sexo);
		add(nacimiento);
		add(estado);
		add(Like);
		add(Dislike);
		add(perfil);
		add(fondo);
	}
	
	public void asignarImagenPerfilHombre() {
		Random numale = new Random();
		int naleatorio = numale.nextInt((5) + 1);
		if(naleatorio == 1) {
			ImageIcon imgn = new ImageIcon(getClass().getResource("/Imagenes/Hombre1.png"));
			ImageIcon iconon = new ImageIcon(imgn.getImage().getScaledInstance(219, 245, Image.SCALE_DEFAULT ));
			perfil.setIcon(iconon);
		}
		if(naleatorio == 2) {
			ImageIcon imgn = new ImageIcon(getClass().getResource("/Imagenes/Hombre2.png"));
			ImageIcon iconon = new ImageIcon(imgn.getImage().getScaledInstance(219, 245, Image.SCALE_DEFAULT ));
			perfil.setIcon(iconon);
		}
		if(naleatorio == 3) {
			ImageIcon imgn = new ImageIcon(getClass().getResource("/Imagenes/Hombre3.png"));
			ImageIcon iconon = new ImageIcon(imgn.getImage().getScaledInstance(219, 245, Image.SCALE_DEFAULT ));
			perfil.setIcon(iconon);
		}
		if(naleatorio == 4) {
			ImageIcon imgn = new ImageIcon(getClass().getResource("/Imagenes/Hombre4.png"));
			ImageIcon iconon = new ImageIcon(imgn.getImage().getScaledInstance(219, 245, Image.SCALE_DEFAULT ));
			perfil.setIcon(iconon);
		}
		if(naleatorio == 5) {
			ImageIcon imgn = new ImageIcon(getClass().getResource("/Imagenes/Hombre5.png"));
			ImageIcon iconon = new ImageIcon(imgn.getImage().getScaledInstance(219, 245, Image.SCALE_DEFAULT ));
			perfil.setIcon(iconon);
		}
	}
	
	public void asignarImagenPerfilMujer() {
		Random numale2 = new Random();
		int naleatorio2 = numale2.nextInt((5) + 1);
		if(naleatorio2 == 1) {
			ImageIcon imgn = new ImageIcon(getClass().getResource("/Imagenes/Mujer1.png"));
			ImageIcon iconon = new ImageIcon(imgn.getImage().getScaledInstance(219, 245, Image.SCALE_DEFAULT ));
			perfil.setIcon(iconon);
		}
		if(naleatorio2 == 2) {
			ImageIcon imgn = new ImageIcon(getClass().getResource("/Imagenes/Mujer2.png"));
			ImageIcon iconon = new ImageIcon(imgn.getImage().getScaledInstance(219, 245, Image.SCALE_DEFAULT ));
			perfil.setIcon(iconon);
		}
		if(naleatorio2 == 3) {
			ImageIcon imgn = new ImageIcon(getClass().getResource("/Imagenes/Mujer3.png"));
			ImageIcon iconon = new ImageIcon(imgn.getImage().getScaledInstance(219, 245, Image.SCALE_DEFAULT ));
			perfil.setIcon(iconon);
		}
		if(naleatorio2 == 4) {
			ImageIcon imgn = new ImageIcon(getClass().getResource("/Imagenes/Mujer4.png"));
			ImageIcon iconon = new ImageIcon(imgn.getImage().getScaledInstance(219, 245, Image.SCALE_DEFAULT ));
			perfil.setIcon(iconon);
		}
		if(naleatorio2 == 5) {
			ImageIcon imgn = new ImageIcon(getClass().getResource("/Imagenes/Mujer5.png"));
			ImageIcon iconon = new ImageIcon(imgn.getImage().getScaledInstance(219, 245, Image.SCALE_DEFAULT ));
			perfil.setIcon(iconon);
		}
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
	public JLabel getDivorcio() {
		return divorcio;
	}
	public void setDivorcio(JLabel divorcio) {
		this.divorcio = divorcio;
	}
	public JLabel getEstatura() {
		return estatura;
	}
	public void setEstatura(JLabel estatura) {
		this.estatura = estatura;
	}

	public JLabel getNegro() {
		return perfil;
	}

	public void setNegro(JLabel negro) {
		this.perfil = negro;
	}


}

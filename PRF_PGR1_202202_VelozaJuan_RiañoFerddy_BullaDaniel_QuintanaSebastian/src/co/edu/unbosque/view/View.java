package co.edu.unbosque.view;

import javax.swing.JOptionPane;

import co.edu.unbosque.controller.Controller;

public class View {

	private VentanaInicial vi;
	private VentanaInicioSesion vis;
	private VentanaGénero veg;
	private VentanaRegistroHombre vresgh;
	private VentanaRegistroMujer vresgm;
	private VentanaAplicacion vapp;
	private VentanaAdministrador vadmin;
	
	public View(Controller control) {
		vi = new VentanaInicial();
		vis = new VentanaInicioSesion();
		veg = new VentanaGénero();
		vresgh = new VentanaRegistroHombre();
		vresgm = new VentanaRegistroMujer();
		vapp = new VentanaAplicacion();
		vadmin = new VentanaAdministrador();
		
		vi.getIniciar().addActionListener(control);
		vi.getRegistrarse().addActionListener(control);
		vis.getIniciar().addActionListener(control);
		veg.getBotmasculino().addActionListener(control);
		veg.getBotfemenino().addActionListener(control);
		vresgh.getRegistrateh().addActionListener(control);
		vresgm.getRegistratem().addActionListener(control);
		vapp.getLike().addActionListener(control);
		vapp.getDislike().addActionListener(control);
		vadmin.getBtbuscar().addActionListener(control);
        vadmin.getBtborrar().addActionListener(control);
        vadmin.getBtactualizar().addActionListener(control);
        vadmin.getBtingresos().addActionListener(control);
        vadmin.getBtgenerarpdf().addActionListener(control);
        vadmin.getBtlikes().addActionListener(control);
	}
	
	public void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	public VentanaInicial getVi() {
		return vi;
	}

	public void setVi(VentanaInicial vi) {
		this.vi = vi;
	}

	public VentanaInicioSesion getVis() {
		return vis;
	}

	public VentanaAdministrador getVadmin() {
		return vadmin;
	}
	public void setVadmin(VentanaAdministrador vadmin) {
		this.vadmin = vadmin;
	}
	public void setVis(VentanaInicioSesion vis) {
		this.vis = vis;
	}


	public VentanaGénero getVeg() {
		return veg;
	}



	public void setVeg(VentanaGénero veg) {
		this.veg = veg;
	}



	public VentanaRegistroHombre getVresgh() {
		return vresgh;
	}



	public void setVresgh(VentanaRegistroHombre vresgh) {
		this.vresgh = vresgh;
	}



	public VentanaRegistroMujer getVresgm() {
		return vresgm;
	}



	public void setVresgm(VentanaRegistroMujer vresgm) {
		this.vresgm = vresgm;
	}



	public VentanaAplicacion getVapp() {
		return vapp;
	}



	public void setVapp(VentanaAplicacion vapp) {
		this.vapp = vapp;
	}
	
	
	
}

package co.edu.unbosque.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BosTinderDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String id;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String sexo;
	private String usuario;
	private String contrasena;
	private String correo;
	private String nacimiento;
	private String edad;
	private String estatura;
	private String ingresos;
	private String divorcio;
	private String nlikesr;
	private String nlikesd;
	private String nmatches;
	private String estado;
	
	public BosTinderDTO(String id, String nombre, String apellido1, String apellido2, String sexo, String usuario, String contrasena, String correo, String nacimiento, String edad, String estatura, String ingresos, String divorcio, String nlikesr, String nlikesd, String nmatches, String estado) {
		this.id = id;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.sexo = sexo;
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.correo = correo;
		this.nacimiento = nacimiento;
		this.edad = edad;
		this.estatura = estatura;
		this.ingresos = ingresos;
		this.divorcio = divorcio;
		this.nlikesr = nlikesr;
		this.nlikesd = nlikesd;
		this.nmatches = nmatches;
		this.estado = estado;
	}
	
	public String toString() {
		return "Id = " + id + ", Nombre = " + nombre + ", Apellido 1 = " + apellido1+ ", Apellido 2 = " + apellido2 + ", Sexo = " + sexo + ", Usuario = " + usuario + ", Contrasena = " + contrasena + ", Correo = " + correo + ", Nacimiento = " + nacimiento + ", Edad = " + edad + ", Estatura = " + estatura + ", Ingresos" + ingresos + divorcio + nlikesr + nlikesd + nmatches + estado;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getIngresos() {
		return ingresos;
	}

	public void setIngresos(String ingresos) {
		this.ingresos = ingresos;
	}

	public String getDivorcio() {
		return divorcio;
	}

	public void setDivorcio(String divorcio) {
		this.divorcio = divorcio;
	}

	public String getNlikesr() {
		return nlikesr;
	}

	public void setNlikesr(String nlikesr) {
		this.nlikesr = nlikesr;
	}

	public String getNlikesd() {
		return nlikesd;
	}

	public void setNlikesd(String nlikesd) {
		this.nlikesd = nlikesd;
	}

	public String getNmatches() {
		return nmatches;
	}

	public void setNmatches(String nmatches) {
		this.nmatches = nmatches;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}

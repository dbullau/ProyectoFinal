package co.edu.unbosque.model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import co.edu.unbosque.model.persistence.BosTinderFile;

public class BosTinderDAO {
	
	private BosTinderFile bf;
	private BosTinderDTO umostrar;
	
	public BosTinderDAO(BosTinderFile bf) {
		this.bf = bf;
	}
	
	public BosTinderDTO buscarUsuarios(String usuario, ArrayList<BosTinderDTO> usuarios) {
		BosTinderDTO encontrado = null;
		if (!usuarios.isEmpty()) {
			for (int i = 0; i < usuarios.size(); i++) {
				if (usuarios.get(i).getUsuario().equals(usuario)) {
					encontrado = usuarios.get(i);
				}
			}
		}

		return encontrado;
	}
	
	public BosTinderDTO buscarUsuariosIS(String usuario, String contrasena, ArrayList<BosTinderDTO> usuarios) {
		BosTinderDTO encontrado = null;
		if (!usuarios.isEmpty()) {
			for (int i = 0; i < usuarios.size(); i++) {
				if (usuarios.get(i).getUsuario().equals(usuario) && usuarios.get(i).getContrasena().equals(contrasena)) {
					encontrado = usuarios.get(i);
				}
			}
		}

		return encontrado;
	}
	
	public boolean agregarUsuarios(String id, String nombre, String apellido1, String apellido2, String sexo, String usuario, String contrasena, String correo, String nacimiento, String edad, String estatura, String ingresos, String divorcio, String nlikesr, String nlikesd, String nmatches, String estado, ArrayList<BosTinderDTO> usuarios) {
		BosTinderDTO nuevo = new BosTinderDTO(id, nombre, apellido1, apellido2, sexo, usuario, contrasena, correo, nacimiento, edad, estatura, ingresos, divorcio, nlikesr, nlikesd, nmatches, estado);
		
		if(buscarUsuarios(nombre, usuarios) == null){
			usuarios.add(nuevo);
			return true;	
		}else {
			return false;
		}
	}
	
	public String obtenerUsuarios(ArrayList<BosTinderDTO> usuarios){
		String texto = "";
		for (int i = 0; i < usuarios.size(); i++) {
			texto = texto.concat(usuarios.get(i).toString() + "\n");
		}
		return texto;
	}
	
	public void mostrarUsuarioAleatorio(String id, ArrayList<BosTinderDTO> usuarios) {
		umostrar = null;
		Random numale = new Random();
		int naleatorio = numale.nextInt((usuarios.size()) + 1);
		if(naleatorio == Integer.parseInt(id)) {
			naleatorio = naleatorio + 1;
		}
		umostrar = usuarios.get(naleatorio);
	}

	public BosTinderDTO getUmostrar() {
		return umostrar;
	}

	public void setUmostrar(BosTinderDTO umostrar) {
		this.umostrar = umostrar;
	}
}

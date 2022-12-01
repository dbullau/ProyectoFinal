package co.edu.unbosque.model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.persistence.BosTinderFile;

public class BosTinderDAO {
	
	private BosTinderFile ef;
	
	public BosTinderDAO(BosTinderFile ef) {
		this.ef = ef;
	}
	
	public BosTinderDTO buscarEstudiantes(String nombre, ArrayList<BosTinderDTO> estudiantes) {
		BosTinderDTO encontrado = null;
		if (!estudiantes.isEmpty()) {
			for (int i = 0; i < estudiantes.size(); i++) {
				if (estudiantes.get(i).getNombre().equals(nombre)) {
					encontrado = estudiantes.get(i);
				}
			}
		}

		return encontrado;
	}
	
	public boolean agregarEstudiantes(String id, String nombre, String apellido1, String apellido2, String sexo, String usuario, String contrasena, String correo, String nacimiento, String edad, String ingresos, String divorcio, String nlikesr, String nlikesd, String nmatches, String estado, ArrayList<BosTinderDTO> estudiantes) {
		BosTinderDTO nuevo = new BosTinderDTO(id, nombre, apellido1, apellido2, sexo, usuario, contrasena, correo, nacimiento, edad, ingresos, divorcio, nlikesr, nlikesd, nmatches, estado);
		
		if(buscarEstudiantes(nombre, estudiantes) == null){
			estudiantes.add(nuevo);
			return true;	
		}else {
			return false;
		}
	}
	
	public String obtenerEstudiantes(ArrayList<BosTinderDTO> estudiantes){
		String texto = "";
		for (int i = 0; i < estudiantes.size(); i++) {
			texto = texto.concat(estudiantes.get(i).toString() + "\n");
		}
		return texto;
	}
}

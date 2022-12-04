package co.edu.unbosque.model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import co.edu.unbosque.model.persistence.BosTinderFile;

public class BosTinderDAO {
	
	
	private BosTinderFile bf;
	private BosTinderDTO b;
	private BosTinderDTO umostrar;
	private BosTinderDTO umostrar2;
	private BosTinderDTO encontrado;
	private BosTinderDTO encontrado2;
	private BosTinderDTO encontrado3;
	
	
	public BosTinderDAO(BosTinderFile bf, BosTinderDTO b) {
		this.bf = bf;
		this.b = b;
	}
	
	public BosTinderDTO buscarUsuarios(String usuario, ArrayList<BosTinderDTO> usuarios) {
		encontrado = null;
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
		encontrado2 = null;
		if (!usuarios.isEmpty()) {
			for (int i = 0; i < usuarios.size(); i++) {
				if (usuarios.get(i).getUsuario().equals(usuario) && usuarios.get(i).getContrasena().equals(contrasena)) {
					encontrado = usuarios.get(i);
				}
			}
		}

		return encontrado2;
	}
	
	public BosTinderDTO buscarUsuariosAdmin(String id, ArrayList<BosTinderDTO> usuarios) {
		encontrado3 = null;
		if (!usuarios.isEmpty()) {
			for (int i = 0; i < usuarios.size(); i++) {
				if (usuarios.get(i).getId().equals(id)) {
					encontrado3 = usuarios.get(i);
				}
			}
		}

		return encontrado3;
	}
	
	public boolean agregarUsuarios(String id, String nombre, String apellido1, String apellido2, String sexo, String usuario, String contrasena, String correo, String nacimiento, String edad, String estatura, String ingresos, String divorcio, String nlikesr, String nlikesd, String nmatches, String estado, ArrayList<BosTinderDTO> usuarios) {
		BosTinderDTO nuevo = new BosTinderDTO(id, nombre, apellido1, apellido2, sexo, usuario, contrasena, correo, nacimiento, edad, estatura, ingresos, divorcio, nlikesr, nlikesd, nmatches, estado);
		
		if(buscarUsuarios(nombre, usuarios) == null){
			usuarios.add(nuevo);
			bf.escribirUsuarios(usuarios);
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
		int naleatorio = numale.nextInt((usuarios.size()));
		if(naleatorio == Integer.parseInt(id) || naleatorio == 1 || naleatorio == 0) {
			naleatorio = naleatorio + 1;
		}
		umostrar = usuarios.get(naleatorio);
		usuarios.set(naleatorio, umostrar);
		bf.escribirUsuarios(usuarios);
	}
	
	public void actualizarUsuario(String id, ArrayList<BosTinderDTO> usuarios) {
		int id1 = Integer.parseInt(id);
		usuarios.set(id1, umostrar);
		bf.escribirUsuarios(usuarios);
	}
	
	public void actualizarUsuario2(String id, ArrayList<BosTinderDTO> usuarios) {
		umostrar2 = null;
		umostrar2 = usuarios.get(Integer.parseInt(id));
		int id1 = Integer.parseInt(id);
		usuarios.set(id1, umostrar2);
		bf.escribirUsuarios(usuarios);
	}
	
	public boolean eliminarUsuario(String id, ArrayList<BosTinderDTO> usuarios) {
		boolean resp=false;
		BosTinderDTO eliminado = buscarUsuariosAdmin(id, usuarios);
		if(eliminado!=null) {
			usuarios.remove(eliminado);
			for (int i = Integer.parseInt(id); i + 1 <= usuarios.size(); i++) {
				eliminado = usuarios.get(i);
				eliminado.setId(String.valueOf(Integer.parseInt(eliminado.getId()) - 1));
				bf.escribirUsuarios(usuarios);
			}
			resp= true;
		}
		return resp;
	}

	public void ordenarPorlikes(ArrayList<BosTinder>usuarios, int inicio, int fin){
		BosTinder pivote = usuarios.get(inicio);
		int i = inicio;
		int j = fin;
		
		BosTinder aux;
	
		while(i < j) {
			
			while(usuarios.get(i) <= pivote.getBtdao().getB().getNlikesr() && i<j) {
				i++;
			}
			while(usuarios.get(j).getBtdao().getB().getNlikesr() > pivote.getBtdao().getB().getNlikesr()) {
				j--;
			}
			if(i<j) {
				aux = usuarios.get(i);
				usuarios.set(i, usuarios.get(j));
				usuarios.set(j, aux);
			}
		}
		usuarios.set(inicio, usuarios.get(j));
		usuarios.set(j, pivote);
		if(inicio < j - 1) {
			usuarios= ordenarPorLikes(usuarios,inicio,j-1);
		}
		if(j+1<fin) {
			usuarios= ordenarPorLikes(usuarios,j+1,fin);
		}
		return usuarios;
	}


	public BosTinderDTO getB() {
		return b;
	}

	public void setB(BosTinderDTO b) {
		this.b = b;
	}

	public BosTinderDTO getUmostrar() {
		return umostrar;
	}

	public void setUmostrar(BosTinderDTO umostrar) {
		this.umostrar = umostrar;
	}
	public BosTinderDTO getUmostrar2() {
		return umostrar2;
	}

	public void setUmostrar2(BosTinderDTO umostrar2) {
		this.umostrar2 = umostrar2;
	}
	public BosTinderDTO getEncontrado() {
		return encontrado;
	}

	public void setEncontrado(BosTinderDTO encontrado) {
		this.encontrado = encontrado;
	}

	public BosTinderDTO getEncontrado2() {
		return encontrado2;
	}

	public void setEncontrado2(BosTinderDTO encontrado2) {
		this.encontrado2 = encontrado2;
	}
	public BosTinderDTO getEncontrado3() {
		return encontrado3;
	}

	public void setEncontrado3(BosTinderDTO encontrado3) {
		this.encontrado3 = encontrado3;
	}
}

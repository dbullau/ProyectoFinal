package co.edu.unbosque.model.persistence;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import co.edu.unbosque.model.BosTinderDTO;


public class BosTinderFile {

	private String ruta = "./Data/datos.CSV";
	private String separador = ";";
	private ArrayList<BosTinderDTO> usuarios;
	private BufferedReader br;
	private FileReader fr;
	private String linea;
	
	public ArrayList<BosTinderDTO> leerUsuarios(String nombreArchivo){
		ArrayList<BosTinderDTO> usuarios = new ArrayList<BosTinderDTO>();
			try {
				fr = new FileReader(ruta);
				br = new BufferedReader(fr);
				while((linea = br.readLine()) != null) {
					String[] datos = linea.split(separador);
					usuarios.add(new BosTinderDTO(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6], datos[7], datos[8], datos[9], datos[10], datos[11], datos[12], datos[13], datos[14], datos[15], datos[16]));
				}
			}
			catch (IOException e){
				e.printStackTrace();
			}
		return usuarios;
	}
	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	public ArrayList<BosTinderDTO> getEstudiantes() {
		return usuarios;
	}

	public void setEstudiantes(ArrayList<BosTinderDTO> estudiantes) {
		this.usuarios = estudiantes;
	}
}

package co.edu.unbosque.model.persistence;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import co.edu.unbosque.model.BosTinderDTO;


public class BosTinderFile {

	private String ruta = "./Data/datos.CSV";
	private String separador = ";";
	private ArrayList<BosTinderDTO> estudiantes;
	private BufferedReader br;
	private FileReader fr;
	private String linea;
	
	public ArrayList<BosTinderDTO> leerEstudiantes(String nombreArchivo){
		ArrayList<BosTinderDTO> estudiantes = new ArrayList<BosTinderDTO>();
			try {
				fr = new FileReader(ruta);
				br = new BufferedReader(fr);
				while((linea = br.readLine()) != null) {
					String[] persona = linea.split(separador);
					estudiantes.add(new BosTinderDTO(persona[0], persona[1], persona[2], persona[3], persona[4], persona[5], persona[6], persona[7], persona[8], persona[9], persona[10], persona[11], persona[12], persona[13], persona[14], persona[15]));
				}
			}
			catch (IOException e){
				e.printStackTrace();
			}
		return estudiantes;
	}
	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	public ArrayList<BosTinderDTO> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<BosTinderDTO> estudiantes) {
		this.estudiantes = estudiantes;
	}
}

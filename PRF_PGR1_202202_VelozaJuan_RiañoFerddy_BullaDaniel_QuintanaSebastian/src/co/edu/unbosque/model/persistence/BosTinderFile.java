package co.edu.unbosque.model.persistence;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import co.edu.unbosque.model.BosTinderDTO;


public class BosTinderFile {
/*
 * esta clase busca y lee el archivo CSV 
 */
	private String ruta = "./Data/datos.CSV"; /*variable que tiene la ruta donde esta el archivo*/
	private String separador = ";"; /*variable que separa los datos */
	private ArrayList<BosTinderDTO> usuarios;/* variable de tipo ArrayList que almacena a cada usuario*/
	private BufferedReader br;/*variable que se encarga de leer el Contenido de el arcivo*/
	private FileReader fr;/*variable para leer archivo*/
	private String linea;/*almacena toda la informacion de una linea del archivo */
	
	public ArrayList<BosTinderDTO> leerUsuarios(String nombreArchivo){  /*metodo que lee el archivo y almacena la informacion en un ArrayList */
		ArrayList<BosTinderDTO> usuarios = new ArrayList<BosTinderDTO>();/* se define la variable usuarios como un arreglo */
			try {
				fr = new FileReader(ruta);/*Se define File reader y la ruta donde debe buscar el archivo */
				br = new BufferedReader(fr);/* se define Buffer reader y se le dice que lea al FileReader */
				while((linea = br.readLine()) != null) { /* mientras lo leido de el arrcivo sea diferente a nulo, que lo guarde en el arreglo, y asi con todos los usuarios */
					String[] datos = linea.split(separador);
					usuarios.add(new BosTinderDTO(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6], datos[7], datos[8], datos[9], datos[10], datos[11], datos[12], datos[13], datos[14], datos[15], datos[16]));
				}
			}
			catch (IOException e){
				e.printStackTrace();
			}
		return usuarios;
	}
	/* getters y setters*/
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

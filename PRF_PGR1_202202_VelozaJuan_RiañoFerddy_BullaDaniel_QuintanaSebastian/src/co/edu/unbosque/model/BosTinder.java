package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.BosTinderFile;

public class BosTinder {
	
	private BosTinderFile ef;
	private ArrayList<BosTinderDTO> edto;
	private BosTinderDAO edao;
	
	public BosTinder() {
		ef = new BosTinderFile();
		edto = new ArrayList<BosTinderDTO>();
		edto = ef.leerEstudiantes(null);
		edao = new BosTinderDAO(ef);
	}
	public BosTinderFile getEf() {
		return ef;
	}

	public void setEf(BosTinderFile ef) {
		this.ef = ef;
	}

	public ArrayList<BosTinderDTO> getEdto() {
		return edto;
	}

	public void setEdto(ArrayList<BosTinderDTO> edto) {
		this.edto = edto;
	}

	public BosTinderDAO getEdao() {
		return edao;
	}

	public void setEdao(BosTinderDAO edao) {
		this.edao = edao;
	}
}

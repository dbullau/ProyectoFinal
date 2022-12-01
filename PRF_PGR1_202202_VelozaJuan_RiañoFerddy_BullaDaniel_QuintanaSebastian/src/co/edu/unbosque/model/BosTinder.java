package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.BosTinderFile;

public class BosTinder {
	
	private BosTinderFile btf;
	private ArrayList<BosTinderDTO> btdto;
	private BosTinderDAO btdao;
	
	public BosTinder() {
		btf = new BosTinderFile();
		btdto = new ArrayList<BosTinderDTO>();
		btdto = btf.leerUsuarios(null);
		btdao = new BosTinderDAO(btf);
	}
	public BosTinderFile getBtf() {
		return btf;
	}
	public void setBtf(BosTinderFile btf) {
		this.btf = btf;
	}

	public ArrayList<BosTinderDTO> getBtdto() {
		return btdto;
	}

	public void setBtdto(ArrayList<BosTinderDTO> btdto) {
		this.btdto = btdto;
	}

	public BosTinderDAO getBtdao() {
		return btdao;
	}

	public void setBtdao(BosTinderDAO btdao) {
		this.btdao = btdao;
	}
}

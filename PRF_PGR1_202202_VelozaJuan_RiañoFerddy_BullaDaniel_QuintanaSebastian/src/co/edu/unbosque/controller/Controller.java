package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.BosTinder;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{

	private BosTinder bt;
	private View v;
	
	public Controller() {
		bt = new BosTinder();
		v = new View(this);
		v.getVi().setVisible(true);
		v.getVis().setVisible(false);
		funcionar();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 if(e.getActionCommand().equals(v.getVi().INICIAR)) {
	            v.getVi().setVisible(false);
	            v.getVis().setVisible(true);
	        }

	        if(e.getActionCommand().equals(v.getVi().REGISTRAR)) {
	            v.getVi().setVisible(false);
	            v.getVeg().setVisible(true);
	        }
	        
	        if(e.getActionCommand().equals(v.getVeg().HOMBRE)) {
	        	v.getVeg().setVisible(false);
	        	v.getVresgh().setVisible(true);
	        }else if(e.getActionCommand().equals(v.getVeg().MUJER)) {
	        	v.getVeg().setVisible(false);
	        	v.getVresgm().setVisible(true);
	        }
	        
	        if(e.getActionCommand().equals(v.getVresgh().REGISTRATEM)) {
		    	  v.getVresgh().setVisible(false);
		    	  
		    	  v.getVis().setVisible(true);
		    	
		      }
		      
		      if(e.getActionCommand().equals(v.getVresgm().REGISTRATEF)) {
		    	  v.getVresgh().setVisible(false);
		    	 
		    	  v.getVis().setVisible(true);
		    	  
		      }
		      
		      if(e.getActionCommand().equals(v.getVis().INGRESAR)) {
		    	  v.getVis().setVisible(false);
		    	  v.getVapp().setVisible(true);
		      }
		      
	}
	
	public void funcionar() {
		System.out.println(bt.getBtdao().obtenerUsuarios(bt.getBtdto()));
	}
	
	
}

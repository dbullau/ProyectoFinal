package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.View;

public class Controller implements ActionListener{

	private View gui;
	
	public Controller() {
		gui = new View(this);
		gui.getVi().setVisible(true);
		gui.getVis().setVisible(false);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 if(e.getActionCommand().equals(gui.getVi().INICIAR)) {
	            gui.getVi().setVisible(false);
	            gui.getVis().setVisible(true);
	        }

	        if(e.getActionCommand().equals(gui.getVi().REGISTRAR)) {
	            gui.getVi().setVisible(false);
	            gui.getVeg().setVisible(true);
	        }
	        
	        if(e.getActionCommand().equals(gui.getVeg().HOMBRE)) {
	        	gui.getVeg().setVisible(false);
	        	gui.getVresgh().setVisible(true);
	        }else if(e.getActionCommand().equals(gui.getVeg().MUJER)) {
	        	gui.getVeg().setVisible(false);
	        	gui.getVresgm().setVisible(true);
	        }
	        
	        if(e.getActionCommand().equals(gui.getVresgh().REGISTRATEM)) {
		    	  gui.getVresgh().setVisible(false);
		    	  
		    	  gui.getVis().setVisible(true);
		    	
		      }
		      
		      if(e.getActionCommand().equals(gui.getVresgm().REGISTRATEF)) {
		    	  gui.getVresgh().setVisible(false);
		    	 
		    	  gui.getVis().setVisible(true);
		    	  
		      }
		      
		      if(e.getActionCommand().equals(gui.getVis().INGRESAR)) {
		    	  gui.getVis().setVisible(false);
		    	  gui.getVapp().setVisible(true);
		      }
		      
	}
	
	
}

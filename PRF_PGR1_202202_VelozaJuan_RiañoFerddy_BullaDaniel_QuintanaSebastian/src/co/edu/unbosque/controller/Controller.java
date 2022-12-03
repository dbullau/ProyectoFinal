package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.BosTinder;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{

	private BosTinder bt;
	private View v;
	private int nlikesd;
	private int nlikesr;
	
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
	            v.getVadmin().setVisible(true);
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
	        	if(v.getVresgh().getTxtnombre().getText().isEmpty() || v.getVresgh().getTxtapellido1().getText().isEmpty() || v.getVresgh().getTxtapellido2().getText().isEmpty() || v.getVresgh().getTxtusuario().getText().isEmpty() || v.getVresgh().getTxtcorreo().getText().isEmpty() || v.getVresgh().getTxtcontraseña().getText().isEmpty() || v.getVresgh().getTxtestatura().getText().isEmpty() || v.getVresgh().getTxtingresos().getText().isEmpty() || v.getVresgh().getTxtdnacimiento().getText().isEmpty() || v.getVresgh().getTxtmnacimiento().getText().isEmpty() || v.getVresgh().getTxtanacimiento().getText().isEmpty() || v.getVresgh().getTxtedad().getText().isEmpty()) {
	        		v.mostrarInformacion("Se deben llenar todos los datos solicitados");
	        	}else {
	        		String sexo = "H";
	        		String divorcio = "No Aplica";
	        		String nlikesr = "0";
	        		String nlikesd = "0";
	        		String nmatches = "0";
	        		String estado = "Disponible";
	        		if(bt.getBtdao().agregarUsuarios(String.valueOf(bt.getBtdto().size()), v.getVresgh().getTxtnombre().getText(), v.getVresgh().getTxtapellido1().getText(), v.getVresgh().getTxtapellido2().getText(), sexo, v.getVresgh().getTxtusuario().getText(), v.getVresgh().getTxtcontraseña().getText(), v.getVresgh().getTxtcorreo().getText(), v.getVresgh().getTxtdnacimiento().getText() + v.getVresgh().getSm().getText() + v.getVresgh().getTxtmnacimiento().getText() + v.getVresgh().getSa().getText() + v.getVresgh().getTxtanacimiento().getText(), v.getVresgh().getTxtedad().getText(), v.getVresgh().getTxtestatura().getText(), v.getVresgh().getTxtingresos().getText(), divorcio, nlikesr, nlikesd, nmatches, estado, bt.getBtdto())) {
	        			v.mostrarInformacion("Te has registrado exitosamente");
	        			v.getVresgh().setVisible(false);
	   		    	  	v.getVis().setVisible(true);
	        		}else {
	        			v.mostrarInformacion("El nombre de usuario que introduciste ya se encuentra registrado");
	        		}
	        	}
		      }
		      
	        if(e.getActionCommand().equals(v.getVresgm().REGISTRATEF)) {
	        	if(v.getVresgm().getTxtnombre().getText().isEmpty() || v.getVresgm().getTxtapellido1().getText().isEmpty() || v.getVresgm().getTxtapellido2().getText().isEmpty() || v.getVresgm().getTxtusuario().getText().isEmpty() || v.getVresgm().getTxtcorreo().getText().isEmpty() || v.getVresgm().getTxtcontraseña().getText().isEmpty() || v.getVresgm().getTxtestatura().getText().isEmpty() || v.getVresgm().getTxtdivorcio().getText().isEmpty() || v.getVresgm().getTxtdnacimiento().getText().isEmpty() || v.getVresgm().getTxtmnacimiento().getText().isEmpty() || v.getVresgm().getTxtanacimiento().getText().isEmpty() || v.getVresgm().getTxtedad().getText().isEmpty()) {
	        		v.mostrarInformacion("Se deben llenar todos los datos solicitados");
	        	}else {
	        		String sexo = "M";
	        		String ingresos = "No Aplica";
	        		String nlikesr = "0";
	        		String nlikesd = "0";
	        		String nmatches = "0";
	        		String estado = "Disponible";
	        		if(bt.getBtdao().agregarUsuarios(String.valueOf(bt.getBtdto().size()), v.getVresgm().getTxtnombre().getText(), v.getVresgm().getTxtapellido1().getText(), v.getVresgm().getTxtapellido2().getText(), sexo, v.getVresgm().getTxtusuario().getText(), v.getVresgm().getTxtcontraseña().getText(), v.getVresgm().getTxtcorreo().getText(), v.getVresgm().getTxtdnacimiento().getText() + v.getVresgm().getSm().getText() + v.getVresgm().getTxtmnacimiento().getText() + v.getVresgm().getSa().getText() + v.getVresgm().getTxtanacimiento().getText(), v.getVresgm().getTxtedad().getText(), v.getVresgm().getTxtestatura().getText(), ingresos, v.getVresgm().getTxtdivorcio().getText(), nlikesr, nlikesd, nmatches, estado, bt.getBtdto())) {
	        			v.mostrarInformacion("Te has registrado exitosamente");
	        			v.getVresgm().setVisible(false);
	   		    	  	v.getVis().setVisible(true);
	        		}else {
	        			v.mostrarInformacion("El nombre de usuario que introduciste ya se encuentra registrado");
	        		}
	        	}
		      }
		      
		      if(e.getActionCommand().equals(v.getVis().INGRESAR)) {
		    	 if(bt.getBtdao().buscarUsuariosIS(v.getVis().getUsuario().getText(), v.getVis().getContraseña().getText(), bt.getBtdto()) != null) {
		    		 v.getVis().setVisible(false);
			    	 v.getVapp().setVisible(true);
			    	 nlikesd = Integer.parseInt(bt.getBtdao().buscarUsuariosIS(v.getVis().getUsuario().getText(), v.getVis().getContraseña().getText(), bt.getBtdto()).getNlikesd());
			    	 bt.getBtdao().mostrarUsuarioAleatorio(bt.getBtdao().buscarUsuariosIS(v.getVis().getUsuario().getText(), v.getVis().getContraseña().getText(), bt.getBtdto()).getId(), bt.getBtdto());
			    	 v.getVapp().getNombre().setText(bt.getBtdao().getUmostrar().getNombre() + " " + bt.getBtdao().getUmostrar().getApellido1() + " " + bt.getBtdao().getUmostrar().getApellido2());
			    	 v.getVapp().getEdad().setText(bt.getBtdao().getUmostrar().getEdad());
			    	 v.getVapp().getNacimiento().setText(bt.getBtdao().getUmostrar().getNacimiento());
			    	 v.getVapp().getEstado().setText(bt.getBtdao().getUmostrar().getEstado());
			    	 v.getVapp().getDivorcio().setText(bt.getBtdao().getUmostrar().getDivorcio());
			    	 v.getVapp().getIngresos().setText(bt.getBtdao().getUmostrar().getIngresos());
			    	 v.getVapp().getSexo().setText(bt.getBtdao().getUmostrar().getSexo());
			    	 v.getVapp().getEstatura().setText(bt.getBtdao().getUmostrar().getEstatura());
			    	 String sexo = bt.getBtdao().getUmostrar().getSexo();
			    	 if(sexo.equals("H")) {
			    		 v.getVapp().asignarImagenPerfilHombre();
			    	 }else if(sexo.equals("M")){
			    		 v.getVapp().asignarImagenPerfilMujer();
			    	 }
		    	 }else {
		    		 v.mostrarInformacion("El usuario y/o contraseña ingresados son incorrectos");
		    	 }
		      }
		      
		      if(e.getActionCommand().equals(v.getVapp().LIKE)) {
		    	  nlikesr = Integer.parseInt(bt.getBtdao().getUmostrar().getNlikesr());
		    	  bt.getBtdao().getUmostrar().setNlikesr(String.valueOf(nlikesr + 1));
		    	  nlikesr = nlikesr + 1;
		    	  bt.getBtdao().actualizarUsuario(bt.getBtdao().getUmostrar().getId(), bt.getBtdto());
		    	  bt.getBtdao().mostrarUsuarioAleatorio(bt.getBtdao().buscarUsuariosIS(v.getVis().getUsuario().getText(), v.getVis().getContraseña().getText(), bt.getBtdto()).getId(), bt.getBtdto());
		    	  v.getVapp().getNombre().setText(bt.getBtdao().getUmostrar().getNombre() + " " + bt.getBtdao().getUmostrar().getApellido1() + " " + bt.getBtdao().getUmostrar().getApellido2());
		    	  v.getVapp().getEdad().setText(bt.getBtdao().getUmostrar().getEdad());
		    	  v.getVapp().getNacimiento().setText(bt.getBtdao().getUmostrar().getNacimiento());
		    	  v.getVapp().getEstado().setText(bt.getBtdao().getUmostrar().getEstado());
		    	  v.getVapp().getDivorcio().setText(bt.getBtdao().getUmostrar().getDivorcio());
		    	  v.getVapp().getIngresos().setText(bt.getBtdao().getUmostrar().getIngresos());
		    	  v.getVapp().getSexo().setText(bt.getBtdao().getUmostrar().getSexo());
		    	  v.getVapp().getEstatura().setText(bt.getBtdao().getUmostrar().getEstatura());
		    	  bt.getBtdao().buscarUsuariosIS(v.getVis().getUsuario().getText(), v.getVis().getContraseña().getText(), bt.getBtdto()).setNlikesd(String.valueOf(nlikesd + 1));
		    	  nlikesd = nlikesd + 1;
		    	  bt.getBtdao().actualizarUsuario2(bt.getBtdao().buscarUsuariosIS(v.getVis().getUsuario().getText(), v.getVis().getContraseña().getText(), bt.getBtdto()).getId(), bt.getBtdto());
		    	  String sexo = bt.getBtdao().getUmostrar().getSexo();
		    	  if(sexo.equals("H")) {
		    		  v.getVapp().asignarImagenPerfilHombre();
		    	  }else if(sexo.equals("M")){
		    		  v.getVapp().asignarImagenPerfilMujer();
		    	  }
		      }
		      
		      if(e.getActionCommand().equals(v.getVapp().DISLIKE)){
		    	  bt.getBtdao().mostrarUsuarioAleatorio(bt.getBtdao().buscarUsuariosIS(v.getVis().getUsuario().getText(), v.getVis().getContraseña().getText(), bt.getBtdto()).getId(), bt.getBtdto());
		    	  v.getVapp().getNombre().setText(bt.getBtdao().getUmostrar().getNombre() + " " + bt.getBtdao().getUmostrar().getApellido1() + " " + bt.getBtdao().getUmostrar().getApellido2());
		    	  v.getVapp().getEdad().setText(bt.getBtdao().getUmostrar().getEdad());
		    	  v.getVapp().getNacimiento().setText(bt.getBtdao().getUmostrar().getNacimiento());
		    	  v.getVapp().getEstado().setText(bt.getBtdao().getUmostrar().getEstado());	
		    	  v.getVapp().getDivorcio().setText(bt.getBtdao().getUmostrar().getDivorcio());
		    	  v.getVapp().getIngresos().setText(bt.getBtdao().getUmostrar().getIngresos());
		    	  v.getVapp().getSexo().setText(bt.getBtdao().getUmostrar().getSexo());
		    	  v.getVapp().getEstatura().setText(bt.getBtdao().getUmostrar().getEstatura());
		    	  String sexo = bt.getBtdao().getUmostrar().getSexo();
		    	  if(sexo.equals("H")) {
		    		  v.getVapp().asignarImagenPerfilHombre();
		    	  }else if(sexo.equals("M")){
		    		  v.getVapp().asignarImagenPerfilMujer();
		    	  }
		      }
		      
		      if(e.getActionCommand().equals(v.getVadmin().BUSCAR)) {
		    	 if(bt.getBtdao().buscarUsuariosAdmin(v.getVadmin().getTxtnumusuario().getText(), bt.getBtdto()) != null) {
		    		 v.getVadmin().getInformacionfiltrada().setText("ID: " + bt.getBtdao().getEncontrado3().getId() + ", NOMBRE: " + bt.getBtdao().getEncontrado3().getNombre() + ", APELLIDO 1: " + bt.getBtdao().getEncontrado3().getApellido1() + ", APELLIDO 2:" + bt.getBtdao().getEncontrado3().getApellido2() + ", SEXO: " + bt.getBtdao().getEncontrado3().getSexo() + ", USUARIO: " + bt.getBtdao().getEncontrado3().getUsuario() + ", CONTRASENA: " + bt.getBtdao().getEncontrado3().getContrasena() + ", CORREO: " + bt.getBtdao().getEncontrado3().getCorreo() + ", NACIMIENTO: " + bt.getBtdao().getEncontrado3().getNacimiento() + ", EDAD: " + bt.getBtdao().getEncontrado3().getEdad() + ", ESTATURA: " + bt.getBtdao().getEncontrado3().getEstatura() + ", INGRESOS: " + bt.getBtdao().getEncontrado3().getIngresos() + ", DIVORCIO: " + bt.getBtdao().getEncontrado3().getDivorcio() + ", NUMERO DE LIKES RECIBIDOS: " + bt.getBtdao().getEncontrado3().getNlikesr() + ", NUMERO DE LIKES OTORGADOS: " + bt.getBtdao().getEncontrado3().getNlikesd() + ", NUMERO DE MATCHES: " + bt.getBtdao().getEncontrado3().getNmatches() + ", ESTADO: " + bt.getBtdao().getEncontrado3().getEstado());
		    		 v.getVadmin().getTxtnumusuario().setText("");
		    	 }else {
		    		 v.getVadmin().getInformacionfiltrada().setText("");
		    		 v.getVadmin().getTxtnumusuario().setText("");
		    		 v.mostrarInformacion("El usuario con ID: " + v.getVadmin().getTxtnumusuario().getText() + " no existe");
		    	 }
		      }
		      
		      if(e.getActionCommand().equals(v.getVadmin().BORRAR)) {
		    	  if(bt.getBtdao().buscarUsuariosAdmin(v.getVadmin().getTxtnumusuario().getText(), bt.getBtdto()) != null) {
		    		  if(bt.getBtdao().eliminarUsuario(v.getVadmin().getTxtnumusuario().getText(), bt.getBtdto())) {
		    			   v.mostrarInformacion("Se ha eliminado el usuario con ID: " + v.getVadmin().getTxtnumusuario().getText());
		    		  }else {
		    			  v.mostrarInformacion("No se ha podido eliminar con ID: " + v.getVadmin().getTxtnumusuario().getText());
		    		  }
		    	  }else {
		    		  v.mostrarInformacion("El usuario con ID: " + v.getVadmin().getTxtnumusuario().getText() + " no existe");
		    	  }
		      }
	}
	
	public void funcionar() {
		System.out.println(bt.getBtdao().obtenerUsuarios(bt.getBtdto()));
	}
	
	
}

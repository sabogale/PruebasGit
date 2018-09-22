package Uninorte;

import java.util.LinkedList;

public class estudiante extends Persona {
	LinkedList<String> programa;
	
	public estudiante(String nombre, String apellido) {
		super(nombre, apellido);
		this.programa = new LinkedList<String>();	
	}

	public LinkedList<String> getPrograma() {
		return programa;
	}

	public void setPrograma(LinkedList<String> programa) {
		this.programa = programa;
	}
	

	
}

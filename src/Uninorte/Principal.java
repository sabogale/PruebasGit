package Uninorte;

import java.util.LinkedList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona("Edward","Sabogal");
		Persona persona2 = new Persona("Edna","Sabogal");
		Persona persona3 = new Persona("Miguel","Sabogal");
		
		LinkedList<Persona> ListaAuxiliar = new LinkedList<Persona>();
		LinkedList<Persona> ListaPersonas = new LinkedList<Persona>();
		
		ListaAuxiliar.add(persona1);
		ListaAuxiliar.add(persona2);
		ListaAuxiliar.add(persona3);
		
		Scanner sc = new Scanner(System.in);
		
		for(Persona p : ListaAuxiliar) {
			System.out.println("\n \r De: ");  
			System.out.println(p.getNombreCompleto());
			System.out.println("Digite Direccion: ");
			p.setDireccion(sc.nextLine());
			System.out.println("Digite Telefono: ");
			p.setTelefono(sc.nextLine());
			System.out.println("Digite Correo: ");
			p.setCorreo(sc.nextLine());
			ListaPersonas.add(p);
		}
		sc.close();
		
		for(Persona p: ListaPersonas) {
			System.out.println(p.getCorreo()+" "+p.direccion+""+p.telefono+" "+p.correo);
		}
		
		
	}

}

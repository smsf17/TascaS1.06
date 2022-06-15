package N1exercici2SamayoaS;

import java.util.ArrayList;

public class GenericMethods <T> {
	
	T datos;

	public GenericMethods(T datos) {
		super();
		this.datos = datos;
	}
		 
	public static void imprimirPersona(ArrayList<?>miLista) {
		  System.out.println(miLista);
	  } 
	
	public static <T> String imprimirIndividuo(T [] a) {
		return "Nombre: " +a.toString();
	}

	public static <T>void imprimirPersona2(T x, T y, T z) {
		System.out.println("Persona: " +x +" " + y +" " + z);
		
	}
	  
}

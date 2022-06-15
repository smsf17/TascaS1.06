package N1exercici2SamayoaS;

import java.util.ArrayList;

public class N1exercici2SamayoaS {

	public static void main(String[] args) {
		
		ArrayList <Persona> lista = new ArrayList <Persona>();
		
		lista.add(new Persona ("Ana", "Perez", 22));
		lista.add(new Persona ("Juan", "Lopez", 48));
		lista.add(new Persona (38, "Maria", "Espinos"));
		lista.add(new Persona ("Pedro", 56, "Blanch"));
		lista.add(new Persona ("Olga", "Merida", 31));
		
		GenericMethods.imprimirPersona(lista); 
		GenericMethods.imprimirPersona2("Olga", "Merida", 31); 
		

	}

}

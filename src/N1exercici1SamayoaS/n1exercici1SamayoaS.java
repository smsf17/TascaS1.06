package N1exercici1SamayoaS;

import java.util.ArrayList;

public class n1exercici1SamayoaS {

	public static void main(String[] args) {
		ArrayList <NoGenericMethods> lista = new ArrayList <NoGenericMethods>();
		
		lista.add(new NoGenericMethods ("Ana", "Perez", 22));
		lista.add(new NoGenericMethods ("Juan", 48, "Lopez"));
		lista.add(new NoGenericMethods (38, "Maria", "Espinos"));
		
		for (NoGenericMethods e:lista) {
			System.out.println(e.toString());
		}

	}

}

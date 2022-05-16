package clase6;

public class StringMain {

	public static void main(String[] args) {
		String palabra = "hola soy de river el mejor de america";
		if(palabra.startsWith("ho")) {
			System.out.println("comienza con ho");
		}else {
			System.out.println("No comienza con ho");
		}
		
		if(palabra.charAt(0) == 'h') {
			System.out.println("comienza con h");
		}else {
			System.out.println("No comienza con h");
		}
		
		String otraPalabra = new String("hola soy de river el mejor de america");
		if(palabra == otraPalabra) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		// para comparar cadenas String debo usar .equals()
		if(palabra.equals(otraPalabra)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		Object edad = new Integer(10);
		Object nombre = "carlos";
		Object letra = new Character('a');
		Object[] unArrayCualquiera = {edad, nombre, letra};
		
		for(Object aux : unArrayCualquiera) {

			if(aux instanceof Integer) {
				Integer auxInteger = (Integer)aux;
				System.out.println(auxInteger);
			}else if(aux instanceof String) {
				String auxString = (String)aux;
				System.out.println(auxString);
			}else {
				Character auxChar = (Character)aux;
				System.out.println(auxChar);
			}
		}
		
	}

}

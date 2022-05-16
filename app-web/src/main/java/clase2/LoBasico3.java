package clase2;

public class LoBasico3 {

	public static void main(String[] args) {
		// boolean
		// boolean alto = false;
		
		boolean esViernes = false;
		boolean tuCuerpoLoSabe = false;
		
		// operadores logicos
		// and or nor xor
		boolean saleAfter = !esViernes || !tuCuerpoLoSabe;
		System.out.println(saleAfter);
		
		if(saleAfter) {
			System.out.println("nos vamos de fiesta");
		}else {
			System.out.println("me quedo en casa viendo netflix");
		}
	}

}

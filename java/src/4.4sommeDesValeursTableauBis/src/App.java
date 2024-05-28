import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// VARIABLES
		
		int i = 0;
		float [] tableau ;
		float somme = 0;
		
		//TRAITEMENT
		
		tableau = new float [] {1.1f,1.2f,1.3f,1.4f,1.5f,1.6f,1.7f,1.8f,1.9f};
		
		for (i = 0; i < tableau.length; i++) {
			somme = somme + i;
		}//FIN FOR
		System.out.println("La somme des valeurs du tableau est :" + somme);
	}

}

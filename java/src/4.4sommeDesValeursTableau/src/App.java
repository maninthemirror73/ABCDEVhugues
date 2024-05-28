//package demoFonctions;

public class App {

	public static void main(String[] args) {
		/*
		 * Exercice 4.4 : Somme des valeurs d’un tableau
		 * 
		 * Écrire un algorithme calculant la somme des valeurs d’un tableau (on suppose
		 * que le tableau a été préalablement saisi avec 10 nombres réels (float)).
		 */
		
		int i;//pour la boucle
		float []tableau;
		float somme = 0;
		
		tableau = new float [] {10,23.2f,25.1f,21.3f,63.2f,52.4f,56.2f,42.3f,21.36f,52.14f};
		
		for (i = 0; i < tableau.length; i++ ) {
			somme = somme + i;
		}//FIN FOR
		
		System.out.println("La somme des valeurs du tableau est :" + somme);
	}

}


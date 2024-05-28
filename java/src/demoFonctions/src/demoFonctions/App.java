package demoFonctions;

public class App {

	public static void main(String[] args) {
		/*
		 * Exercice 4.4 : Somme des valeurs d’un tableau
		 * 
		 * Écrire un algorithme calculant la somme des valeurs d’un tableau (on suppose
		 * que le tableau a été préalablement saisi avec 10 nombres réels (float)).
		 */
		
		int i;//utilise pour la boucle for
		float somme;//somme des valeurs du tableau
		float [] tableau;// Le tableau
		
		tableau = new float[] {11.2f,56.23f,4.2f,6.8f,7.1f,6.32f,8.21f,56.12f,45.23f,12.54f};
		
		somme = 0;
		
		for(i = 0; i < tableau.length; i++) {
			//somme = somme + tableau [i];
			somme += tableau [i];
		}//FIN FOR
		
		System.out.println("La somme des valeurs du tableau est :" + somme);

	}

}

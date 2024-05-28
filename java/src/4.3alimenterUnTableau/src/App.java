import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// VARIABLES
		Scanner sc = new Scanner (System.in);
		int tailleDuTableau;
		int i;
		int positif = 0;
		int negatif = 0;
		int [] tableau;
		
		System.out.println("Entre le nombre de valeurs que vous souhaitez saisir :");
		tailleDuTableau = sc.nextInt();
		
		tableau = new int [tailleDuTableau];//initialisation de tableau
		
		for(i = 0; i < tailleDuTableau; i++) {
			System.out.println("Saisissez la valeur N°" + (i+1));
			tableau [i] = sc.nextInt();
			
			if(tableau [i] >= 0) {
				positif++;
			}
			else {
				negatif++;
			}
		} //FIN FOR
		
		System.out.println("Vous avez saisi " + positif + "nombres positifs");
		System.out.println("Vous avez saisi " + negatif + "nombresnegatifs");
		sc.close();

	}

}



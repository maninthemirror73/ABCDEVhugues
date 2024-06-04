import java.util.Scanner;
public class App1 {

	public static void main(String[] args) {
		//VARIABLES
		Scanner sc = new Scanner (System.in);
		int tailleDuTableau;
		int i;
		int []tableau;
		
		System.out.println("Entrer le nombre de valeurs que vous souhaitez saisir :");
		tailleDuTableau = sc.nextInt();
		
		tableau = new int [tailleDuTableau];//initialisation du tableau
		
		for (i = 0; i < tailleDuTableau; i++) {
			System.out.println("Entrer la valeur N°" + (i+1));
			tableau [i] = sc.nextInt();
		}
		
		
		
		sc.close();

	}

}

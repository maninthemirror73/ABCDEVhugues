import java.util.Scanner;
public class App3 {

	public static void main(String[] args) {
		//VARIABLES
		int tailleDuTableau;
		int i;
		int []tableau;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Nombre de valeurs :");
		tailleDuTableau = sc.nextInt();
		
		tableau = new int [tailleDuTableau];
		
		for(i = 0; i < tailleDuTableau; i++) {
			System.out.println("Saisissez la valeur N° " + (i+1));
			tableau[i] = sc.nextInt();
		}
		for (i = 0; i < tailleDuTableau; i++) {
			System.out.println(tableau [i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}

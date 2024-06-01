import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		//VARIABLES
		int tailleDuTableau;
		int [] tableau;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Combien de valeurs souhaitez vous entrer ?");
		tailleDuTableau = sc.nextInt();
		
		for (i = 0; i <= tailleDuTableau; i++) {
			tableau[i] = tailleDuTableau(i);
		}
		
		
		
		
		
		
		
		sc.close();
	}

}

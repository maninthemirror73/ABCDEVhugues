import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// VARIABLES
		
		int A = - 5;
		Scanner sc = new Scanner (System.in);
		
		//TRAITEMENT
		
		if (A > 18) {
			System.out.println("Vous êtes majeur.");
		}
		else if (A < 18 && A > 0) {
			System.out.println("Vous êtes mineur.");
		}
		else {
			System.out.println("Vous n'êtes pas né.");
		}
		
		sc.close();
	}

}

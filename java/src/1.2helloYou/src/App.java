import java.util.Scanner;
public class App {
	
	public static void main(String[] args) {
		// VARIABLES
		
		String prenom;
		
		String message = "Bonjour";
		
		Scanner sc = new Scanner (System.in);
		
		
		
		// TRAITEMENT
		
		System.out.println("Entrer votre prénom :");
		prenom = sc.nextLine();
		
		System.out.println(message  + " " + prenom + "!");
		

	sc.close();	

	}

}

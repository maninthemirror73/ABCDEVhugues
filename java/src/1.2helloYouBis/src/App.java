import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// VARIABLES 
		
		String prenom;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entrer votre prenom :");
		prenom = sc.next();
		
		System.out.println("Bonjour " + prenom + " !");

		sc.close();

	}

}

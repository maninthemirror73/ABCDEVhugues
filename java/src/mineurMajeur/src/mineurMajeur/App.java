package mineurMajeur;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// Variables
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez votre âge");
		age = sc.nextInt();
		
		if (age > 17) {
			System.out.println("Vous êtes majeur.");				
		}
		else {
			System.out.println("Vous êtes mineur.");
		}
		sc.close();
	}

}

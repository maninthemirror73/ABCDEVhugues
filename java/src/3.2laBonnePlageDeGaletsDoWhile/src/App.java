import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// VARIABLES
		
		int nombreSaisi;
		int nombreChoisi = 15;
		Scanner sc = new Scanner (System.in);
		
		
		//TRAITEMENT
		
		do {
			System.out.println("Entrer un nombre entre 10 et 20");
			nombreSaisi = sc.nextInt();
			
			if (nombreSaisi < 10) {
				
				System.out.println("Plus grand !");	
			}
			else if (nombreSaisi > 20) {
				System.out.println("Plus petit !");	
			}
			
		} while(nombreSaisi < 10 || nombreSaisi > 20);
		
		System.out.println("Yes, you did it !");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

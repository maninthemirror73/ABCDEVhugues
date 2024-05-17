package elections;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// Variables
		double scoreCandidat1;
		double scoreCandidat2;
		double scoreCandidat3;
		double scoreCandidat4;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entrer le score du candidat 1");
		scoreCandidat1 = sc.nextDouble();
		
		System.out.println("Entrer le score du candidat 2");
		scoreCandidat2 = sc.nextDouble();
		
		System.out.println("Entrer le score du candidat 3");
		scoreCandidat3 = sc.nextDouble();
		
		System.out.println("Entrer le score du candidat 4");
		scoreCandidat4 = sc.nextDouble();
		
		if(scoreCandidat1 > 50) {
			System.out.println("Candidat 1 est élu");	
		}
		else if(scoreCandidat1 < 12.5) {
			System.out.println("Candidat 1 est battu");
		}
		else if (scoreCandidat1 > scoreCandidat2 && scoreCandidat1 >scoreCandidat3 && scoreCandidat1 > scoreCandidat4) {
			System.out.println("Balottage favorable");
		}
		else {
			System.out.println("Balottage défavorable");
		}
		
		sc.close();
		
		

	}

}

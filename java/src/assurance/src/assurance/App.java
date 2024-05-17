package assurance;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// Variables
		int ageDuConducteur;
		int ancienneteDuPermis;
		int nombreDaccidents;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Age du conducteur");
		ageDuConducteur = sc.nextInt();
		
		System.out.println("Ancienneté du permis");
		ancienneteDuPermis = sc.nextInt();
		
		System.out.println("Nombre d'accidents");
		nombreDaccidents = sc.nextInt();
		
		if (ageDuConducteur < 25 && ancienneteDuPermis < 2) {
			if (nombreDaccidents == 0) {
			System.out.println("Tarif rouge");	
			}
			else {
			System.out.println("Contrat refusé");	
			}
		}
		if ((ageDuConducteur < 25 && ancienneteDuPermis > 2) || (ageDuConducteur > 25 && ancienneteDuPermis < 2)){
			if (nombreDaccidents == 0) {
				System.out.println("Tarif orange"); 	
			}
		    
			else if (nombreDaccidents == 1) {
				System.out.println("Tarif rouge"); 
			}
			else {
				System.out.println("Contrat refusé") ;
			} 							
		}
	
		
		if (ageDuConducteur > 25 && ancienneteDuPermis > 2) {
			if (nombreDaccidents == 0) {
				System.out.println("Tarif vert");
			}
			else if (nombreDaccidents == 1) {
				System.out.println("Tarif orange");
			}
			else if (nombreDaccidents == 2) {
				System.out.println("Tarif rouge");
			}
			else {
				System.out.println("Contrat refusé");
			}
		}
		sc.close();

	}

}

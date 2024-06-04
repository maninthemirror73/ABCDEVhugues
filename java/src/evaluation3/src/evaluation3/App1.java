package evaluation3;
import java.util.Scanner;
public class App1 {

	public static void main(String[] args) {
		//VARIABLES
	Scanner sc = new Scanner (System.in);
	int []tableau;
	tableau = new int [] {2,4,1,8,6,14,23,25,7,42};
	int somme = 0;
	double moyenne;
	int plusGrand = 0;
	int carrePlusGrand;
	int i;
	
	for (i = 0;i < tableau.length; i++) {
		somme = somme + tableau[i];	
		
		if(plusGrand < tableau[i]){
			
			plusGrand = tableau[i];
			
		}
	}
		
		
		
		
		
		
		
		
		
		

		sc.close();
	}

}

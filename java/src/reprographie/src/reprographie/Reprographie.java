package reprographie;
import java.util.Scanner;
public class Reprographie {

	public static void main(String[] args) {
		//variables
		int nombredecopies;
		double prixunitaire;
		double prixfacture;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer de nombre de copies");
		nombredecopies = sc.nextInt();
		
		if ((nombredecopies > 0 )||( nombredecopies < 11) ){
			prixunitaire = 0.10;
			prixfacture = nombredecopies * prixunitaire;
		}
		else if ((nombredecopies > 10 )||( nombredecopies < 31) ){
			prixunitaire = 0.09;
			prixfacture =  ((nombredecopies- 10 * 0.09) + 10 * 0.10);
		}
		else {
			prixunitaire = 0.08;
		}
		
		
		sc.close();
	}

}

import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// VARIABLES
		int A = 1;
		int B = 2;
		int CcontainerProvisoire;
		Scanner sc = new Scanner (System.in);
				
		// TRAITEMENT
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		
		CcontainerProvisoire = A;
		A = B;
		B = CcontainerProvisoire;
		
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		
		sc.close();
		
	}

}

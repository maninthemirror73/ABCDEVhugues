
public class App {

	public static void main(String[] args) {
		// VARIABLES
		int A = 2;
		int B = 45;
		int C = 32;
		
		//TRAITEMENT
		
		if (A > B && B > C) {
			System.out.println(A);
			System.out.println(B);
			System.out.println(C);
		}
		else if (A < C && C > B) {
			System.out.println(A);
			System.out.println(C);
			System.out.println(B);
		}
		else if (B > A && A > C) {
			System.out.println(B);
			System.out.println(A);
			System.out.println(C);
		}
		else if (B > C && C > A) {
			System.out.println(B);
			System.out.println(C);
			System.out.println(A);
		}
		else if (C > B && B > A) {
			System.out.println(C);
			System.out.println(B);
			System.out.println(A);
		}
		else {
			System.out.println(C);
			System.out.println(A);
			System.out.println(B);
		}

	}

}

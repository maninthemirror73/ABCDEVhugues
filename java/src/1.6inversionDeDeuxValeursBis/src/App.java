
public class App {

	public static void main(String[] args) {
		// VARIABLES
		int A = 1;
		int B = 2;
		int Ccontainer;
		
		System.out.println("A est égal à : " + A);
		
		System.out.println("B est égal à : " + B);
		
		Ccontainer = A;
		A = B;
		B = Ccontainer;
		
		System.out.println("A est égal à : " + A);
		
		System.out.println("B est égal à : " + B);

	}

}

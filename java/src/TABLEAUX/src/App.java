
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] tableau = new String [10];
		
		tableau [3] = "Index 3";
		tableau [1] = "Index 1";
		tableau [3] = "Nouvelle donnée.";
		
		for (int i = 0;i < tableau.length; i++) {
			System.out.println(tableau[i]);
		}
	}

}

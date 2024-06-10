package methodeCours1;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayPerimetre(10, 11); // -> 42
		displayPerimetre(2, 2); // -> 8
		double result = App.Additionner(5, 9);

	}
	public static void displayPerimetre(int length, int width) {
		int perimetre = 2 * (length + width);
				System.out.println(perimetre);
	}
	public static double Additionner(double valeur1, double valeur2) {
		double somme = 0;
		return somme;
	}




}

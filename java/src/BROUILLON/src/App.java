
public class App {

	public static void main(String[] args) {
		//Variable
		int pushUpGoal = 0;
		while (pushUpGoal > 0) {
			System.out.println("Push Up !");
			pushUpGoal-= 1;
		}
		
		do {
			System.out.println("Push Up !");
			pushUpGoal-= 1;
		}while(pushUpGoal > 0);
	}

}

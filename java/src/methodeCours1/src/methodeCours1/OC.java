package methodeCours1;
public class OC{
	public static void main (String[]args) {
		Marque apple = new Marque("Apple");
		Telephone iphone = new Telephone (34000, "iphone", apple);
		
		System.out.println(iphone.nom);
		
	}
	
}

class Telephone{
	int pixels;
	String nom;
	Marque marque;
	
	public Telephone(int pixels, String nom, Marque marque) {
		this.pixels = pixels;
		this.nom = nom;
		this.marque = marque;
	}

}
class Marque{
	String nom;
	
	public Marque (String nom) {
		this.nom = nom;
	}
}
class Book{
	String title;
	String author;
	int numberOfPages;
	String publisher;
	//
	Book(String title, String author, int numberOfPages, String publisher){
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
		this.publisher = publisher;
		
	}
////////////////////////////////////////////////////////////////////////////////
	
}


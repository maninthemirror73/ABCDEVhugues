package projetBouteille;

public class Bouteille {

	//attributes

	public float contenanceEnL;
	private float contenuEnL;
	private boolean ouvert;
	private String typeDeContenu;

	// access/ modifiers

	// constructor

	//default constructor where values are forced
	public Bouteille(){
		contenanceEnL = 1;
		contenuEnL = 1;
		ouvert = false;
		typeDeContenu = "H2O";
	}

	//constructeur classique
	public Bouteille(float _contenanceEnL,float _contenuEnL,boolean _ouvert,String _typeDeContenu) {
		this.contenanceEnL = _contenanceEnL;
		this.contenuEnL = _contenuEnL;
		this.ouvert = _ouvert;
		this.typeDeContenu  = _typeDeContenu;
	}

	//constructeur de clonage

	public Bouteille(Bouteille _bouteilleARecopier) {
		this.contenanceEnL = _bouteilleARecopier.contenanceEnL;
		this.contenuEnL = _bouteilleARecopier.contenuEnL;
		this.ouvert = _bouteilleARecopier.ouvert;
		this.typeDeContenu  = _bouteilleARecopier.typeDeContenu = "Champagne";

	}



	public boolean ouvrir() {
		boolean bouteilleAReussiAOuvrir = false;
		if (ouvert == false) {
			bouteilleAReussiAOuvrir = false;
			ouvert = true;
		}
		else {
			ouvert = true;
		}
		return 	bouteilleAReussiAOuvrir;
	}

	public boolean fermer() {
		boolean bouteilleAReussiAFermer;
		if (ouvert == true) {
			bouteilleAReussiAFermer = true;
			ouvert = false;
		}
		else {
			bouteilleAReussiAFermer = false;
		}
		return bouteilleAReussiAFermer;
	}


	public boolean remplir() {
		boolean possibleDeRemplir;
		if (ouvert == true && contenuEnL < contenanceEnL){
			possibleDeRemplir = true;
			contenuEnL = contenanceEnL;
		}
		else {
			possibleDeRemplir = false;
		}
		return possibleDeRemplir;
	}
	
	public boolean vider() {
		boolean possibleDeVider;
		if (ouvert == true && contenuEnL > 0) {
			possibleDeVider = true;
			contenuEnL = 0;
		}
		else {
			possibleDeVider = false;
		}
		return possibleDeVider;
	}
	
	public boolean estPleine() {
		boolean bouteillePleine;
		if (contenuEnL == contenanceEnL) {
			bouteillePleine = true;
			contenuEnL = 1;
		}
		else {
			bouteillePleine = false;
		}
		return bouteillePleine;
		
	}
	
	public boolean remplir(float quantite) {
		boolean retour;
		if(this.ouvert == true && quantite <= (this.contenanceEnL - this.contenuEnL)) {
			retour = true;
			contenuEnL = contenuEnL + quantite;
		}
		else {
			retour = false;
		}
		
		
		return retour;
	}
	

}






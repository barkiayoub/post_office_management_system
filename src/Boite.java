import java.util.ArrayList;

public class Boite {
	
//	Attributs
	
	private ArrayList <Courrier> courriers;
	private int maxTaille;
	private int taille = 0;
	
//	Methodes
	
	public Boite(int t) {
		courriers = new ArrayList <Courrier>();
		maxTaille = t;
	}
	
	public void ajouterCourrier(Courrier c) {
		if (taille < maxTaille) {
			courriers.add(c);
			taille++;
		} else {
			System.out.println("Vous avez passer la taille maximale du tableau");
		}
	}
	
	public void afficher() {
		for(Courrier elm : courriers) {
			System.out.println(elm.toString() + "\n");
		}
	}
	
	public double affranchir() {
		double montantDeTimbreTotal = 0; 
		for(Courrier elm : courriers) {
			montantDeTimbreTotal += elm.timbrer();
		}
		return montantDeTimbreTotal;
	}
	
	public int courrierInvalide() {
		int nbrDeCourrierInvalide = 0; 
		for(Courrier elm : courriers) {
			if(elm.invalide()) {
				nbrDeCourrierInvalide ++;
			}
		}
		return nbrDeCourrierInvalide;
	}
	
}

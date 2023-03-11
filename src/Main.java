
public class Main {

	public static void main(String[] args) {
		Boite boite = new Boite(6);
		boite.ajouterCourrier(new Lettre(200, true, "Avenue Hassan II, Rabat", "A3"));
		boite.ajouterCourrier(new Lettre(800, false, "", "A4"));
		boite.ajouterCourrier(new Publicite(1500, true, "Avenue Jrifat, 25 bis, Safi"));
		boite.ajouterCourrier(new Publicite(3000, false, ""));
		boite.ajouterCourrier(new Colis(5000, true, "Rue lala Meryam 18, Kenitra", 30));
		boite.ajouterCourrier(new Colis(3000, true, "Avenue Matar, N 19 rue rahma", 70));
		boite.ajouterCourrier(new Colis(5000, true, "Rue lala Meryam 18, Kenitra", 30));
		
		System.out.println("Le montant total d'affranchissement est de " + boite.affranchir());
		
		boite.afficher();
		
		System.out.println("La boite contient " + boite.courrierInvalide() + " courriers invalides");
	}

}

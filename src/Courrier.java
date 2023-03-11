
abstract class Courrier {

//	Attribut
	
	protected double poids;
	protected boolean express;
	protected String adresse;
	
//	Methodes
	
	public Courrier(double p, boolean e, String a) {
		poids = p;
		express = e;
		adresse = a;
	}

	protected abstract double calculeMontant();
	
	public double timbrer() {
		if (express) {  
			return calculeMontant() * 2;
		}
		return calculeMontant();
	}
	
	public boolean invalide() {
		return adresse.length() <= 0;
	}
	
	public String toString() {
		String s = " ";
		if(invalide()) {
			s += "(Courrier invalide)\n";
		}
		s += "\tPoids: " + poids + " grammes\n ";
		if (express) {
			s += "\tExpress : Oui" + "\n\tDestination : " + adresse + "\n\tPrix : " + timbrer() + " Dhs";
		} else {
			s += "\tExpress : Non" + "\n\tDestination : " + adresse + "\n\tPrix : " + timbrer() + " Dhs";
		}
		return s;
	}
}

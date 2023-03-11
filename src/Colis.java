
public class Colis extends Courrier {

//	Attributs
	
	private double volume; 
	
//	Methodes
	
	public Colis(double p, boolean e, String a, double v) {
		super(p, e, a);
		volume = v;
	}

	@Override
	protected double calculeMontant() {
		if (!invalide()) {
			return (0.25 * volume ) + ((poids / 1000) * 0.1);
		}
		return 0;
	}

	@Override
	public boolean invalide() {
		boolean estInvalide = super.invalide();
		if(volume > 50) {
			estInvalide = true;
		}
		return estInvalide;
	}
	
	@Override
	public String toString() {
		String s = "Colis :\n";
		s += super.toString();
		s += "\n\tVolume : " + volume + " Litres";
		return s;
	}
}

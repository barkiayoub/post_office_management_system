
public class Lettre extends Courrier{



	//	Attributs
	private String format; 
	
//	Methodes
	
	public Lettre(double p, boolean e, String a, String f) {
		super(p, e, a);
		format = f;
	}
	
	@Override
	protected double calculeMontant() {
		if(!invalide()) {
			double tarifDeBase = 2.5;
			if (format.equals("A3")) {
				tarifDeBase = 3.5;
			}
			return tarifDeBase + (0.1 * (poids / 1000));
		}
		return 0;
	}
	
	@Override
	public String toString() {
		String s = "Lettre :\n";
		s += super.toString();
		s += "\n\tFormat : " + format;
		return s;
	}
}

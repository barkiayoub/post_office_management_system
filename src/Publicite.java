
public class Publicite extends Courrier {
	
//	Methodes
	
	public Publicite(double p, boolean e, String a) {
		super(p, e, a);
	}

	@Override
	protected double calculeMontant() {
		if(!invalide()) {
			return 5 * poids / 1000;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		String s = "Publicite :\n";
		s += super.toString();
		return s;
	}
}

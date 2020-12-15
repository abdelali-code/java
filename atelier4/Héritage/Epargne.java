package exercice2;

public class Epargne extends Compte {
	
	private float interet = 0.07f;

	// constructor;
	public Epargne(long numero, double solde) {
		super(numero);
		if (solde >= 200) {
			this.ajouter(solde);
		} else
			this.ajouter(200);
	}

	// calculer interet annuel
	public double interetAnnuel() {
		return this.getSolde() * this.interet;
	}

	@Override
	public String toString() {
		return "epargne compte";
	}

}


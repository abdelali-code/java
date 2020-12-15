package exercice2;

public class Courant extends Compte{
	
	public Courant(long numero, double solde) {
		super(numero);
		this.ajouter(solde);
	}
	
	
	public String toString() {
		return "compte courant";
	}
}


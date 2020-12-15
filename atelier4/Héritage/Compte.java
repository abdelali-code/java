package exercice2;


public class Compte {
	private long numero;
	private double solde = 0.0;
	
	// constructor
	protected Compte(long numero) {
		this.numero = numero;
	}
	
	// set solde
	protected void ajouter(double montant)  {
		this.solde += montant;
	}
	// get solde
	protected double getSolde() {
		return this.solde;
	}
	// retirer l'argent from compte
	protected double retirer(double montant) {
		if (montant > this.solde) return 0.0;
		this.solde -= montant;
		return montant;
	}
	// afficher les caractéristiques de compte;
	protected void afficher() {
		System.out.println("numéro de compte: " + this.numero + " solde est: " + this.solde);
	}
}


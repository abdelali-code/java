package exercice3;

public class Secretaire extends Person {

	private int numeroBureau;
	private static int numberOfSecretaire = 0;

	// constructor;
	public Secretaire(String nom, String prenom, String adress, String dateNaissance, String ville, int numeroBureau) {
		super(nom, prenom, adress, dateNaissance, ville);
		this.numeroBureau = numeroBureau;
		Secretaire.numberOfSecretaire += 1;
	}

	// afficher l'information d'un secretaire;
	public void ecrirePersonne() {
		System.out.println(this.getNom() + " " + this.getPrenom() + " " + this.getAdress() + "(" + this.getVille()
				+ " numero the bureau " + this.numeroBureau);
	}
	
	

	public int getNumeroBureau() {
		return numeroBureau;
	}

	public void setNumeroBureau(int numeroBureau) {
		this.numeroBureau = numeroBureau;
	}

	public static int getNumberOfSecretaire() {
		return numberOfSecretaire;
	}

	public static void setNumberOfSecretaire(int numberOfSecretaire) {
		Secretaire.numberOfSecretaire = numberOfSecretaire;
	}

	// string representation of the secretaire object;
	public String toString() {
		return this.getNom() + " " + this.getPrenom() + " " + this.getAdress() + "(" + this.getVille()
				+ " numero the bureau " + this.numeroBureau;
	}

}


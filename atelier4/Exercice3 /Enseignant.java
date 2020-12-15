package exercice3;

public class Enseignant extends Person {
	
	private String specialite;
	private static int numberOfEnseignant = 0;

	// constructor;
	public Enseignant(String nom, String prenom, String adress, String dateNaissance, String ville, String specialite) {
		super(nom, prenom, adress, dateNaissance, ville);
		this.specialite = specialite;
		numberOfEnseignant ++;
	}

	// afficher l'information d'un secretaire;
	public void ecrirePersonne() {
		System.out.println(this.getNom() + " " + this.getPrenom() + " " + this.getAdress() + "(" + this.getVille()
				+ " numero the bureau " + this.specialite);
	}
	

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public static int getNumberOfEnseignant() {
		return numberOfEnseignant;
	}

	public static void setNumberOfEnseignant(int numberOfEnseignant) {
		Enseignant.numberOfEnseignant = numberOfEnseignant;
	}

	public String toString() {
		return this.getNom() + " " + this.getPrenom() + " " + this.getAdress() + "(" + this.getVille()
				+ " numero the bureau " + this.specialite;
	}
}


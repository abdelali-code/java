package exercice3;

public class Etudiant extends Person {
	
	private String diplome;
	private static int numberOfEtudiant = 0;

	// constructor;
	public Etudiant(String nom, String prenom, String adress, String dateNaissance, String ville, String diplome) {
		super(nom, prenom, adress, dateNaissance, ville);
		this.diplome = diplome;
		numberOfEtudiant += 1;
	}

	// afficher l'information d'un secretaire;
	public void ecrirePersonne() {
		System.out.println(this.getNom() + " " + this.getPrenom() + " " + this.getAdress() + "(" + this.getVille()
				+ " numero the bureau " + this.diplome);
	}

	public String toString() {
		return this.getNom() + " " + this.getPrenom() + " " + this.getAdress() + "(" + this.getVille()
				+ " numero the bureau " + this.diplome;
	}

	// get numberOfEtudiant
	public static int getNumberOfEtudiant() {
		return numberOfEtudiant;
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	public static void setNumberOfEtudiant(int numberOfEtudiant) {
		Etudiant.numberOfEtudiant = numberOfEtudiant;
	}
	
	
}


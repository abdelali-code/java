package atelier4;

import java.time.LocalDate;

class Employe {
	private String nom;
	private String prenom;
	private String address;
	private int anneeNaissance;
	private int anneeEncours;

	Employe(String nom, String prenom, String address, int anneeNaissance) {
		LocalDate today = LocalDate.now();
		System.out.println(today.getYear());
		this.nom = nom;
		this.prenom = prenom;
		this.address = address;
		this.anneeNaissance = anneeNaissance;
		this.anneeEncours = today.getYear();
	}

	// calcule age
	public int calculerAge() {
		return this.anneeEncours - this.anneeNaissance;
	}

	// afficher employer info
	public void afficherInfosClient() {
		System.out.println(
				this.nom + ", " + this.prenom + " né le " + this.anneeNaissance + " habitant à " + this.address);
	}
}


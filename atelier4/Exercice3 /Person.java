package exercice3;

abstract public class Person {
	private String nom;
	private String prenom;
	private String adress;
	private String dateNaissance;
	private String ville;
	
	public Person(String nom, String prenom, String adress, String dateNaissance, String ville) {
		this.prenom = prenom;
		this.nom = nom;
		this.adress = adress;
		this.ville = ville;
		this.dateNaissance = dateNaissance;
	}
	
		
	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getAdress() {
		return adress;
	}



	public void setAdress(String adress) {
		this.adress = adress;
	}



	public String getDateNaissance() {
		return dateNaissance;
	}



	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}



	public String getVille() {
		return ville;
	}



	public void setVille(String ville) {
		this.ville = ville;
	}



	public void modifiePersonne(String adress, String ville) {
		this.adress = adress;
		this.ville = ville;
	}
	// this must implemented in the subclass;
	abstract void ecrirePersonne();
	
	public String toString() {
		return this.nom;
	}

}


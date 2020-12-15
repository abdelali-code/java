package exircice2;

public class Abonne {
	private int numIdentite;
	private String nom;
	private int numAbonnement;
	private static int id = 0;
	Ouvrage ouvrage;
	
	public Abonne(int numIdentite, String nom, Ouvrage ouvrage) {
		this.numIdentite = numIdentite;
		this.nom = nom;
		this.numAbonnement = ++id;
		this.ouvrage = ouvrage;
	}
	
	public void afficher() {
		System.out.println(this.nom + " with num d'identité " + this.numIdentite + " take ouvrage " + this.ouvrage.getTitre());
	}
	// get numéro d'identité
	public int getNumIdentite() {
		return numIdentite;
	}
	// set numéro d'identité
	public void setNumIdentite(int numIdentite) {
		this.numIdentite = numIdentite;
	}
	// get nom
	public String getNom() {
		return nom;
	}
	// set nom
	public void setNom(String nom) {
		this.nom = nom;
	}
	// get number d'abonnement
	public int getNumAbonnement() {
		return numAbonnement;
	}
	
	// set number d'abonnement
	public void setNumAbonnement(int numAbonnement) {
		this.numAbonnement = numAbonnement;
	}
	// get oucrage
	public Ouvrage getOuvrage() {
		return ouvrage;
	}
	// set ouvrage
	public void setOuvrage(Ouvrage ouvrage) {
		this.ouvrage = ouvrage;
	}
	
	
	
}

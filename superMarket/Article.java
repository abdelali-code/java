package superMarket;

public class Article {
	private double prix;
	private String nom;
	private boolean solde = false;
	private double soldeVal;
	Article (String nom, double prix,  boolean solde) {
	this.prix = prix;
	this.nom =  nom;
	this.solde = solde;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public boolean isSolde() {
		return solde;
	}
	public void setSolde(boolean solde) {
		this.solde = solde;
	}
	
	public double getSoldeVal() {
		return this.soldeVal;
	}
	
	public void setSoldeVal(double soldeVal) {
		this.soldeVal = soldeVal;
	}
	
	
	
	public void affiche(){
		System.out.println(nom + " " + prix + " " +(this.solde ? "en solde": ""));
	}

}
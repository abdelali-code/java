package exercice2;

public class Article {
	private String nom;
	private double prix;

	public Article(String nom, double prix) {
		this.nom = nom;
		this.prix = prix;
	}

	public Article(Article obj) {
		this.nom = obj.nom;
		this.prix = obj.prix;
	}

	// get nom
	public String getNom() {
		return this.nom;
	}

	// set nom
	public void setNom(String nom) {
		this.nom = nom;
	}

	// get prix
	public double getPrix() {
		return prix;
	}

	// set prix
	public void setPrix(double prix) {
		this.prix = prix;
	}

	public void afficher() {
		System.out.println(prix);
	}
}


package polymorphisme;

public class Employe extends Personne {
	private double salaire ;
	public Employe(String nom, String prenom, String adresse, String ville, String dateNaissance, double salaire) {
		super(nom, prenom, adresse, ville, dateNaissance);
		this.salaire = salaire;
	}
	public void Afficher() {
		System.out.println(this.getNom() + " " + this.salaire);
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
}


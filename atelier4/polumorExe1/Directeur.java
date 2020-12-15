package polymorphisme;

public class Directeur extends Employe{
	private String service;
	public Directeur(String nom, String prenom, String adresse, String ville, String dateNaissance, double salaire, String service) {
		super(nom, prenom, adresse, ville, dateNaissance, salaire);
		this.service = service;
	}
	public void Afficher() {
		System.out.println(this.getNom() + " " + this.service);
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	

}


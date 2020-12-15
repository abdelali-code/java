package exircice2;

public class Livre extends Ouvrage{
	private String autheur;
	
	
	public Livre(String titre, String dateCreation, String autheur) {
		super(titre, dateCreation);
		this.autheur = autheur;
	}
	
	public void afficher() {
		System.out.println(super.getTitre()+ " created " + 
				this.getDateCreation() + " by " + this.autheur + " " + ((this.isExist())?" existt":"does not exist right now"));
	}

	public String getAutheur() {
		return autheur;
	}

	public void setAutheur(String autheur) {
		this.autheur = autheur;
	}
	
	
}

package exircice2;

public class Video extends Ouvrage{
	private String editeur;
	private double duree;
	
	public Video(String titre, String dateCreation, String editeur, double duree) {
		super(titre, dateCreation);
		this.editeur = editeur;
		this.duree = duree;
	}
	public void afficher() {
		System.out.println(super.getTitre()+ " created " + 
				this.getDateCreation() + " editeur " + this.editeur + " " + ((this.isExist())?" existt":"does not exist right now"));
	}


	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public double getDuree() {
		return duree;
	}

	public void setDuree(double duree) {
		this.duree = duree;
	}
	
	
}

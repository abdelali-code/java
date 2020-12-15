package exircice2;

public class Ouvrage {
	private String titre;
	private String dateCreation;
	private boolean isExist;
	
	
	public Ouvrage(String titre, String dateCreation) {
		this.titre = titre;
		this.dateCreation = dateCreation;
		this.isExist = true;
	}
	public void afficher() {
		System.out.println(this.titre + " created " + this.dateCreation + " and " + 
							((this.isExist)?" existt":"does not exist right now") + " in biblio");
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	public boolean isExist() {
		return isExist;
	}

	public void setExist(boolean isExist) {
		this.isExist = isExist;
	}
}

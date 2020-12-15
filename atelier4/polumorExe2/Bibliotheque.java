package exircice2;
import java.util.*;

public class Bibliotheque {
	private Hashtable<String, Ouvrage> ensOuvrage = new Hashtable<>();
	private ArrayList<Abonne> abonnes = new ArrayList<Abonne>(5);
	
	
	public void ajoutOuvrage(Ouvrage ouvrage) {
		if(!ensOuvrage.containsKey(ouvrage.getTitre())) {
			ensOuvrage.put(ouvrage.getTitre(), ouvrage);
		}
		else System.out.println("already exist");
	}
	
	public Ouvrage getOuvrage(String titre) {
		return ensOuvrage.get(titre);
	}
	
	// check if abonne already exist;
	private boolean isExist(int num) {
		for (Abonne ab: abonnes) {
			if (ab.getNumAbonnement() == num) return true;
		}
		return false;
	}
	
	public void ajoutAbonne(Abonne abonne) {
		if (!this.isExist(abonne.getNumAbonnement())) {
			System.out.println("abonner added");
			abonnes.add(abonne);
		}
		else System.out.println("abonne already exist");
	}
	
	public Abonne getAbonne(int numAbon) {
		for (Abonne ab: abonnes) {
			if (ab.getNumAbonnement() == numAbon)
			{
				return ab;
			}
		}
		return null;
	}
}

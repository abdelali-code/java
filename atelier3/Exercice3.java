package atelier3;

public class Exercice3 {
	String nom;
	String address;
	double solde;
	
	void infoSolde() {
		System.out.println(nom + " habite à (" + address + ") - nfos solde  " + solde + "DH");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exercice3 hassan = new Exercice3();
		
		hassan.nom = "El Alami Hassan";
		hassan.address = "safi";
		hassan.solde = 321.23;
		
		hassan.infoSolde();

	}

}

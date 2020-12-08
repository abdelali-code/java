package atelier3;

public class Exercice4 {
	String nom;
	String address;
	double solde;
	
	void infoSolde() {
		System.out.println(nom + " habite à (" + address + ") - infos solde  " + solde + "DH");
	}
	void calculerInterer() {
		float taux = 7;
		double interet = solde * taux / 100;
		System.out.println(nom + " habite à (" + address + ") - infos solde  " + solde + "DH sont intérêt est " + interet);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exercice4 hassan = new Exercice4();
		
		hassan.nom = "El Alami Hassan";
		hassan.address = "safi";
		hassan.solde = 321.23;
		
		hassan.infoSolde();
		hassan.calculerInterer();

	}

}

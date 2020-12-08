package atelier3;

class Account {
	private String nom;
	private String address;
	private double solde;

	// set nom
	public void setNom(String n) {
		nom = n;
	}

	// set address
	public void setAddress(String ad) {
		address = ad;
	}

	// set solde
	public void setSolde(double sld){
		solde = sld;
	}
	
	// get nom
	public String getNom() {
		return nom;
	}

	// get address
	public String getAddress() {
		return address;
	}

	// get solde
	public double getSolde(){
		return solde;
	}

}


class Exercice5  {
	public static void main(String[] args) {
		Account test = new Account();

		test.setNom("hassan el hhh");
		test.setAddress("safi");
		test.setSolde(123.123);
		
		System.out.println(test.getAddress());
		
	}
}
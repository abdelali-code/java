package atelier3;

class Account2 {
	private String nom;
	private String address;
	private double solde;

	// set nom
	public void setNom(String n) {
		if (!n.equals("")) nom = n;
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
	
	
	public double retirer(double mont) {
		if (mont <= solde) {
			setSolde(solde - mont);
			return mont;
		}
		else return 0.0;
	}

}


class Exercice6  {
	public static void main(String[] args) {
		Account2 test = new Account2();

		test.setNom("hassan el hhh");
		test.setAddress("safi");
		test.setSolde(123.123);
		
		System.out.println(test.getAddress());
		System.out.println(test.retirer(100));
		System.out.println(test.getSolde());
		
	}
}
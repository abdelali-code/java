package polymorphisme;

public class Test {
	public static void main(String[] args) {
		//Directeur test = new Directeur("nom", "prenom", "adress", "ville", "date de naissance", 123, "service");
		var test = new Personne[2];
		
		test[0] = new Directeur("nom", "prenom", "adress", "ville", "date de naissance", 123, "service");
		test[1] = new Employe("nom", "prenom", "adress", "ville", "date de naissance", 123);
		
		System.out.println(test[1] instanceof Directeur);
		
		
		for (Personne n: test) {
			n.Afficher();
		}
	}
}


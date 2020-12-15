package exircice2;

public class Test {
	public static void main(String[] args) {
		Ouvrage test1 = new Ouvrage("test", "1989-10-22");
		Livre livre = new Livre("livre", "1949-01-10", "test autheur");
		Video video = new Video("titre test", "1949-01-10", "editeur", 123.23);
		Abonne abonne = new Abonne(123, "abonneNom", livre);
		Abonne abonne2 = new Abonne(123, "abonneNom", livre);
		Bibliotheque bibl = new Bibliotheque();
		
		test1.afficher();
		livre.afficher();
		video.afficher();
		abonne.afficher();
		
		bibl.ajoutOuvrage(livre);
		Ouvrage g = bibl.getOuvrage("livre");
		g.afficher();
		bibl.ajoutOuvrage(livre);
		
		
		//*******************************//
		bibl.ajoutAbonne(abonne);
		Abonne r = bibl.getAbonne(abonne.getNumAbonnement());
		System.out.println(abonne.getNumAbonnement());
		System.out.println(abonne2.getNumAbonnement());
		 if (r == null) {
			 System.out.println("null");
		 }else {
			 System.out.println(r.getNumAbonnement());
		 }
	}
}

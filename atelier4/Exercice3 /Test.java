package exercice3;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Etudiant test = new Etudiant("test nom", "test prenom", "test adress", "1990-01-10", "test ville", "diplome");
		Etudiant test2 = new Etudiant("test nom", "test prenom", "test adress", "1990-01-10", "test ville", "diplome");

		Etudiant test3 = new Etudiant("test nom", "test prenom", "test adress", "1990-01-10", "test ville", "diplome");
		System.out.println(Etudiant.getNumberOfEtudiant());

		ArrayList<Etudiant> ar = new ArrayList<Etudiant>();

		ar.add(test);
		ar.add(test2);
		ar.add(test3);

		for (Etudiant item : ar) {
			item.ecrirePersonne();
		}

	}

}


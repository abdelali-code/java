package src;

import java.util.*;

public class Collection<Item1, Item2> {

	/*
	 * Écrivez un programme Java pour associer une valeur spécifiée à une clé
	 * spécifiée dans une HashMap.
	 */
	public void mapKetToValue(HashMap<Item1, Item2> hm, Item1 key, Item2 value) {
		hm.put(key, value);
	}

	public static void main(String[] args) {

		// Creating a list
		List<String> ls = new ArrayList<String>();

		ls.add("janvier");
		ls.add("févier");
		ls.add("mars");
		ls.add("avril");
		ls.add("mai");
		ls.add("juin");
		ls.add("juillet");
		ls.add("oaût");
		ls.add("septembre");
		ls.add("actobre");
		ls.add("november");
		ls.add("décember");

		// print list
		System.out.println(ls);

		// get valeru the 3 element
		System.out.println(ls.get(2));

		// Avec la liste de l'exercice, afficher la valeur de l'index 5.
		System.out.println(ls.get(5));

		// Parcourir tous les éléments de cette liste
		for (int i = 0; i < 12; i++) {
			System.out.println(ls.get(i));
		}
		/*
		 * Avec la liste de l'exercice, modifier le mois de aout pour lui ajouter
		 * l'accent manquant.
		 */
		ls.set(7, "oaut");
		// Insérer un élément dans la liste à la première position.
		ls.add(0, "first");

		// Supprimer le troisième élément de cette liste.
		ls.remove(2);

		/*
		 * Rechercher un élément dans cette liste
		 */
		// for (int i = 0; i < 12; i++) {
		// if (ls.get(i).equals("juillet")) System.out.println("found");
		// }
		System.out.println(ls.contains("juillet"));

		// Trier cette liste 
		Collections.sort(ls);

		System.out.println("after sort " + ls);

		// Cloner la liste dans une autre liste
		List<String> cp = new ArrayList<String>(ls);
		// cp = ls.subList(0, ls.size());
		// copier cette liste dans une autre
		cp = ls;
		// Tester cette liste est vide ou non
		ls.isEmpty();

		/*
		 * Créer une HashSet de mois, ajouter le nom des douze mois de l'année et
		 * afficher HashSet
		 */
		HashSet<String> hs = new HashSet<String>();

		hs.add("janvier");
		hs.add("févier");
		hs.add("mars");
		hs.add("avril");
		hs.add("mai");
		hs.add("juin");
		hs.add("juillet");
		hs.add("oaût");
		hs.add("septembre");
		hs.add("actobre");
		hs.add("november");
		hs.add("décember");

		// Parcourir tous les éléments de HashSet
		System.out.println("hashset element");
		Iterator<String> i = hs.iterator();
		while (i.hasNext())
			System.out.println(i.next());

		// Obtenir le nombre d'éléments dans un ensemble de HashSet
		System.out.println(hs.size());

		// Vider cette HashSet
		hs.clear();

		// Tester que cette HashSet est vide ou non
		hs.isEmpty();

		Collection<String, Integer> cl = new Collection<String, Integer>();
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		cl.mapKetToValue(hm, "hello", 123);
		System.out.println(hm.get("hello"));

		// Donner la taille de cette HashMap
		System.out.println(hm.size());

		// Copier tous les éléments de cette HashMap dans une autre
		HashMap<String, Integer> hm2 = new HashMap<String, Integer>(hm);

		// Supprimer un élément spécifié de cette HashMap
		hm2.remove("hello");
	}

}


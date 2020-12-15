package superMarket;

import java.util.ArrayList;

public class Chariot {
	private ArrayList<Achat> chario = new ArrayList<Achat>();
	// end inner class
	
	public void remplir(Article art, int qnt) {
		Achat ach = new Achat(art, qnt);
		chario.add(ach);
	}
	
	// return list to the caise;
	public ArrayList<Achat> getChario() {
		ArrayList<Achat> ch = new ArrayList<Achat>(chario);
		return ch;
	}
}

package superMarket;


public class Caisse {
	private static int numero = 0;
	private double m_t = 0.0;
	private int id;
	
	//public Caisse(double m_t) {
		//this.m_t = m_t;
	//}
	public Caisse() {
		this.id = ++numero;
	}

	
	// scanner
	public void scanner(Chariot chr) {
		int qn;
		double prix;
		double sld = 0.0;
		double finalVal = 0;
		System.out.println("***********************************************************");
		System.out.println("la caisee number: " + this.id);
		 for (Achat ch: chr.getChario()) {
			 qn = ch.getQnt_achete();
			 prix = ch.getArticle_achete().getPrix();
			 sld = ch.getArticle_achete().getSoldeVal();
			 // if there is any solde decrement it;
			 if (ch.getArticle_achete().isSolde()) {
				 finalVal = (qn * prix) - ((prix * sld) * qn); 
			 }
			 // otherwise
			 else {
				 finalVal = (qn * prix);
			 }
			System.out.println(ch.getArticle_achete().getNom() + ": " + prix + " x " + qn + " = " + finalVal );
			this.m_t += finalVal;
		 }
		 System.out.println("***********************************************************");
	}
	// get total
	public double montantTotal() {
		System.out.println("La caisse " + this.id +" a encaissé " + (Math.round(this.m_t * 100.0) / 100.0) + " MAD");
		return m_t;
	}
	
}

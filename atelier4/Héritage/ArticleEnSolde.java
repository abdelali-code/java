package exercice2;

public class ArticleEnSolde extends Article {
	
	private int discount;
	
	// if article added with discount
	ArticleEnSolde(String nom, double prix, int dis) {
		super(nom, prix);
		this.discount = dis;
	}
	// if article added with no discount
	ArticleEnSolde(String nom, double prix) {
		super(nom, prix);
		this.discount = 0;
	}
	// clone an existing ArticleEnSolde
	public ArticleEnSolde(ArticleEnSolde obj) {
		super(obj);
		this.discount = obj.discount;
	}
	// clone from an exiting Article
	public ArticleEnSolde(Article obj, int discount) {
		super(obj);
		this.discount = discount;
	}
	public void afficher () {
		System.out.println(this.getPrix());
	}
	
	// get discount
	public int getDiscount() {
		return discount;
	}
	
	// set discount
	public void setDiscount(int dis) {
		this.discount = dis;
	}
}


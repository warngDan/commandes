package commandes.entities;




public class CommandesArticles {
	
	private int idCommande;
	private int idArticle;
	private int quantite;
	private double prix;
	
	
	
	
	public CommandesArticles() {
	}

	public CommandesArticles(int idCommande, int idArticle, int quantite, double prix) {
		this.idCommande = idCommande;
		this.idArticle = idArticle;
		this.quantite = quantite;
		this.prix = prix;
	}
	
	public int getIdCommande() {
		return idCommande;
	}
	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}
	public int getIdArticle() {
		return idArticle;
	}
	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	

}

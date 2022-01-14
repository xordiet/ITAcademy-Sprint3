package s30203_InjeccioDepend;

public class Article {
	private String article;
	private double preu;
	
	public Article(String article, double preu) {
		this.article = article;
		this.preu = preu;
	}

	public String getArticle() {
		return article;
	}

	public double getPreu() {
		return preu;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}

	@Override
	public String toString() {
		return article + ", preu=" + preu + "€";
	}
	

}

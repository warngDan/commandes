package commandes.services;

import java.util.List;

import javax.ejb.EJB;

import commandes.dao.ArticleDao;
import commandes.entities.Article;



public class ArticlesServices {
	
	@EJB private ArticleDao dao;
	
	public Article getArticle(long id) {
		return dao.getArticleById(id);
	}

	
	public List<Article> getArticles() {
		return dao.getAllArticles();
	}
	
	public long  setArticle(Article article) {
		dao.saveArticle(article);
		return article.getId();
	}

}

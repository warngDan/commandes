package commandes.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import commandes.entities.Article;



public class ArticleDao {
	
	@PersistenceContext(name="articles") private EntityManager em;
	
	public Article getArticleById(long id) {
		return em.find(Article.class, id);
	}
	
//	public List<Article> getAllArticles() {
//		
////		return em.;
//	}
	
	public void saveArticle(Article article) {
		 em.persist(article);
	}
	
	public void updateArticle(Article article ) {
		em.merge(article);
	}
	
	public void deleteArticle(Article article) {
		em.remove(article);
	}


	
}

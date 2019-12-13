package commandes.entities;

import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.Table;



@Entity
@Table(name = "commandes")
@Access(AccessType.FIELD)
public class Commande {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String numero;
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "commandes_articles", 
		joinColumns = @JoinColumn(name="id_cde"), 
		inverseJoinColumns = @JoinColumn(name="id_article"))
	private List<Article> articles;
	
	
	public Commande() {}


	public Commande(int id, String numero) {
		this.numero = numero;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}
		
	
	
}


	

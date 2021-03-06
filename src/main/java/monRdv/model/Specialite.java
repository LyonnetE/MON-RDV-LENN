package monRdv.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "specialite")
public class Specialite {
	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "nom")
	private String nom;

	@OneToMany(mappedBy = "specialite")
	private List<PraticienSpecialite> praticiens = new ArrayList<>();

	public Specialite(String nom) {
		super();
		this.nom = nom;
	}

	public Specialite() {
		super();
	}

	public List<PraticienSpecialite> getPraticiens() {
		return praticiens;
	}

	public void setPraticiens(List<PraticienSpecialite> praticiens) {
		this.praticiens = praticiens;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}

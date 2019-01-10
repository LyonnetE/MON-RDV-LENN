package monRdv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Praticien_Adresse")
public class PraticienAdresse {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne
	@JoinColumn(name = "id_praticien")
	private Praticien praticien;
	@ManyToOne
	@JoinColumn(name = "id_adresse")
	private Adresse adresse;

	public PraticienAdresse() {
		super();
	}

	public PraticienAdresse(Praticien praticien, Adresse adresse) {
		super();
		this.praticien = praticien;
		this.adresse = adresse;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Praticien getPraticien() {
		return praticien;
	}

	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

}

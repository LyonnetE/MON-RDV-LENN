package monRdv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Praticien_Specialite")
public class PraticienSpecialite {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne
	@JoinColumn(name = "id_praticien")
	private Praticien praticien;
	@ManyToOne
	@JoinColumn(name = "id_specialite")
	private Specialite specialite;

	public PraticienSpecialite() {
		super();
	}

	public PraticienSpecialite(Praticien praticien, Specialite specialite) {
		super();
		this.praticien = praticien;
		this.specialite = specialite;
	}

	public Praticien getPraticien() {
		return praticien;
	}

	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}

	public Specialite getSpecialite() {
		return specialite;
	}

	public void setSpecialite(Specialite specialite) {
		this.specialite = specialite;
	}

}

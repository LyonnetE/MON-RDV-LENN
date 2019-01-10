package monRdv.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Creneaux {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "date")
	private Date date;

	@Column(name = "tempsCreneau")
	private int tempsCreneau;

	@ManyToOne
	@JoinColumn(name = "rdv_creneaux")
	private Rdv rdv;

	@ManyToOne
	@JoinColumn(name = "Praticien")
	private Praticien praticien;

	@OneToOne
	@JoinColumn(name = "adresse")
	private Adresse adresse;

	public Creneaux() {
		super();
	}

	public Creneaux(Date date, int tempsCreneau) {

		super();
		this.date = date;
		this.tempsCreneau = tempsCreneau;

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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getTempsCreneau() {
		return tempsCreneau;
	}

	public void setTempsCreneau(int tempsCreneau) {
		this.tempsCreneau = tempsCreneau;
	}

	public Rdv getRdv() {
		return rdv;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setRdv(Rdv rdv) {

	}

}

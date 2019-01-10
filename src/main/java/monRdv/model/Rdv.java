package monRdv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Rdv")
public class Rdv {
	
	@Id
	@GeneratedValue
	private Long id;
//	@OneToOne
	private String motif;
//	@OneToMany
	private String creneaux;
	@ManyToOne
	@JoinColumn(name="patient_id")
	private Utilisateur patient;
//	@ManyToOne
	private String praticien;
	
	public Rdv() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public String getCreneaux() {
		return creneaux;
	}

	public void setCreneaux(String creneaux) {
		this.creneaux = creneaux;
	}

	public Utilisateur getPatient() {
		return patient;
	}

	public void setPatient(Utilisateur patient) {
		this.patient = patient;
	}

	public String getPraticien() {
		return praticien;
	}

	public void setPraticien(String praticien) {
		this.praticien = praticien;
	}	

}

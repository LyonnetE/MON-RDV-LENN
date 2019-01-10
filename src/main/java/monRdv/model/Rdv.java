package monRdv.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Rdv")
public class Rdv {

	@Id
	@GeneratedValue
	private Long id;

	@OneToOne(mappedBy = "rdv")
	private Motif motif;

	@OneToMany(mappedBy = "rdv")
	private List<Creneaux> creneaux = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name = "patient_id")
	private Utilisateur patient;

	@ManyToOne
	@JoinColumn(name = "praticien_id")
	private Praticien praticien;

	public Rdv() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Motif getMotif() {
		return motif;
	}

	public void setMotif(Motif motif) {
		this.motif = motif;
	}

	public List<Creneaux> getCreneaux() {
		return creneaux;
	}

	public void setCreneaux(List<Creneaux> creneaux) {
		this.creneaux = creneaux;
	}

	public Utilisateur getPatient() {
		return patient;
	}

	public void setPatient(Utilisateur patient) {
		this.patient = patient;
	}

	public Praticien getPraticien() {
		return praticien;
	}

	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}

	public void addCreneaux(Creneaux creneaux) {
		this.creneaux.add(creneaux);
	}

	public void removeCreneaux(Creneaux creneaux) {
		this.creneaux.remove(creneaux);
	}

}

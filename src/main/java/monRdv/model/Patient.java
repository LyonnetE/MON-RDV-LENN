package monRdv.model;


import java.util.Date;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//import formation.model.Adresse;

@Entity
@Table(name="patient")
public class Patient {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="nom")
	private String nom;
	@Column(name="prenom")
	private String prenom;
	@Column(name="telephone")
	private String telephone;
	@Temporal(TemporalType.DATE)
	private Date dtNaissance;
	private boolean principal;
	@OneToOne
	@JoinColumn(name="adresse_id")
	private Adresse adresse;
	
	public Patient() {
		super();
	}

	public Patient(String nom, String prenom, String telephone, Date dtNaissance, boolean principal) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.dtNaissance = dtNaissance;
		this.principal = principal;

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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Date getDtNaissance() {
		return dtNaissance;
	}

	public void setDtNaissance(Date dtNaissance) {
		this.dtNaissance = dtNaissance;
	}

	public boolean isPrincipal() {
		return principal;
	}

	public void setPrincipal(boolean principal) {
		this.principal = principal;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
}
	

	
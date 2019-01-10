package monRdv.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="Utilisateur")
public class Utilisateur {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="email")
	private String email;
	@Column(name="motDePasse")
	private String motDePasse;
	@Column(name="typeUtilisateur")
	@Enumerated(EnumType.STRING)
	private TypeUtilisateur typeUtilisateur;
	
//	@OneToOne
//	private Patient patient;
//	
//	@OneToOne
//	private Praticien praticien;
	@OneToMany (mappedBy="patient")
	private List<Rdv> rdv;
	
	public Utilisateur() {
		super();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public TypeUtilisateur getTypeUtilisateur() {
		return typeUtilisateur;
	}

	public void setTypeUtilisateur(TypeUtilisateur typeUtilisateur) {
		this.typeUtilisateur = typeUtilisateur;
	}


//	public Patient getPatient() {
//		return patient;
//	}
//
//	public void setPatient(Patient patient) {
//		this.patient = patient;
//	}
//
//	public Praticien getPraticien() {
//		return praticien;
//	}
//
//	public void setPraticien(Praticien praticien) {
//		this.praticien = praticien;
//	}
	
	public List<Rdv> getRdv() {
		return rdv;
	}

	public void setRdv(List<Rdv> rdv) {
		this.rdv = rdv;
	}
	
	public void addRdv(Rdv rdv) {
		this.rdv.add(rdv);
	}
	
	public void removeRdv(Rdv rdv) {
		this.rdv.remove(rdv);
	}
	

}

package monRdv.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "adresse")
public class Adresse {

	@Id
	@GeneratedValue
	private Long id;
	@Column(name = "numero")
	private Integer numero;
	@Column(name = "rue")
	private String rue;
	@Column(name = "codePostal")
	private String codePostal;
	@Column(name = "ville")
	private String ville;
	@Column(name = "pays")
	private String pays;

	@OneToOne(mappedBy = "adresse")
	private Patient patient;

	@OneToMany(mappedBy = "adresse")
	private List<PraticienAdresse> praticiens = new ArrayList<>();

	@OneToOne(mappedBy="adresse")
	private Creneaux creneau;

	public Adresse() {
		super();
	}

	public Adresse(Integer numero, String rue, String codePostal, String ville, String pays) {
		super();
		this.numero = numero;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;

	}

	public Creneaux getCreneau() {
		return creneau;
	}

	public void setCreneau(Creneaux creneau) {
		this.creneau = creneau;
	}

	public List<PraticienAdresse> getPraticiens() {
		return praticiens;
	}

	public void setPraticiens(List<PraticienAdresse> praticiens) {
		this.praticiens = praticiens;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
}

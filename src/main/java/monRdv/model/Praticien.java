package monRdv.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Praticien {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "prenom")
	private String prenom;
	@Column(name = "telephone")
	private String tel;
	@Column(name = "numOrdre")
	private Long numeroOrdre;
	@Column(name = "dateNaissance")
	@Temporal(TemporalType.DATE)
	private Date dtNaissance;
	@Column(name = "horaireOuverture")
	private String horaireOuverture;
	@Column(name = "cb")
	private boolean cb;
	@Column(name = "cheque")
	private boolean cheque;
	@Column(name = "espece")
	private boolean espece;

	@OneToMany(mappedBy = "praticien")
	private List<PraticienSpecialite> specialites = new ArrayList<>();

	@OneToMany(mappedBy = "praticien")
	private List<Creneaux> creneaux;
	@OneToMany(mappedBy = "praticien")
	private List<Rdv> rdvs = new ArrayList<>();

	@OneToMany(mappedBy = "praticien")
	private List<PraticienMotif> motifs = new ArrayList<>();

	@OneToMany(mappedBy = "praticien")
	private List<PraticienAdresse> adresses = new ArrayList<>();

	public Praticien() {
		super();
	}

	public List<PraticienMotif> getMotifs() {
		return motifs;
	}

	public void setMotifs(List<PraticienMotif> motifs) {
		this.motifs = motifs;
	}

	public List<PraticienAdresse> getAdresses() {
		return adresses;
	}

	public void setAdresses(List<PraticienAdresse> adresses) {
		this.adresses = adresses;
	}

	public Praticien(String nom, String prenom, List<PraticienSpecialite> specialites) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.specialites = specialites;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Long getNumeroOrdre() {
		return numeroOrdre;
	}

	public void setNumeroOrdre(Long numeroOrdre) {
		this.numeroOrdre = numeroOrdre;
	}

	public Date getDtNaissance() {
		return dtNaissance;
	}

	public void setDtNaissance(Date dtNaissance) {
		this.dtNaissance = dtNaissance;
	}

	public String getHoraireOuverture() {
		return horaireOuverture;
	}

	public void setHoraireOuverture(String horaireOuverture) {
		this.horaireOuverture = horaireOuverture;
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

	public boolean isCb() {
		return cb;
	}

	public void setCb(boolean cb) {
		this.cb = cb;
	}

	public boolean isCheque() {
		return cheque;
	}

	public void setCheque(boolean cheque) {
		this.cheque = cheque;
	}

	public boolean isEspece() {
		return espece;
	}

	public void setEspece(boolean espece) {
		this.espece = espece;
	}

	public List<PraticienSpecialite> getSpecialites() {
		return specialites;
	}

	public void setSpecialites(List<PraticienSpecialite> specialites) {
		this.specialites = specialites;
	}
	
	public void addRdv(Rdv rdv) {
		this.rdvs.add(rdv);
	}
	
	public void removeRdv(Rdv rdv) {
		this.rdvs.remove(rdv);
	}

}

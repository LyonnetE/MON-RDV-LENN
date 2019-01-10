package monRdv.model;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Creneaux {
	
private Date date;
private int tempsCreneau;
private Adresse adresse; 

@Id
@GeneratedValue
private Long id;
@ManyToOne
@JoinColumn(name="rdv_creneaux")
private Rdv rdv; 

@ManyToOne
@JoinColumn(name="Praticien")
private Praticien praticien;



public Creneaux() {
	super();
}

public Creneaux(Date date, int tempsCreneau, Adresse adresse) {
	super();
	this.date = date;
	this.tempsCreneau = tempsCreneau;

//	this.adresse = adresse;

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

public Adresse getAdresse() {
	return adresse;
}

public void setAdresse(Adresse adresse) {
	this.adresse = adresse;
}



}

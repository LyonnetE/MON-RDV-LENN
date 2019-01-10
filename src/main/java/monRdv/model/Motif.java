package monRdv.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="motif")
public class Motif {

@Id
@GeneratedValue
private Long id; 

@Column(name = "Motif")
private String motif;
@Column(name = "Prix")
private int prix;
@Column(name = "Duree")
private int duree;


public Motif() {
	super();
}

public Motif(String motif, int prix, int duree) {
	super();
	this.motif = motif;
	this.prix = prix;
	this.duree = duree;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getMotif() {
	return motif;
}

public void setMotif(String motif) {
	this.motif = motif;
}

public int getPrix() {
	return prix;
}

public void setPrix(int prix) {
	this.prix = prix;
}

public int getDuree() {
	return duree;
}

public void setDuree(int duree) {
	this.duree = duree;
}



}

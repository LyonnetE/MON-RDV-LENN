package monRdv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "praticien_motif")
public class PraticienMotif {

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	@JoinColumn(name = "id_praticien")
	private Praticien praticien;

	@ManyToOne
	@JoinColumn(name = "id_motif")
	private Motif motif;

	public PraticienMotif() {
		super();
	}

	public PraticienMotif(Praticien praticien, Motif motif) {
		super();
		this.praticien = praticien;
		this.motif = motif;
	}

	public Praticien getPraticien() {
		return praticien;
	}

	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}

	public Motif getMotif() {
		return motif;
	}

	public void setMotif(Motif motif) {
		this.motif = motif;
	}

}

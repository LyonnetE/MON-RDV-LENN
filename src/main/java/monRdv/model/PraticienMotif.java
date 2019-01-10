//package monRdv.model;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinColumns;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//
//@Entity
//@Table(name = "praticien_motif")
//public class PraticienMotif {
//	
//	@Id
//	@GeneratedValue
//	private Long id;
//
//	@ManyToOne
//	@JoinColumns({ @JoinColumn(name = "praticien_motif", referencedColumnName = "motif"),
//			@JoinColumn(name = "praticien_id", referencedColumnName = "id") })
//	private Praticien praticien;
//
//	@ManyToOne
//	@JoinColumn(name = "Motif_id")
//	private Motif motif;
//
//	public PraticienMotif() {
//		super();
//	}
//
//	public PraticienMotif(Praticien praticien, Motif motif) {
//		super();
//		this.praticien = praticien;
//		this.motif = motif;
//	}
//
//	
//
//}

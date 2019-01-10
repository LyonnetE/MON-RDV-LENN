package monRdv.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import monRdv.model.Creneaux;
import monRdv.model.Motif;
import monRdv.model.Praticien;
import monRdv.model.Rdv;
import monRdv.model.Specialite;
import monRdv.model.TypeUtilisateur;
import monRdv.model.Utilisateur;


public class TestMonRdvLisa {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("monRdv");

		EntityManager em = null;
		EntityTransaction tx = null;
		
		Utilisateur utilisateur=null;
		Utilisateur utilisateur2=null;
		Utilisateur utilisateur3=null;
		
		Rdv rdv=null;
		Rdv rdv2=null;
		
		Praticien praticien =  null;
		Praticien praticien2 =  null;
		
		Motif motif =  null;
		Motif motif2 =  null;
		
		Creneaux creneau = null;

		try {
			em = emf.createEntityManager();
			tx = em.getTransaction();

			tx.begin();
			
			utilisateur=new Utilisateur();
			utilisateur2=new Utilisateur();
			utilisateur3=new Utilisateur();
			
			rdv=new Rdv();
			rdv2=new Rdv();
			
			praticien =new Praticien();
			praticien2 =new Praticien();
			
			
			utilisateur.setTypeUtilisateur(TypeUtilisateur.Administrateur);
			utilisateur.setEmail("blabla@admin.fr");
			utilisateur.setMotDePasse("admin");
			
			utilisateur2.setTypeUtilisateur(TypeUtilisateur.Patient);
			utilisateur2.setEmail("blabla@patient.fr");
			utilisateur2.setMotDePasse("patient");
			
			utilisateur3.setTypeUtilisateur(TypeUtilisateur.Praticien);
			utilisateur3.setEmail("blabla@praticien.fr");
			utilisateur3.setMotDePasse("pratient");
			
			em.persist(utilisateur);
			em.persist(utilisateur2);
			em.persist(utilisateur3);
			
			praticien.setNom("Ni");
			praticien.setPrenom("bar");
			
			praticien2.setNom("Ni");
			praticien2.setPrenom("bar");
			
			em.persist(praticien);
			em.persist(praticien2);
			
			motif= new Motif();
			motif2= new Motif();
			
			motif.setMotif("fond d'oeil");
			motif2.setMotif("coloscopie");
			
			em.persist(motif);
			em.persist(motif2);
			
			creneau =new Creneaux();
			
			creneau.setTempsCreneau(1);
			
			em.persist(creneau);
			
			rdv.setMotif(motif);
			rdv.addCreneaux(creneau);
			rdv.setPraticien(praticien);
			rdv.setPatient(utilisateur2);
			
			rdv2.setMotif(motif2);
			rdv2.addCreneaux(creneau);
			rdv2.setPraticien(praticien2);
			rdv2.setPatient(utilisateur2);
			
			em.persist(rdv);
			em.persist(rdv2);


			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}
		emf.close();

	}

}

package monRdv.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import monRdv.model.Rdv;
import monRdv.model.TypeUtilisateur;
import monRdv.model.Utilisateur;

public class TestMonRdv {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("monRdv");

		EntityManager em = null;
		EntityTransaction tx = null;
		
		Utilisateur utilisateur=null;
		Utilisateur utilisateur2=null;
		Utilisateur utilisateur3=null;
		
		Rdv rdv=null;
		Rdv rdv2=null;

		try {
			em = emf.createEntityManager();
			tx = em.getTransaction();

			tx.begin();
			utilisateur=new Utilisateur();
			utilisateur2=new Utilisateur();
			utilisateur3=new Utilisateur();
			
			rdv=new Rdv();
			rdv2=new Rdv();
			
			
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
			
			rdv.setMotif("Fond d'oeil");
//			rdv.setCreneaux("2h");
			rdv.setPraticien("Quoi de neuf DR.");
			rdv.setPatient(utilisateur2);
			
			rdv2.setMotif("Mamographie");
//			rdv2.setCreneaux("30min");
			rdv2.setPraticien("DR.Nene");
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

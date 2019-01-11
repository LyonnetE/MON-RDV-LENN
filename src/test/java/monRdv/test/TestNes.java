package monRdv.test;

import java.text.SimpleDateFormat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import monRdv.model.Creneaux;
import monRdv.model.Motif;
import monRdv.model.Praticien;
import monRdv.model.PraticienSpecialite;
import monRdv.model.Specialite;


public class TestNes {
	
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("monRdv");

		EntityManager em = null;
		EntityTransaction tx = null;


		try {
			em = emf.createEntityManager();
			tx = em.getTransaction();

			tx.begin();
			Motif m1 = new Motif("Grossesse", 72, 60);
			em.persist(m1);
			
			Motif m2=new Motif ("Hemoroïdes", 80, 60);
			em.persist(m2);
			
			Specialite s1=new Specialite("Gynécologie");
			Specialite s2=new Specialite("Cancérologie");
			Specialite s3=new Specialite("Urologie");
			Specialite s4=new Specialite("Pediatrie");
			
			em.persist(s1);
			em.persist(s2);
			em.persist(s3);
			em.persist(s4);
			
			Praticien p1=new Praticien();
			em.persist(p1);
		
			PraticienSpecialite ps1=new PraticienSpecialite(p1,s1);
			em.persist(ps1);
			
			Creneaux cr1=new Creneaux(sdf.parse("10-01-2019"), 15);
			em.persist(cr1);
			
		
			tx.commit(); // em.flush()
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}}
}
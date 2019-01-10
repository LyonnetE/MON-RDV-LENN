package monRdv.test;

import java.text.SimpleDateFormat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import monRdv.model.Adresse;
import monRdv.model.Patient;


public class TestmonRdv {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("monRdv");

		EntityManager em = null;
		EntityTransaction tx = null;

		Patient nelly = null;
		Adresse adresse = null;
		Adresse adresse2 = null;
		Patient lisa = null;

		try {
			em = emf.createEntityManager();
			tx = em.getTransaction();

			tx.begin();
			adresse = new Adresse(3,"sebille","95800","cergy","france");
			em.persist(adresse);
			adresse2 = new Adresse(8,"prout","95800","bulle","france");
			em.persist(adresse2);
			nelly = new Patient("prager","nelly","050808",sdf.parse("28-06-1994"),true);
			em.persist(nelly);
			lisa = new Patient("baron","lisa","010101",sdf.parse("10-12-1994"),true);
			em.persist(lisa);

			nelly.setAdresse(adresse);
			lisa.setAdresse(adresse2);

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
		}

		

	}

}

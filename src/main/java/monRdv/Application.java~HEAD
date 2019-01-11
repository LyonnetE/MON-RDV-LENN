package monRdv;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import monRdv.dao.IDaoPraticien;
import monRdv.dao.jpa.DaoPraticienjpa;

import monRdv.dao.IDaoRdv;
import monRdv.dao.IDaoUtilisateur;
import monRdv.dao.jpa.daoRdvJpa;
import monRdv.dao.jpa.daoUtilisateurJpa;


public class Application {

	private static Application instance = null;

	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("monRdv");

	private final IDaoPraticien daoPraticien = new DaoPraticienjpa();

	
	private final IDaoUtilisateur daoUtilisateur = new daoUtilisateurJpa();
	private final IDaoRdv daoRdv = new daoRdvJpa();


	private Application() {
	}

	public static Application getInstance() {
		if (instance == null) {
			instance = new Application();
		}

		return instance;
	}

	public EntityManagerFactory getEmf() {
		return emf;
	}

	public IDaoPraticien getDaoPraticien() {
		return daoPraticien;
	}

	public IDaoUtilisateur getDaoUtilisateur() {
		return daoUtilisateur;
	}

	public IDaoRdv getDaoRdv() {
		return daoRdv;
	}

}

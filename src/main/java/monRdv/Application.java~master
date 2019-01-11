package monRdv;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

<<<<<<< Updated upstream:src/main/java/monRdv/Application.java
import monRdv.dao.IDaoPraticien;
import monRdv.dao.jpa.DaoPraticienjpa;
=======
import monRdv.dao.IDaoRdv;
import monRdv.dao.IDaoUtilisateur;
import monRdv.dao.jpa.daoRdvJpa;
import monRdv.dao.jpa.daoUtilisateurJpa;
>>>>>>> Stashed changes:src/main/java/formation/Application.java

public class Application {

	private static Application instance = null;

	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("monRdv");
<<<<<<< Updated upstream:src/main/java/monRdv/Application.java
	private final IDaoPraticien daoPraticien = new DaoPraticienjpa();
=======
	
	private final IDaoUtilisateur daoUtilisateur = new daoUtilisateurJpa();
	private final IDaoRdv daoRdv = new daoRdvJpa();
>>>>>>> Stashed changes:src/main/java/formation/Application.java

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

<<<<<<< Updated upstream:src/main/java/monRdv/Application.java
	public IDaoPraticien getDaoPraticien() {
		return daoPraticien;
	}

=======
	public IDaoUtilisateur getDaoUtilisateur() {
		return daoUtilisateur;
	}

	public IDaoRdv getDaoRdv() {
		return daoRdv;
	}
	
	

>>>>>>> Stashed changes:src/main/java/formation/Application.java
}

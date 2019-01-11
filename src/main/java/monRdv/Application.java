package monRdv;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import monRdv.dao.IDaoPraticien;
import monRdv.dao.jpa.DaoPraticienjpa;

public class Application {

	private static Application instance = null;

	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("monRdv");
	private final IDaoPraticien daoPraticien = new DaoPraticienjpa();

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

}

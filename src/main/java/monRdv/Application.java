package monRdv;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

<<<<<<< HEAD
import monRdv.dao.IDaoPraticien;
import monRdv.dao.jpa.DaoPraticienjpa;
=======
import monRdv.dao.IDaoCreneaux;
import monRdv.dao.IDaoMotif;
import monRdv.dao.IDaoPraticien;
import monRdv.dao.IDaoPraticienAdresse;
import monRdv.dao.IDaoPraticienMotif;
import monRdv.dao.IDaoRdv;
import monRdv.dao.jpa.DaoPraticienJpa;
import monRdv.dao.jpa.DaoCreneauxJpa;
import monRdv.dao.jpa.DaoMotifJpa;
import monRdv.dao.jpa.DaoPraticienAdresseJpa;
import monRdv.dao.jpa.DaoPraticienMotifJpa;
import monRdv.dao.jpa.daoRdvJpa;
>>>>>>> master

public class Application {

	private static Application instance = null;

	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("monRdv");
<<<<<<< HEAD
	private final IDaoPraticien daoPraticien = new DaoPraticienjpa();
=======
	private final IdaoAdresse daoAdresse=new DaoAdresseJpa();
	private final IdaoPatient daoPatient=new DaoPatientJpa();
	private final IdaoPraticienSpecialite daoPraticienSpecialite=new DaoPraticienSpecialiteJpa();
	private final IdaoSpecialite daoSpecialite= new Specialite();
	private final IDaoPraticien daoPraticien = new DaoPraticienJpa();
	private final IDaoCreneaux daoCreneaux = new DaoCreneauxJpa();
	private final IDaoMotif daoMotif = new DaoMotifJpa();
	private final IDaoPraticienAdresse daoPraticienAdresse = new DaoPraticienAdresseJpa();
	private final IDaoPraticienMotif daoPraticienMotif = new DaoPraticienMotifJpa();
	private final IDaoRdv daoRdv=new daoRdvJpa(); 
	private final IDaoUtilisateur=new daoUtilisateurJpa();
	
>>>>>>> master

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

<<<<<<< HEAD
=======
	public IDaoCreneaux getDaoCreneaux() {
		return daoCreneaux;
	}

	public IDaoMotif getDaoMotif() {
		return daoMotif;
	}

	public IDaoPraticienAdresse getDaoPraticienAdresse() {
		return daoPraticienAdresse;
	}

	public IDaoPraticienMotif getDaoPraticienMotif() {
		return daoPraticienMotif;
	}

	public IDaoRdv getDaoRdv() {
		return daoRdv;
	}

	public IdaoAdresse getDaoAdresse() {
		return daoAdresse;
	}

	public IdaoPatient getDaoPatient() {
		return daoPatient;
	}

	public IdaoPraticienSpecialite getDaoPraticienSpecialite() {
		return daoPraticienSpecialite;
	}

	public IdaoSpecialite getDaoSpecialite() {
		return daoSpecialite;
	}
	

>>>>>>> master
}

package monRdv;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import monRdv.dao.IDaoPraticien;
import monRdv.dao.jpa.DaoPraticienJpa;
import monRdv.dao.jpa.DaoSpecialiteJpa;
import monRdv.dao.IDaoAdresse;
import monRdv.dao.IDaoCreneaux;
import monRdv.dao.IDaoMotif;
import monRdv.dao.IDaoPatient;
import monRdv.dao.IDaoPraticienAdresse;
import monRdv.dao.IDaoPraticienMotif;
import monRdv.dao.IDaoPraticienSpecialite;
import monRdv.dao.IDaoRdv;
import monRdv.dao.IDaoSpecialite;
import monRdv.dao.IDaoUtilisateur;
import monRdv.dao.jpa.DaoAdresseJpa;
import monRdv.dao.jpa.DaoCreneauxJpa;
import monRdv.dao.jpa.DaoMotifJpa;
import monRdv.dao.jpa.DaoPatientJpa;
import monRdv.dao.jpa.DaoPraticienAdresseJpa;
import monRdv.dao.jpa.DaoPraticienMotifJpa;
import monRdv.dao.jpa.DaoPraticienSpecialiteJpa;
import monRdv.dao.jpa.daoRdvJpa;
import monRdv.dao.jpa.daoUtilisateurJpa;



public class Application {

	private static Application instance = null;

	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("monRdv");


	private final IDaoPraticien daoPraticien = (IDaoPraticien) new DaoPraticienJpa();
	private final IDaoAdresse daoAdresse=new DaoAdresseJpa();
	private final IDaoPatient daoPatient=new DaoPatientJpa();
	private final IDaoPraticienSpecialite daoPraticienSpecialite=(IDaoPraticienSpecialite) new DaoPraticienSpecialiteJpa();
	private final IDaoSpecialite daoSpecialite= (IDaoSpecialite) new DaoSpecialiteJpa();
	private final IDaoCreneaux daoCreneaux = new DaoCreneauxJpa();
	private final IDaoMotif daoMotif = new DaoMotifJpa();
	private final IDaoPraticienAdresse daoPraticienAdresse = new DaoPraticienAdresseJpa();
	private final IDaoPraticienMotif daoPraticienMotif = new DaoPraticienMotifJpa();
	private final IDaoRdv daoRdv = new daoRdvJpa();
	private final IDaoUtilisateur daoUtilisateur=new daoUtilisateurJpa();
	


	public IDaoUtilisateur getDaoUtilisateur() {
		return daoUtilisateur;
	}

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

	public IDaoAdresse getDaoAdresse() {
		return daoAdresse;
	}

	public IDaoPatient getDaoPatient() {
		return daoPatient;
	}

	public IDaoPraticienSpecialite getDaoPraticienSpecialite() {
		return daoPraticienSpecialite;
	}

	public IDaoSpecialite getDaoSpecialite() {
		return daoSpecialite;
	}


}

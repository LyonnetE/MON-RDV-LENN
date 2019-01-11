package monRdv.test;

import formation.Application;
import monRdv.dao.IDaoRdv;
import monRdv.dao.IDaoUtilisateur;
import monRdv.model.Rdv;
import monRdv.model.Utilisateur;


public class TestMonRdvLisaWithDao {

	public static void main(String[] args) {
		IDaoUtilisateur daoUtilisateur = Application.getInstance().getDaoUtilisateur();
		IDaoRdv daoRdv = Application.getInstance().getDaoRdv();
		
		Utilisateur u1= new Utilisateur();
		Rdv rdv1 =new Rdv();
		
		u1.setEmail("blabla@patient.fr");
		u1.setMotDePasse("caca");
		u1.addRdv(rdv1);
		rdv1.setPraticien(null);
		rdv1.setCreneaux(null);
		rdv1.setMotif(null);
		
		u1 =daoUtilisateur.save(u1);
		rdv1= daoRdv.save(rdv1);

	}

}

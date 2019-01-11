package monRdv.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;


import monRdv.Application;
import monRdv.dao.IDaoUtilisateur;
import monRdv.model.Creneaux;
import monRdv.model.Motif;
import monRdv.model.Praticien;
import monRdv.model.Rdv;
import monRdv.model.TypeUtilisateur;
import monRdv.model.Utilisateur;

public class daoUtilisateurJpa implements IDaoUtilisateur {

	@Override
	public List<Utilisateur> findAll() {
		EntityManager em = null;
		EntityTransaction tx = null;

		List<Utilisateur> liste = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();
			TypedQuery<Utilisateur> query = em.createQuery("from Utilisateur", Utilisateur.class);
			liste = query.getResultList();

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
		return liste;
	}

	@Override
	public Utilisateur find(Long id) {
		EntityManager em = null;
		EntityTransaction tx = null;

		Utilisateur obj = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();
			obj =em.find(Utilisateur.class,id);

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
		return obj;
	}

	@Override
	public Utilisateur save(Utilisateur obj) {
		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();
			obj =em.merge(obj);

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
		return obj;
	}

	@Override
	public void delete(Utilisateur obj) {
		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();
			tx.begin();
			
			em.remove(em.merge(obj));
			
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
	}

}

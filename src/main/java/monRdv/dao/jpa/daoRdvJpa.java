package monRdv.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import monRdv.Application;
import monRdv.dao.IDaoRdv;
import monRdv.model.Rdv;

public class daoRdvJpa implements IDaoRdv {

	@Override
	public List<Rdv> findAll() {
		EntityManager em = null;
		EntityTransaction tx = null;

		List<Rdv> liste = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();
			TypedQuery<Rdv> query = em.createQuery("from Rdv", Rdv.class);
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
	public Rdv find(Long id) {
		EntityManager em = null;
		EntityTransaction tx = null;

		Rdv obj = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();
			
			obj =em.find(Rdv.class,id);

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
	public Rdv save(Rdv obj) {
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
	public void delete(Rdv obj) {
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

package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.User;

public class UserDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public void adduser(User user) {
		et.begin();
		em.persist(user);
		et.commit();
	}
	public List<User> login(String email)
	{
		return em.createQuery("select x from User x where email=?1").setParameter(1, email).getResultList();
	}
	public List<User> viewcustomer()
	{
		return em.createQuery("select x from User x where role='customer'").getResultList();
	}
}

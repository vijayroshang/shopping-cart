package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Product;

public class ProductDao 
{
EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();

public void addproduct(Product product)
{
	et.begin();
	em.persist(product);
	et.commit();
}
public List<Product> fetchproducts()
{
	return em.createQuery("select x from Product x").getResultList();
}
public Product fetchproduct(int id)
{
	return em.find(Product.class,id);
}
public void deleteproduct(Product product)
{
	et.begin();
	em.remove(product);
	et.commit();
}
public void updateproduct(Product product)
{
	et.begin();
	em.merge(product);
	et.commit();
}
}

package unione2many;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import java.util.Set;
import java.util.HashSet;


public class Test {
	public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("ab");
	EntityManager em=factory.createEntityManager();
	
	SideDish sd=new SideDish();
	sd.setSideDishId(100);
	sd.setSideDishName("chicken");
	
	SideDish sd1=new SideDish();
	sd1.setSideDishId(101);
	sd1.setSideDishName("fish");
	
	SideDish sd2=new SideDish();
	sd2.setSideDishId(103);
	sd2.setSideDishName("chips");
	
	Set<SideDish> dish=new HashSet<SideDish>();
	dish.add(sd);
	dish.add(sd1);
	dish.add(sd2);
	
	
	Beer beer=new Beer();
	beer.setBeerId(200);
	beer.setBeerName("beer");
	beer.setDishes(dish);
	
	em.getTransaction().begin();
	em.persist(beer);
	em.getTransaction().commit();
	
}

}
package org.tnsif.joinedinheritance;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class JoinedInheritanceDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one emp1
		Student e=new Student();
		e.setRoll(1);
		e.setName("vaibhav");
		e.setPercentage(90.78f);
		em.persist(e);
		
		//create second emp2
		Student e1=new Student();
		e1.setRoll(2);
		e1.setName("saurav S");
		e1.setPercentage(50.78f);
		em.persist(e1);
		
		//create one Citizen
		Citizen m=new Citizen();
		m.setName("ok");
		m.setPercentage(70.5f);
		m.setCitizenType("Pakistan");
		m.passportNumber(6556);
		em.persist(m);
		em.getTransaction().commit();
		System.out.println("Data is added in the database");
		em.close();
		factory.close();

		
	}

	}

 

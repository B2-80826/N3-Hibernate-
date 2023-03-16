package org.tnsif.bidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyBidirectional {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//person-1
		Person p=new Person();
		p.setAdharno(1000000);
		p.setName("vaibhav");
	

		//person-2
		Person p1=new Person();
		p1.setAdharno(20000);
		p1.setName("saurav");
		
		//contact-1
		Contact c1=new Contact();
		c1.setContactno(7028751548);
		c1.setSimtype("Prepaid");
		
		//contact-2
		Contact c2=new Contact();
		c2.setContactno(9455785002);
		c2.setSimtype("Postpaid");
		
		p.setContact(c2);
		p1.setContact(c1);
		
		em.persist(p);
		em.persist(p1);
		em.getTransaction().commit();

		System.out.println("Data add successfully");
		em.close();

		factory.close();
	}

}

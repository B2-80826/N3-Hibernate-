package org.tnsif.dao;

import javax.persistence.EntityManager;

import org.tnsif.entities.Student;

public class StudentDaoImplements implements studentDao {

	private EntityManager em;
	
	
	public StudentDaoImplements() {
		em=JPAUtil.getEntityManager();
	}
	@Override
	public void addStudent(Student student) {
		em.persist(student);
		
	}
	//retrive /find search

	@Override
	public Student getStudent(int rollnumber) {
em.merge(rollnumber);
return null;
	}
//deleation
	@Override
	public Student getStudent(String studentname) {
em.remove(studentname);
return null;		
	}

	@Override
	public void removeStudent(Student student) {
		// TODO Auto-generated method stub
		em.find(null, student);
	}

}

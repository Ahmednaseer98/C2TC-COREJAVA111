package crudoperation.dao;

import javax.persistence.EntityManager;

import crudoperation.entities.College;

public class CollegeDAOImpl implements CollegeDAO{
	private EntityManager em;
	
	
	public  CollegeDAOImpl() {
		em = JUtil.getEntityManager();
	}


	@Override
	public College getCollegeById(long collegeId) {
		// TODO Auto-generated method stub
		College college = em.find(College.class, collegeId);
		
		return college;
	}


	@Override
	public void addCollege(College college) {
		// TODO Auto-generated method stub
		em.persist(college);
	}



	@Override
	public void removeCollege(College college) {
		// TODO Auto-generated method stub
		em.remove(college);
	}



	@Override
	public void updateCollege(College college) {
		// TODO Auto-generated method stub
		em.merge(college);
	}



	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		em.getTransaction().commit();
	}



	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
	}

}
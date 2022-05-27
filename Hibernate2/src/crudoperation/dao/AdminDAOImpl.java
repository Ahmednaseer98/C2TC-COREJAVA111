package crudoperation.dao;

import javax.persistence.EntityManager;

import crudoperation.entities.Admin;

public class AdminDAOImpl implements AdminDAO{
	private EntityManager em;
	
	
	public  AdminDAOImpl() {
		em = JUtil.getEntityManager();
	}


	@Override
	public Admin getAdminById(long adminId) {
		// TODO Auto-generated method stub
           Admin admin = em.find(Admin.class, adminId);
		
		return admin;
	}


	@Override
	public void addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		em.persist(admin);
	}


	@Override
	public void removeAdmin(Admin admin) {
		// TODO Auto-generated method stub
		em.remove(admin);
	}


	@Override
	public void updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		em.merge(admin);
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
package crudoperation.dao;

import javax.persistence.EntityManager;



public class UserDAOImpl implements UserDAO{
	private EntityManager em;
	
	
	public  UserDAOImpl() {
		em = JUtil.getEntityManager();
	}


	@Override
	public User getUserById(long userId) {
		// TODO Auto-generated method stub
		User user = em.find(User.class, userId);
		
		return user;
	}


	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		em.persist(user);
	}


	@Override
	public void removeUser(User user) {
		// TODO Auto-generated method stub
		em.remove(user);
	}


	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		em.merge(user);
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
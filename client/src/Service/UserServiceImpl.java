package crudoperation.service;


import crudoperation.dao.UserDAO;
import crudoperation.dao.UserDAOImpl;

import crudoperation.entities.User;

public class UserServiceImpl  implements UserService {
	private UserDAO dao;
	
	public  UserServiceImpl() {
		dao = new UserDAOImpl();
	}

	@Override
	public User findByUserId(long UserId) {
		// TODO Auto-generated method stub
		User user = dao.getUserById(UserId);
		return user;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addUser(user);
		dao.commitTransaction();
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTransaction();
	}

	@Override
	public void removeUser(User user) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.removeUser(user);
		dao.commitTransaction();
	}
}
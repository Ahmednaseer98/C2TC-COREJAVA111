package crudoperation.service;


import crudoperation.entities.User;

public interface UserService  {
	User findByUserId(long UserId);
	void addUser(User user);
	void updateUser(User user);
	void removeUser(User user);

}
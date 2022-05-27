package Service;




public interface UserService  {
	User findByUserId(long UserId);
	void addUser(User user);
	void updateUser(User user);
	void removeUser(User user);

}
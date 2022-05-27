package crudoperation.dao;

import javax.persistence.EntityManager;




public interface AdminDAO {
	Admin getAdminById(long  adminId);
	void addAdmin(Admin admin);
	void removeAdmin(Admin admin);
	void updateAdmin(Admin admin);
	void commitTransaction();
	void beginTransaction();
	
	

}
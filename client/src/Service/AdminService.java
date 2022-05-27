package Service;

import crudoperation.dao.AdminDAO;



public interface AdminService {
	Admin findByAdminId(long  adminId);
	void addAdmin(Admin admin);
	void updateAdmin(Admin admin);
	void removeAdmin(Admin admin);

}
package crudoperation.service;

import crudoperation.dao.AdminDAO;
import crudoperation.dao.AdminDAOImpl;

import crudoperation.entities.Admin;

public class AdminServiceImpl implements AdminService {
	private AdminDAO dao;
	
	public  AdminServiceImpl() {
		dao = new AdminDAOImpl();
	}

	
	public Admin findByAdminId(long adminId) {
		// TODO Auto-generated method stub
		Admin admin = dao.getAdminById(adminId);
		return admin;
	}

	
	public void addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addAdmin(admin);
		dao.commitTransaction();
	}

	
	public void updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateAdmin(admin);
		dao.commitTransaction();
		
	}

	
	public void removeAdmin(Admin admin) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.removeAdmin(admin);
		dao.commitTransaction();
		
	}

	
	
}
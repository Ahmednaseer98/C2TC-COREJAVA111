package crudoperation.service;


import crudoperation.dao.CollegeDAO;
import crudoperation.dao.CollegeDAOImpl;

import crudoperation.entities.College;

public class CollegeServiceImpl implements CollegeService {
	private CollegeDAO dao;
	
	public  CollegeServiceImpl() {
		dao = new CollegeDAOImpl();
	}

	@Override
	public College findByCollegeId(long collegeId) {
		// TODO Auto-generated method stub
		College college = dao.getCollegeById(collegeId);
		return college;
	}

	@Override
	public void addCollege(College college) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addCollege(college);
		dao.commitTransaction();
		
	}

	@Override
	public void updateCollege(College college) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateCollege(college);
		dao.commitTransaction();
	}

	@Override
	public void removeCollege(College college) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.removeCollege(college);
		dao.commitTransaction();
	}

	
	
	
}
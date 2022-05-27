package crudoperation.service;


import crudoperation.dao.PlacementDAO;
import crudoperation.dao.PlacementDAOImpl;

import crudoperation.entities.Placement;

public class PlacementServiceImpl implements PlacementService {
	private PlacementDAO dao;
	
	public  PlacementServiceImpl() {
		dao = new PlacementDAOImpl();
	}

	@Override
	public Placement findByPlacementId(long placementId) {
		// TODO Auto-generated method stub
		Placement placement = dao.getPlacementById(placementId);
		return placement;
	}

	@Override
	public void addPlacement(Placement placement) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addPlacement(placement);
		dao.commitTransaction();
		
	}

	@Override
	public void updatePlacement(Placement placement) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updatePlacement(placement);
		dao.commitTransaction();
	}

	@Override
	public void removePlacement(Placement placement) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.removePlacement(placement);
		dao.commitTransaction();
	}

}
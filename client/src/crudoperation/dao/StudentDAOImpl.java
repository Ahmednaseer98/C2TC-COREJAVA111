package crudoperation.dao;

import javax.persistence.EntityManager;


public class PlacementDAOImpl  implements PlacementDAO{
	private EntityManager em;
	
	
	public  PlacementDAOImpl() {
		em = JUtil.getEntityManager();
	}


	@Override
	public Placement getPlacementById(long placementId) {
		// TODO Auto-generated method stub
		Placement placement = em.find(Placement.class, placementId);
		
		return placement;
		
	}


	@Override
	public void addPlacement(Placement placement) {
		// TODO Auto-generated method stub
		em.persist(placement);
	}


	@Override
	public void removePlacement(Placement placement) {
		// TODO Auto-generated method stub
		em.remove(placement);
	}


	@Override
	public void updatePlacement(Placement placement) {
		// TODO Auto-generated method stub
		em.merge( placement);
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
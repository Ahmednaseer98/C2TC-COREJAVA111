package crudoperation.service;


import crudoperation.entities.Placement;

public interface PlacementService {
	Placement findByPlacementId(long placementId);
	void addPlacement(Placement placement);
	void updatePlacement(Placement placement);
	void removePlacement(Placement placement);

}
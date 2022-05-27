package crudoperation.dao;

import javax.persistence.EntityManager;



public class CertificateDAOImpl implements CertificateDAO{
	private EntityManager em;
	
	
	public  CertificateDAOImpl() {
		em = JUtil.getEntityManager();
	}


	
	public Certificate getCertificateById(int studentid) {
		// TODO Auto-generated method stub
		Certificate certificate = em.find(Certificate.class, studentid);
		
		return certificate;
	}


	@Override
	public void addCertificate(Certificate certificate) {
		// TODO Auto-generated method stub
		em.persist(certificate);
	}


	@Override
	public void removeCertificate(Certificate certificate) {
		// TODO Auto-generated method stub
		em.remove(certificate);
	}


	@Override
	public void updateCertificate(Certificate certificate) {
		// TODO Auto-generated method stub
		em.merge(certificate);
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
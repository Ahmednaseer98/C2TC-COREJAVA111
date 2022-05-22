package crudoperation.service;

import crudoperation.dao.CertificateDAO;
import crudoperation.dao.CertificateDAOImpl;
import crudoperation.entities.Certificate;

public class CertificateServiceImpl implements CertificateService {
	private CertificateDAO dao;
	
	public  CertificateServiceImpl() {
		dao = new CertificateDAOImpl();
	}

	@Override
	public Certificate findByCertificateId(int studentid) {
		// TODO Auto-generated method stub
		Certificate certificate = dao.getCertificateById(studentid);
		return certificate;
	}

	@Override
	public void addCertificate(Certificate certificate) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addCertificate(certificate);
		dao.commitTransaction();
		
	}

	@Override
	public void updateCertificate(Certificate certificate) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateCertificate(certificate);
		dao.commitTransaction();
	}

	@Override
	public void removeCertificate(Certificate certificate) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.removeCertificate(certificate);
		dao.commitTransaction();
	}

	
	
}
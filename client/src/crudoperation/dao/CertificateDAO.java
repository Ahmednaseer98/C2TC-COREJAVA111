package crudoperation.dao;

import crudoperation.entities.Certificate;

public interface CertificateDAO {
	Certificate getCertificateById(int studentid);
	void addCertificate(Certificate certificate);
	void removeCertificate(Certificate certificate);
	void updateCertificate(Certificate certificate);
	void commitTransaction();
	void beginTransaction();

}
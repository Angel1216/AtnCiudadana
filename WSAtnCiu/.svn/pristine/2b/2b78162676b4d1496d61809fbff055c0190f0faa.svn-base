package com.nd.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nd.bean.RelUsuEmergencia;

@Repository
public class DAOBotonPanico
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void insertarDatosBotonPanico(RelUsuEmergencia datosBPanico){
		Session sesion = this.sessionFactory.getCurrentSession();
		sesion.persist(datosBPanico);
	}
	
	public void saveStatusCall(Integer status, Integer idObjReg){
		Session session = this.sessionFactory.getCurrentSession();
		 session.createQuery("UPDATE RelUsuEmergencia set RemEstatusLlamada = ? WHERE remIdRelUsuEmerg = ?")
				.setParameter(0, status)
				.setParameter(1, idObjReg)
				.executeUpdate();		 
	}
	
	public String getUltimoFolioLlamada(String flNomenclatura) {
		Session session = this.sessionFactory.getCurrentSession();
		Query x = session
				.createSQLQuery(
						"select LPAD ((ifnull(max(substr(REM_FOLIO,15,6)),0)+1), 6, '000000') as folio from REL_USU_EMERGENCIA WHERE REM_FOLIO IS NOT NULL AND REM_FOLIO like ?")
				.setParameter(0, "%" + flNomenclatura + "%");
		return (String) x.uniqueResult();
	}
}

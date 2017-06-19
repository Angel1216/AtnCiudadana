package com.nd.dao;

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
	
	public void insertarDatosBotonPanico(RelUsuEmergencia datosBPanico)
	{
		Session sesion = this.sessionFactory.getCurrentSession();
		sesion.persist(datosBPanico);
	}
}

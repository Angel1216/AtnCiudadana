package com.nd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nd.bean.RelUsuEmergencia;
import com.nd.dao.DAOBotonPanico;

@Service("serviceBotonPanico")
public class ServiceBotonPanico
{
	@Autowired
	private DAOBotonPanico daoBotonPanico;
	
	@Transactional
	public void insertarDatosBotonPanico(RelUsuEmergencia datosBPanico)
	{
		this.daoBotonPanico.insertarDatosBotonPanico(datosBPanico);
	}
}

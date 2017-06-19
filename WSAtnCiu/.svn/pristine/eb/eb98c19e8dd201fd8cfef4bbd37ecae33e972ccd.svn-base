package com.nd.dao;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.nd.bean.Servicios; 

@Repository
public class DAOCatalogos {
	
	@Autowired  
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {  
		  this.sessionFactory = sf;  
	}
	
	public List<Servicios> getServicios(){
 		Session session = this.sessionFactory.getCurrentSession();
 		@SuppressWarnings("unchecked")
 		List<Servicios> lstServicios = session.createQuery("from Servicios WHERE padreId IS NULL").list();		// select servicioId, descripcion from Servicios WHERE padreId IS NULL
 		return lstServicios;
 	}
	
	public List<Servicios> getFallas(String servicioId){
		Session session = this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Servicios> lstServicios = session.createQuery("from Servicios WHERE padreId = "+servicioId).list();
		return lstServicios;
	}

}

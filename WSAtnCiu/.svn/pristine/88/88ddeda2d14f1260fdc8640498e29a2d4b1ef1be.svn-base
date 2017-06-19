package com.nd.dao;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.nd.bean.CatEmergencias;
import com.nd.bean.CatInstrucciones;
import com.nd.bean.CatRoles;
import com.nd.bean.CatStatus;
import com.nd.bean.CatZonas;
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
		List<Servicios> lstServicios = (List<Servicios>)session.createQuery("from Servicios WHERE padreId = "+servicioId).list();
		return lstServicios;
	}
	
	
	/**
	 * Tabla: cat_emergencias
	 * Descripcion: Catalogo de las emergencias disponibles
	 */
	
	public void insertaEmergencia(CatEmergencias catEmergencias){
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(catEmergencias);
	}
	
	public void eliminaEmergencia(CatEmergencias catEmergencias){
		Session session = this.sessionFactory.getCurrentSession();

		String hql = "UPDATE CatEmergencias SET emgEstatus = :emgEstatus WHERE emgIdEmergencia = :emgIdEmergencia";
		Query query = session.createQuery(hql);
		query.setInteger("emgEstatus", catEmergencias.getEmgEstatus());
		query.setInteger("emgIdEmergencia", catEmergencias.getEmgIdEmergencia());
		query.executeUpdate();
	}
	
	
	/**
	 * Tabla: cat_servicios
	 * Descripcion: Catalogo de los SERVICIOS y FALLAS disponibles 
	 */
	
	public void insertaServicio(Servicios servicios){
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(servicios);
	}
	
	public void eliminarServicio(Servicios servicios){
		Session session = this.sessionFactory.getCurrentSession();
		
		String hql = "";
		Query query = null;
		
		if(servicios.getPadreId()==null){
			hql = "UPDATE Servicios SET estatus = :estatus WHERE servicioId = :servicioId";
			query = session.createQuery(hql);
			query.setInteger("estatus", servicios.getEstatus());
			query.setInteger("servicioId", servicios.getServicioId());
			
		} else {
			hql = "UPDATE Servicios SET estatus = :estatus WHERE servicioId = :servicioId AND padreId = :padreId";
			query = session.createQuery(hql);
			query.setInteger("estatus", servicios.getEstatus());
			query.setInteger("servicioId", servicios.getServicioId());
			query.setInteger("padreId", servicios.getPadreId().getSrvIdServicio());
		}
		
		query.executeUpdate();
	}
	
	
	/**
	 * Tabla: cat_estatus
	 * Descripcion: Catalogo de los estatus de los folios 
	 */
	
	public void insertaEstatus(CatStatus catStatus){
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(catStatus);
	}
	
	public void eliminarEstatus(CatStatus catStatus){
		Session session = this.sessionFactory.getCurrentSession();

		String hql = "UPDATE CatStatus SET estEstatus = :estEstatus WHERE estIdEstatus = :estIdEstatus";
		Query query = session.createQuery(hql);
		query.setInteger("estEstatus", catStatus.getEstEstatus());
		query.setInteger("estIdEstatus", catStatus.getEstIdEstatus());
		
		query.executeUpdate();
	}
	
	
	/**
	 * Tabla: cat_roles
	 * Descripcion: Catalogo de los roles 
	 */
	
	public void insertaRoles(CatRoles catRoles){
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(catRoles);
	}
	
	public void eliminarRoles(CatRoles catRoles){
		Session session = this.sessionFactory.getCurrentSession();

		String hql = "UPDATE CatRoles SET rolEstatus = :rolEstatus WHERE rolIdRol = :rolIdRol";
		Query query = session.createQuery(hql);
		query.setInteger("rolEstatus", catRoles.getRolEstatus());
		query.setInteger("rolIdRol", catRoles.getRolIdRol());
		
		query.executeUpdate();
	}
	
	
	/**
	 * Tabla: cat_zonas
	 * Descripcion: Catalogo de las Zonas 
	 */
	
	public void insertaZonas(CatZonas catZonas){
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(catZonas);
	}
	
	public void eliminarZona(CatZonas catZonas){
		Session session = this.sessionFactory.getCurrentSession();

		String hql = "UPDATE CatZonas SET cznEstatus = :cznEstatus WHERE cznIdZona = :cznIdZona";
		Query query = session.createQuery(hql);
		query.setInteger("cznEstatus", catZonas.getCznEstatus());
		query.setInteger("cznIdZona", catZonas.getCznIdZona());
		
		query.executeUpdate();
	}
	
	
	/**
	 * Tabla: cat_instrucciones
	 * Descripcion: Catalogo de las Insctrucciones 
	 */
	
	public void insertaInsctrucciones(CatInstrucciones catInstrucciones){
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(catInstrucciones);
	}
	
	public void eliminarInsctrucciones(CatInstrucciones catInstrucciones){
		Session session = this.sessionFactory.getCurrentSession();

		String hql = "UPDATE CatInstrucciones SET insEstatus = :insEstatus WHERE insIdInstrucciones = :insIdInstrucciones";
		Query query = session.createQuery(hql);
		query.setInteger("insEstatus", catInstrucciones.getInsEstatus());
		query.setInteger("insIdInstrucciones", catInstrucciones.getInsIdInstrucciones());
		
		query.executeUpdate();
	}
}

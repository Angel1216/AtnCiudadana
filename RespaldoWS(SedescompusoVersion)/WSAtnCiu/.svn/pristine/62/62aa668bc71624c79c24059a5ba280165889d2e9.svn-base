package com.nd.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nd.bean.Archivos;
import com.nd.bean.RelPerServ;
import com.nd.bean.ServicioPadre;

@Repository  
public class DAORelPerServ {
	
	@Autowired  
	private SessionFactory sessionFactory;  
	  
	public void setSessionFactory(SessionFactory sf) {  
		this.sessionFactory = sf;  
	}  
	
 	public void updateRelPerServ(RelPerServ objRelPerServ) {  
		  Session session = this.sessionFactory.getCurrentSession();  
		  session.update(objRelPerServ);  
	}
	 
	public List<RelPerServ> getRelPerSerByIdUser(Integer idUsuario){
		Session session = this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<RelPerServ> listPerServ = session.createQuery("from RelPerServ where rpcIdUsuario = ? ")
				.setParameter(0, idUsuario)
				.list();
		return listPerServ.size() > 0 ? listPerServ : null;
	}
	
	public List<RelPerServ> getRelPerSerByIdService(ServicioPadre objServicioPadre){
		Session session = this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<RelPerServ> listPerServ = session.createQuery("from RelPerServ where rpcIdServicio.padreId = ? ")
				.setParameter(0, objServicioPadre)
				.list();
		return listPerServ.size() > 0 ? listPerServ : null;
	}
	
	public List<Archivos> getFilesByIdUser(Integer idUsuario){
		Session session = this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Archivos> listArchivos = session.createQuery("from Archivos a where a.arcIdRelUsuCatServ.rpcIdUsuario = ? ")
				.setParameter(0, idUsuario)
				.list();
		return listArchivos.size() > 0 ? listArchivos : null;
	}
	
	public Integer addRelPerSerAlert(RelPerServ objRelPerServ) {  
		  Session session = this.sessionFactory.getCurrentSession();  
		  session.persist(objRelPerServ);  
		  
		  return objRelPerServ.getRpcIdusucatser();
	}
	
	public void addRelPerSerArchivos(Archivos objArchivos) {  
		  Session session = this.sessionFactory.getCurrentSession();  
		  session.persist(objArchivos);  
	}

	
	
}

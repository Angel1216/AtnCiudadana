package com.nd.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nd.bean.Archivos;
import com.nd.bean.RelPerServ;
import com.nd.bean.ServicioPadre;
import com.nd.bean.Usuario;

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

	public List<RelPerServ> getRelPerSerByIdUser(Usuario objUsuario) {
		Session session = this.sessionFactory.getCurrentSession();
		List<RelPerServ> lResultado = new ArrayList<RelPerServ>();
		RelPerServ objReportes = null;

		try {
			session.clear();
			@SuppressWarnings("unchecked")
			List<RelPerServ> listPerServ = session
					.createQuery(
							"from RelPerServ a where a.rpcIdUsuario = ? and  a.rpcEstatus=1  ")
					.setParameter(0, objUsuario).list();
			if (listPerServ.size() == 0) {
				objReportes = new RelPerServ();
				objReportes.setRpcEstatus(1000);
				listPerServ.clear();
				listPerServ.add(objReportes);
			}

			lResultado = listPerServ;

		} catch (Exception e) {
			e.printStackTrace();
			objReportes = new RelPerServ();
			objReportes.setRpcEstatus(1001);
			lResultado.add(objReportes);
		}

		return lResultado;
	}

	public List<RelPerServ> getRelPerSerByIdService(
			ServicioPadre objServicioPadre) {
		Session session = this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<RelPerServ> listPerServ = session
				.createQuery("from RelPerServ where rpcIdServicio.padreId = ? ")
				.setParameter(0, objServicioPadre).list();
		return listPerServ.size() > 0 ? listPerServ : null;
	}

	public List<Integer> getFilesByIdUsuCatServ(Integer rpcIdusucatser) {
		Session session = this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Integer> listArchivos = session
				.createQuery(
						"select a.arcIdArchivo from Archivos a where a.arcIdRelUsuCatServ.rpcIdusucatser = ?")
				.setParameter(0, rpcIdusucatser).list();
		return listArchivos.size() > 0 ? listArchivos : null;
	}

	public byte[] getImageByArcIdArchivo(Integer arcIdArchivo) {
		Session session = this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Archivos> listArchivos = session
				.createQuery("from Archivos a where a.arcIdArchivo = ?")
				.setParameter(0, arcIdArchivo).list();
		return listArchivos.size() > 0 ? listArchivos.get(0).getArcArchivo()
				: null;
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

	public String getUltimoFolio(String flNomenclatura) {
		Session session = this.sessionFactory.getCurrentSession();
		Query x = session
				.createSQLQuery(
						"select LPAD ((ifnull(max(substr(RPC_FOLIO_REPORTE,15,6)),0)+1), 6, '000000') as folio from op_rel_per_cat_serv WHERE RPC_FOLIO_REPORTE IS NOT NULL AND RPC_FOLIO_REPORTE like ?")
				.setParameter(0, "%" + flNomenclatura + "%");
		return (String) x.uniqueResult();
	}

	public RelPerServ getRelPerSerById(Integer idRelPerServ) {
		Session session = this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<RelPerServ> listPerServ = session
				.createQuery("from RelPerServ where rpcIdusucatser = ? ")
				.setParameter(0, idRelPerServ).list();
		return listPerServ.size() > 0 ? listPerServ.get(0) : null;
	}

	public void deleteReports(Integer idReport) {
		Session session = this.sessionFactory.getCurrentSession();
		session.createQuery(
				"update RelPerServ c set c.rpcEstatus=0 where c.rpcIdusucatser = ?")
				.setParameter(0, idReport).executeUpdate();
	}
}
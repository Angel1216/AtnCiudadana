package com.nd.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.nd.dao.DAOCatalogos;
import com.nd.bean.CatEmergencias;
import com.nd.bean.CatInstrucciones;
import com.nd.bean.CatRoles;
import com.nd.bean.CatStatus;
import com.nd.bean.CatZonas;
import com.nd.bean.Servicios;

import java.util.List;
import java.util.ArrayList;

@Service("serviceCatalogos")
public class ServiceCatalogos {
	
	@Autowired
	DAOCatalogos daoCatalogos;
	
	@Transactional
	public String getServicios(){
		
		List<Servicios> lstServicios = new ArrayList<Servicios>();
		String JSON = "[";

		lstServicios = daoCatalogos.getServicios();
		
		for(int i = 0; i < lstServicios.size(); i++){
			JSON = JSON + "{\"servicioId\": " + lstServicios.get(i).getServicioId().toString() + "," + 
                                       "\"descripcion\": " + "\""+lstServicios.get(i).getDescripcion() + "\"," + 
                                       "\"descripcionDos\": " + "\""+lstServicios.get(i).getDescripcionDos()+"\"}";
			if((i+1) != lstServicios.size()){
				JSON = JSON + ",";
			}
		}
		JSON = JSON + "]";

		return JSON;
	}
	
	@Transactional
	public String getFallas(String servicioId){
		
		List<Servicios> lstServicios = new ArrayList<Servicios>();
		String JSON = "[";

		lstServicios = daoCatalogos.getFallas(servicioId);
		
		for(int i = 0; i < lstServicios.size(); i++){
			JSON = JSON + "{\"servicioId\": " + lstServicios.get(i).getServicioId().toString() + "," 
                                    + "\"descripcion\": " + "\""+lstServicios.get(i).getDescripcion()+ "\"," + 
                                      "\"descripcionDos\": " + "\""+lstServicios.get(i).getDescripcionDos()+"\"}";
			if((i+1) != lstServicios.size()){
				JSON = JSON + ",";
			}
		}
		JSON = JSON + "]";

		return JSON;
		
	}
	
	
	/**
	 * Tabla: cat_emergencias
	 * Descripcion: Catalogo de las emergencias disponibles
	 */
	
	@Transactional
	public void insertaEmergencia(CatEmergencias catEmergencias){
		daoCatalogos.insertaEmergencia(catEmergencias);
	}
	
	@Transactional
	public void eliminaEmergencia(CatEmergencias catEmergencias){
		daoCatalogos.eliminaEmergencia(catEmergencias);
	}
	
	
	/**
	 * Tabla: cat_servicios
	 * Descripcion: Catalogo de los SERVICIOS y FALLAS disponibles 
	 */
	
	@Transactional
	public void insertaServicio(Servicios servicios){
		daoCatalogos.insertaServicio(servicios);
	}
	
	@Transactional
	public void eliminarServicio(Servicios servicios){
		daoCatalogos.eliminarServicio(servicios);
	}
	
	
	/**
	 * Tabla: cat_estatus
	 * Descripcion: Catalogo de los estatus de los folios 
	 */
	
	@Transactional
	public void insertaEstatus(CatStatus catStatus){
		daoCatalogos.insertaEstatus(catStatus);
	}
	
	@Transactional
	public void eliminarEstatus(CatStatus catStatus){
		daoCatalogos.eliminarEstatus(catStatus);
	}
	
	
	/**
	 * Tabla: cat_roles
	 * Descripcion: Catalogo de los roles 
	 */
	
	@Transactional
	public void insertaRoles(CatRoles catRoles){
		daoCatalogos.insertaRoles(catRoles);
	}
	
	@Transactional
	public void eliminarRoles(CatRoles catRoles){
		daoCatalogos.eliminarRoles(catRoles);
	}
	
	
	/**
	 * Tabla: cat_zonas
	 * Descripcion: Catalogo de las Zonas 
	 */
	
	@Transactional
	public void insertaZonas(CatZonas catZonas){
		daoCatalogos.insertaZonas(catZonas);
	}
	
	@Transactional
	public void eliminarZona(CatZonas catZonas){
		daoCatalogos.eliminarZona(catZonas);
	}
	
	/**
	 * Tabla: cat_instrucciones
	 * Descripcion: Catalogo de las Insctrucciones 
	 */
	
	@Transactional
	public void insertaInsctrucciones(CatInstrucciones catInstrucciones){
		daoCatalogos.insertaInsctrucciones(catInstrucciones);
	}
	
	@Transactional
	public void eliminarInsctrucciones(CatInstrucciones catInstrucciones){
		daoCatalogos.eliminarInsctrucciones(catInstrucciones);
	}
}

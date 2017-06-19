package com.nd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.nd.bean.CatEmergencias;
import com.nd.bean.Servicios;
import com.nd.bean.CatStatus;
import com.nd.bean.CatRoles;
import com.nd.bean.CatZonas;
import com.nd.bean.CatInstrucciones;
import com.nd.service.ServiceCatalogos;

@RestController
public class ControllerCatalogos {
	
	@Autowired
	ServiceCatalogos serviceCatalogos;

	/**
	 * Tabla: cat_servicios
	 * Descripcion: Catalogo de SERVICIOS y FALLAS
	 */
	@RequestMapping(value="/getServicios", method = RequestMethod.GET, headers = "Accept=application/json")
	public String getServicios(){
		String dsServicios = serviceCatalogos.getServicios();
		return dsServicios;
	}
	
	@RequestMapping(value="/getFallas/{servicioId}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String getFallas(@PathVariable("servicioId") String servicioId){
		String dsFallas = serviceCatalogos.getFallas(servicioId);
		return dsFallas;
	}
	
	
	/**
	 * Tabla: cat_emergencias
	 * Descripcion: Catalogo de las emergencias disponibles
	 */
	
	/** ALTA DE CATALOGO Emergencia*/
	@RequestMapping(value="/insertaEmergencia", method = RequestMethod.POST, headers = "Accept=application/json")
	public void insertaEmergencia(@RequestBody CatEmergencias catEmergencias){
		serviceCatalogos.insertaEmergencia(catEmergencias);
	}
	
	/** BORRADO LOGICO Emergencia*/
	@RequestMapping(value="/eliminaEmergencia", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void eliminaEmergencia(@RequestBody CatEmergencias catEmergencia){
		serviceCatalogos.eliminaEmergencia(catEmergencia);
	}
	
	
	/**
	 * Tabla: cat_servicios
	 * Descripcion: Catalogo de los SERVICIOS y FALLAS disponibles 
	 */
	
	/** ALTA DE CATALOGO Servicios*/
	@RequestMapping(value="/insertaServicio", method = RequestMethod.POST, headers = "Accept=application/json")
	public void insertaServicio(@RequestBody Servicios servicios){
		serviceCatalogos.insertaServicio(servicios);
	}
	
	/** BORRADO LOGICO Servicios*/
	@RequestMapping(value="/eliminarServicio", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void eliminarServicio(@RequestBody Servicios servicios){
		serviceCatalogos.eliminarServicio(servicios);
	}
	
	
	/**
	 * Tabla: cat_estatus
	 * Descripcion: Catalogo de los estatus de los folios 
	 */
	
	/** ALTA DE CATALOGO Estatus*/
	@RequestMapping(value="/insertaEstatus", method = RequestMethod.POST, headers = "Accept=application/json")
	public void insertaEstatus(@RequestBody CatStatus catStatus){
		serviceCatalogos.insertaEstatus(catStatus);
	}
	
	/** BORRADO LOGICO Estatus*/
	@RequestMapping(value="/eliminarEstatus", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void eliminarEstatus(@RequestBody CatStatus catStatus){
		serviceCatalogos.eliminarEstatus(catStatus);
	}
	
	
	/**
	 * Tabla: cat_roles
	 * Descripcion: Catalogo de los roles 
	 */
	
	/** ALTA DE CATALOGO Roles*/
	@RequestMapping(value="/insertaRoles", method = RequestMethod.POST, headers = "Accept=application/json")
	public void insertaRoles(@RequestBody CatRoles catRoles){
		serviceCatalogos.insertaRoles(catRoles);
	}
	
	/** BORRADO LOGICO Roles*/
	@RequestMapping(value="/eliminarRoles", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void eliminarRoles(@RequestBody CatRoles catRoles){
		serviceCatalogos.eliminarRoles(catRoles);
	}
	
	
	/**
	 * Tabla: cat_zonas
	 * Descripcion: Catalogo de las Zonas 
	 */
	
	/** ALTA DE CATALOGO Zonas*/
	@RequestMapping(value="/insertaZonas", method = RequestMethod.POST, headers = "Accept=application/json")
	public void insertaZonas(@RequestBody CatZonas catZonas){
		serviceCatalogos.insertaZonas(catZonas);
	}
	
	/** BORRADO LOGICO Zonas*/
	@RequestMapping(value="/eliminarZona", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void eliminarZona(@RequestBody CatZonas catZonas){
		serviceCatalogos.eliminarZona(catZonas);
	}
	
	
	/**
	 * Tabla: cat_instrucciones
	 * Descripcion: Catalogo de las Insctrucciones 
	 */
	
	/** ALTA DE CATALOGO Insctrucciones*/
	@RequestMapping(value="/insertaInsctrucciones", method = RequestMethod.POST, headers = "Accept=application/json")
	public void insertaInsctrucciones(@RequestBody CatInstrucciones catInstrucciones){
		serviceCatalogos.insertaInsctrucciones(catInstrucciones);
	}
	
	/** BORRADO LOGICO Insctrucciones*/
	@RequestMapping(value="/eliminarInsctrucciones", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void eliminarInsctrucciones(@RequestBody CatInstrucciones catInstrucciones){
		serviceCatalogos.eliminarInsctrucciones(catInstrucciones);
	}
}
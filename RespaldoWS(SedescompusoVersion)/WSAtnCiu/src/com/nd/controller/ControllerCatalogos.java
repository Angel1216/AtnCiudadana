package com.nd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;

import com.nd.service.ServiceCatalogos;

@RestController
public class ControllerCatalogos {
	
	@Autowired
	ServiceCatalogos serviceCatalogos;
	
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
}

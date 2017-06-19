package com.nd.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.nd.dao.DAOCatalogos;
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
			JSON = JSON + "{\"servicioId\": " + lstServicios.get(i).getServicioId().toString() + "," + "\"descripcion\": " + "\""+lstServicios.get(i).getDescripcion()+"\"}";
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
			JSON = JSON + "{\"servicioId\": " + lstServicios.get(i).getServicioId().toString() + "," + "\"descripcion\": " + "\""+lstServicios.get(i).getDescripcion()+"\"}";
			if((i+1) != lstServicios.size()){
				JSON = JSON + ",";
			}
		}
		JSON = JSON + "]";

		return JSON;
		
	}

}

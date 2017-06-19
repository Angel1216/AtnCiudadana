package com.nd.controller;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nd.bean.RelUsuEmergencia;
import com.nd.service.ServiceBotonPanico;

@RestController
public class ControllerBotonPanico {

	@Autowired
	private ServiceBotonPanico serviceBotonPanico;
	
	@RequestMapping(value="/insertarDatosBotonPanico", method = RequestMethod.POST, headers = "Accept=application/json")
	public void insertarDatosBotonPanico(@RequestBody RelUsuEmergencia datosBPanico) throws JSONException
	{
		this.serviceBotonPanico.insertarDatosBotonPanico(datosBPanico);
	}
}

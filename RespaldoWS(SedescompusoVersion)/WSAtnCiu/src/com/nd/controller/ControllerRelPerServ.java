package com.nd.controller;  

/**
 *
 * http://localhost:8080/WSAtnCiu/updateRelPerServ
 * http://localhost:8080/WSAtnCiu/getRelPerSerByIdUser
 *  
 */

import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController; 
import org.json.JSONException;
import com.nd.bean.RelPerServ;
import com.nd.bean.Archivos;
import com.nd.bean.ServicioPadre;
import com.nd.service.ServiceRelPerServ;

import java.util.List;

@RestController  
public class ControllerRelPerServ {

	@Autowired  
	ServiceRelPerServ serviceReport;

	@RequestMapping(value = "/updateRelPerServ", method = RequestMethod.PUT, headers = "Accept=application/json")  
	public void updateRelPerServ(@RequestBody RelPerServ objRelPerServ) {  
		serviceReport.updateRelPerServ(objRelPerServ);  
	}

	@RequestMapping(value="/getRelPerSerByIdUser/{flIdUsuario}", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody  List<RelPerServ> getRelPerSerByIdUser(@PathVariable ("flIdUsuario") Integer flIdUsuario) throws JSONException {
		System.out.println("vlIdUsuario: " + flIdUsuario);
		List<RelPerServ> list = serviceReport.getRelPerSerByIdUser(flIdUsuario);
		System.out.println("list: " + list);
		return list;
	}
	
	@RequestMapping(value="/getFilesByIdUser/{flIdUsuario}", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody  List<String> getFilesByIdUser(@PathVariable ("flIdUsuario") Integer flIdUsuario) throws JSONException {
		System.out.println("vlIdUsuario ANTES 1: " + flIdUsuario);
		List<String> list = serviceReport.getFilesByIdUser(flIdUsuario);
		System.out.println("Presentando DESPUES 1:");
		return list;
	}
	
	@RequestMapping(value="/getRelPerSerByIdService/{flIdService}", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody  List<RelPerServ> getRelPerSerByIdService(@PathVariable ("flIdService") Integer flIdService) throws JSONException {
		ServicioPadre objServicioPadre = new ServicioPadre(flIdService);
		List<RelPerServ> list = serviceReport.getRelPerSerByIdService(objServicioPadre);
		System.out.println("list: " + list);
		return list;
	}
	
	@RequestMapping(value="/getRelPerSerAlert", method = RequestMethod.POST, headers = "Accept=application/json")
	public String getRelPerSerAlert(@RequestBody RelPerServ objRelPerServ) throws JSONException {
		 return serviceReport.getRelPerSerAlert(objRelPerServ);
	}
	
	@RequestMapping(value="/getRelPerSerArchivos", method = RequestMethod.POST, headers = "Accept=application/json")
	public void getRelPerSerArchivos(@RequestBody Archivos objArchivos) throws JSONException {
		 serviceReport.getRelPerSerArchivos(objArchivos);
	}
}

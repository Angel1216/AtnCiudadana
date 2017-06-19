package com.nd.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nd.bean.Archivos;
import com.nd.bean.RelPerServ;
import com.nd.bean.ServicioPadre;
import com.nd.dao.DAORelPerServ;

import sun.misc.BASE64Decoder;

//import java.nio.charset.StandardCharsets;
//import java.util.Base64;


@Service("countryServiceReport") 
public class ServiceRelPerServ {
	 @Autowired  
	 DAORelPerServ daoReport; 
	 
	 @Transactional  
	 public void updateRelPerServ(RelPerServ objRelPerServ) {  
	 	daoReport.updateRelPerServ(objRelPerServ);  
	 }
	 
	 @Transactional
	 public List<RelPerServ> getRelPerSerByIdUser(Integer idUsuario){
		 List<RelPerServ> list = daoReport.getRelPerSerByIdUser(idUsuario); 
		 return list;
	 }
	 @Transactional
		public List<RelPerServ> getRelPerSerByIdService(ServicioPadre objServicioPadre){
		 List<RelPerServ> list = daoReport.getRelPerSerByIdService(objServicioPadre); 
		 return list;
	 }
	 
	 @Transactional
	 public List<String> getFilesByIdUser(Integer idUsuario){
		 List<Archivos> list = daoReport.getFilesByIdUser(idUsuario);
		 List<String> vlListResult = new ArrayList<String> ();
		 
		 Base64.Encoder encoder = Base64.getEncoder();
		 
		 for (Archivos vlArchivo : list) {
			 String vlCodedByteArray = encoder.encodeToString(vlArchivo.getArcArchivo());
			 vlListResult.add(vlCodedByteArray);
			 System.out.println("vlCodedByteArray = "+vlCodedByteArray);
		 }
		 return vlListResult;
	 }
	 
	 @Transactional
	 public String getRelPerSerAlert(RelPerServ objRelPerServ){
		 String JSON = "";
		 Integer alertId = daoReport.addRelPerSerAlert(objRelPerServ);
		 JSON = "[{\"alertId\":" + alertId + "}]";
		 return JSON;  
	 }
	 
	 @Transactional
	 public void getRelPerSerArchivos(Archivos objArchivos){
		 // Codificar
		 //Base64.Decoder decoder = Base64.getDecoder();
		 //byte[] decodedByteArray = decoder.decode(objArchivos.getArchivoStr());
		 BASE64Decoder decoder = new BASE64Decoder();
		 byte[] imageByte = null;
		 
		 try{
		 	imageByte = decoder.decodeBuffer(objArchivos.getArchivoStr());
		 } catch(Exception ex){
			 ex.printStackTrace();
		 }
		 
		 // Actualizar Variables
		 objArchivos.setArcArchivo(imageByte);
		 objArchivos.setArchivoStr("OK");
		 
		 // DAO
		 daoReport.addRelPerSerArchivos(objArchivos);
	 }
}

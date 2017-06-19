package com.nd.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import org.springframework.transaction.annotation.Transactional;  

import com.nd.bean.CatStatus;
import com.nd.bean.Usuario;
import com.nd.bean.VLlamadaEmergencia;
import com.nd.dao.DAO;
  
@Service("countryService")  
public class Services {  
  
 @Autowired  
 DAO dao;  
   
 @Transactional  
 public void addUsuario(Usuario usuario) {  
  dao.addUsuario(usuario);  
 }

 @Transactional
 public Usuario getUserByNameAndPass(String flEmail , String flPass){
	 return dao.getUserByNameAndPass(flEmail, flPass);
 }
 
 @Transactional
 public Usuario getUserByEmail (String flEmail){
	 return dao.getUserByEmail(flEmail);
 }
 @Transactional
 public Usuario getUserByIdUsuario(Integer flIdUsuario){
	 return dao.getUserByIdUsuario(flIdUsuario);
 }
 
 @Transactional
 public List<CatStatus> getStatus(){
	 return dao.getStatus();
 }
 
 @Transactional
 public List<VLlamadaEmergencia> getIncomingCall(){
	 
	 List<VLlamadaEmergencia> lstLlamadaEmergencia = dao.getIncomingCall();
	 List<VLlamadaEmergencia> lstLlamadaEmergenciaEnv = new ArrayList<VLlamadaEmergencia>();
	 
	 // Obtener la hora
	 Calendar calendario = Calendar.getInstance();
	 int anio, mes, dia, hora, minutos, segundos;
	 
	 // Fecha y Hora del Sistema
	 anio = calendario.get(Calendar.YEAR);
	 mes = calendario.get(Calendar.MONTH);
	 dia = calendario.get(Calendar.DAY_OF_MONTH);
	 hora = calendario.get(Calendar.HOUR_OF_DAY);
	 minutos = calendario.get(Calendar.MINUTE);
	 segundos = calendario.get(Calendar.SECOND);
	 
	 // Fecha y Hora del Registro
	 String[] fechaHora = lstLlamadaEmergencia.get(0).getFecha().split(" ");
	 String fechaR = fechaHora[0];
	 String[] fechaSeparada = fechaR.split("-");
	 
	 String horaR = fechaHora[1];
	 String[] horaSeparada = horaR.split(":");
	 
	 boolean reciente = false;
	 
	 if(lstLlamadaEmergencia!=null){
		 
		 // Validar si el registro (alerta de emergencia) mas reciente tiene menos de 1 minuto
		 if(anio == Integer.parseInt(fechaSeparada[0]) && mes == (Integer.parseInt(fechaSeparada[1])-1) && dia == Integer.parseInt(fechaSeparada[2]) && hora == Integer.parseInt(horaSeparada[0]) && lstLlamadaEmergencia.get(0).getEstatusLlamada()==null){
			 int diferencia = minutos - Integer.parseInt(horaSeparada[1]);
			 
			 if(diferencia >= 0 && diferencia <=1){
				 reciente = true;
			 }
		 }
		 
		 if(reciente == true){
			 VLlamadaEmergencia dtoVLlamadaEmergencia = new VLlamadaEmergencia();
			 
			 dtoVLlamadaEmergencia.setNombre(lstLlamadaEmergencia.get(0).getNombre());
			 dtoVLlamadaEmergencia.setTelefono(lstLlamadaEmergencia.get(0).getTelefono());
			 dtoVLlamadaEmergencia.setIdEmergencia(lstLlamadaEmergencia.get(0).getIdEmergencia());
			 dtoVLlamadaEmergencia.setTipoEmergencia(lstLlamadaEmergencia.get(0).getTipoEmergencia());
			 dtoVLlamadaEmergencia.setUbicacion(lstLlamadaEmergencia.get(0).getUbicacion());
			 dtoVLlamadaEmergencia.setFecha(lstLlamadaEmergencia.get(0).getFecha());
			 dtoVLlamadaEmergencia.setEstatusLlamada(lstLlamadaEmergencia.get(0).getEstatusLlamada());
			 dtoVLlamadaEmergencia.setEstatusReporte(lstLlamadaEmergencia.get(0).getEstatusReporte());
			 dtoVLlamadaEmergencia.setFolio(lstLlamadaEmergencia.get(0).getFolio());
			 
			 lstLlamadaEmergenciaEnv.add(dtoVLlamadaEmergencia);
		 } else {
			 lstLlamadaEmergenciaEnv = null;
		 }
	 } else {
		 lstLlamadaEmergenciaEnv = null;
	 }
	 
	 return lstLlamadaEmergenciaEnv;
 }
 
 @Transactional
 public List<VLlamadaEmergencia> getCallStatus(){
	 return dao.getCallStatus();	 
 }
}
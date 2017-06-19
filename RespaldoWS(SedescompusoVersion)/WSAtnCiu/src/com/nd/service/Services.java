package com.nd.service;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import org.springframework.transaction.annotation.Transactional;  

import com.nd.bean.Usuario;
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
}
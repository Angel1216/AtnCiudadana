package com.nd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nd.bean.Usuario;
import com.nd.service.Services;

@RestController
public class Controller {

	@Autowired
	Services services;

	@RequestMapping(value = "/addUsuario", method = RequestMethod.POST, headers = "Accept=application/json")
	public void addUsuario(@RequestBody Usuario usuario) {
		services.addUsuario(usuario);
	}

	@RequestMapping(value = "/getUserByNameAndPass/{flEmail}/{flPass}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Usuario getUserByNameAndPass(
			@PathVariable("flEmail") String flEmail,
			@PathVariable("flPass") String flPass) {
		Usuario flUser = services.getUserByNameAndPass(flEmail, flPass);
		if (flUser.getUsuarioId() != null) {
			return flUser;
		} else {
			return null;
		}
	}

	@RequestMapping(value = "/getUserByEmail/{flEmail}/", method = RequestMethod.GET)
	public Boolean getUserByEmail(@PathVariable("flEmail") String flEmail) {
		Usuario flUser = services.getUserByEmail(flEmail);
		if (flUser != null) {
			return true;
		} else {
			return false;
		}
	}
}
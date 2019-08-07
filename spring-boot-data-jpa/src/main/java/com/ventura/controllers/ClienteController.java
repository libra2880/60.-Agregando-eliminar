package com.ventura.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ventura.models.dao.IClienteDao;

@Controller
public class ClienteController {

	@Autowired
	private IClienteDao clienteDao;
	
	
	@RequestMapping(value="/listar",method = RequestMethod.GET)
	public String Listar(Model model) {
		model.addAttribute("titulo","Listado de Clientes");
		model.addAttribute("clientes",clienteDao.findAll());
		return "listar";
	}
}
package com.easypets.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pets")
public class PetController {

	@GetMapping("/logar")
	public String logar() {
		return "/pets/login";
	}
	
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/pets/cadastro";
	}
	
	@GetMapping("/cadastrar2")
	public String cadastrar2() {
		return "/pets/cadastro2";
	}
	
	@GetMapping("/contatar")
	public String contato() {
		return "/pets/contato";
	}
	
	@GetMapping("/sobre")
	public String sobre() {
		return "/pets/sobre";
	}
	
	@GetMapping("/servicos")
	public String servicos() {
		return "/pets/servicos";
	}
	
	@GetMapping("/adotar")
	public String adotar() {
		return "/pets/adocao";
	}
	
	@GetMapping("/animal")
	public String animal() {
		return "/pets/animal";
	}
	
}

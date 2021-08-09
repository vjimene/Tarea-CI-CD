package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.interfacesService.IFormularioService;
import com.example.demo.model.Formulario;

@Controller
@RequestMapping
public class HomeController {
	
	@Autowired
	private IFormularioService s;

	@GetMapping(value= {"/cancelar"})
	public String candelar(Model model) {
		return "redirect:/";
	}
	
	@GetMapping("/new")
	public String crearFormulario(Model model) {
		model.addAttribute("form", new Formulario());
		return "Formulario";
	}
	
	@PostMapping("/save")
	public String guardarFormulario(@Validated Formulario f, Model model) {
		s.guardar(f);
		return "redirect:/";
	}
	
	@GetMapping(value={"", "/"})
	public String listar(Model model) {
		List<Formulario> formulario = s.mostrar();
		model.addAttribute("form", formulario);
		return "index";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional <Formulario> formulario = s.mostrarById(id);
		model.addAttribute("form", formulario);
		return "Formulario";
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminar(@PathVariable int id, Model model) {
		s.eliminar(id);
		return "redirect:/";
	}
	

}

package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.IFormulario;
import com.example.demo.interfacesService.IFormularioService;
import com.example.demo.model.Formulario;

@Service
public class FormularioService implements IFormularioService{
	
	@Autowired
	private IFormulario datos;

	@Override
	public List<Formulario>mostrar() {
		return (List<Formulario>) datos.findAll();
	}

	@Override
	public Optional<Formulario> mostrarById(int id) {
		return datos.findById(id);
	}

	@Override
	public int guardar(Formulario f) {
		int respuesta = 0;
		Formulario form = datos.save(f);
		if(!form.equals(null)) {
			respuesta = 1;
		}
		return respuesta;
	}

	@Override
	public void eliminar(int id) {
		datos.deleteById(id);
		
	}

}

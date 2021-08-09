package com.example.demo.interfacesService;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Formulario;

@Service
public interface IFormularioService {
	public List<Formulario>mostrar();
	public Optional<Formulario> mostrarById(int id);
	public int guardar(Formulario f);
	public void eliminar(int id);
	
}

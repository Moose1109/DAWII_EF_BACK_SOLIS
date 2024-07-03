package com.ciberproyecto.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciberproyecto.model.Atenciones;
import com.ciberproyecto.repository.IAtencionesRepository;


@Service
public class AtencionesServiceImpl implements AtencionesService {
	
	@Autowired
	private IAtencionesRepository repoAten;

	@Override
	public List<Atenciones> listarAtenciones() {
		// TODO Auto-generated method stub
		return repoAten.findAll();
	}

	@Override
	public Atenciones agregarAtenciones(Atenciones a) {
		return repoAten.save(a);
	}

	@Override
	public List<Atenciones> buscarPorFecha(LocalDate fecha) {
		return repoAten.findByFecha(fecha);
	}

	@Override
	public void eliminarAtencion(int id) {
		repoAten.deleteById(id);
		
	}


}

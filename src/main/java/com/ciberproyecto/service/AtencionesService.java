package com.ciberproyecto.service;

import java.time.LocalDate;
import java.util.List;

import com.ciberproyecto.model.Atenciones;


public interface AtencionesService {

	public List<Atenciones> listarAtenciones();
	
	public Atenciones agregarAtenciones(Atenciones a);
	
	public List<Atenciones> buscarPorFecha(LocalDate fecha);
	
	public void eliminarAtencion (int id);
}

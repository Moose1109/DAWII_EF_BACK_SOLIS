package com.ciberproyecto.service;

import java.util.List;



import com.ciberproyecto.model.Mascotas;

public interface MascotasService {

	//lista de metodos a implementar o trabajar
	
	public List<Mascotas> listarMascotas();
	
	public Mascotas agregarMascotas(Mascotas p);
	
	public Mascotas actualizarMascotas(Mascotas p);
	
	public Mascotas buscarMascotas(int id);
	
	
		
	
	
}
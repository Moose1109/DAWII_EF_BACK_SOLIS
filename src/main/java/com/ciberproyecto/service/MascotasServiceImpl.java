package com.ciberproyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ciberproyecto.model.Mascotas;
import com.ciberproyecto.repository.IMascotasRepository;

@Service
public class MascotasServiceImpl  implements MascotasService {
	
	@Autowired
	private IMascotasRepository repoMas;
	
	
	@Override
	public List<Mascotas> listarMascotas(){
		//TODO Auto-generated method stub
		return repoMas.findAll();
	}


	@Override
	public Mascotas agregarMascotas(Mascotas p) {
		// TODO Auto-generated method stub
		return repoMas.save(p);
	}


	@Override
	public Mascotas buscarMascotas(int id) {
		// TODO Auto-generated method stub
		return repoMas.findById(id).get();
	}

	@Override
	public Mascotas actualizarMascotas(Mascotas p) {
		// TODO Auto-generated method stub
		return repoMas.save(p);
	}



	
	
	




}

package com.ciberproyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciberproyecto.model.TipoMascota;
import com.ciberproyecto.repository.ITipoMascotaRepository;


@Service
public class TipoMascotaServiceImpl implements TipoMascotaService {

	@Autowired
	private ITipoMascotaRepository repoTipMas;
	
	@Override
	public List<TipoMascota> listarTipoMascota() {
		// TODO Auto-generated method stub
		return repoTipMas.findAll();
	}

}

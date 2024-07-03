package com.ciberproyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciberproyecto.model.TipoAtencion;

import com.ciberproyecto.repository.ITipoAtencionRepository;

@Service
public class TipoAtencionServiceImpl implements TipoAtencionService{

	@Autowired
	private ITipoAtencionRepository repoTipAten;

	@Override
	public List<TipoAtencion> listarTipoAtencion() {
		// TODO Auto-generated method stub
		return repoTipAten.findAll();
	}
	



}

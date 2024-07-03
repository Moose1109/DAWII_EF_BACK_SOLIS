package com.ciberproyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciberproyecto.model.TipoAtencion;
import com.ciberproyecto.service.TipoAtencionService;

@RestController
@RequestMapping("/api/tipoAtencion")
@CrossOrigin(origins = "http://localhost:4200")
public class TipoAtencionControlller {
	
	@Autowired
	private TipoAtencionService service;
	@GetMapping
	public ResponseEntity<List<TipoAtencion>> listarTipoAtencion() {
		return ResponseEntity.ok(service.listarTipoAtencion());
	}
}

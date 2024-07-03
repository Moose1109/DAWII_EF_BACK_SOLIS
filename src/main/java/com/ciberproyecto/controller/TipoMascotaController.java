package com.ciberproyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciberproyecto.model.TipoMascota;
import com.ciberproyecto.service.TipoMascotaService;

@RestController
@RequestMapping("/api/tipoMascotas")
@CrossOrigin(origins = "http://localhost:4200")
public class TipoMascotaController {
	
	@Autowired
	private TipoMascotaService service ;
	@GetMapping
	public ResponseEntity<List<TipoMascota>> listarTipoMascota() {
		return ResponseEntity.ok(service.listarTipoMascota());
	}
}

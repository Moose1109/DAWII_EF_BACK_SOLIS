package com.ciberproyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ciberproyecto.model.Mascotas;
import com.ciberproyecto.repository.IMascotasRepository;
import com.ciberproyecto.service.MascotasService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/mascotas")
@CrossOrigin(origins = "http://localhost:4200")
public class MascotasController {
	
	@Autowired
	private MascotasService service;
	
	@GetMapping
	public ResponseEntity<List<Mascotas>> listarMascotas() {
		return ResponseEntity.ok(service.listarMascotas());
	}
	

	@PostMapping
	public ResponseEntity<Mascotas> agregarMascotas(@RequestBody Mascotas mascotas) {
		Mascotas nuevo = service.agregarMascotas(mascotas);		
		return new ResponseEntity<>(nuevo, HttpStatus.CREATED);
	}

	


	@PutMapping("/{id}")
	public ResponseEntity<Mascotas> actualizar(	@PathVariable int id, @RequestBody Mascotas mascotas) {

		Mascotas m = service.buscarMascotas(id);
		
		m.setNomMascota(mascotas.getNomMascota());
		m.setNomDueno(mascotas.getNomDueno());
		m.setPeso(mascotas.getPeso());
		m.setIdtipoMascotas(mascotas.getIdtipoMascotas());


		service.actualizarMascotas(m);

		return new ResponseEntity<>(m, HttpStatus.CREATED);

	}
	
	
	
	
}

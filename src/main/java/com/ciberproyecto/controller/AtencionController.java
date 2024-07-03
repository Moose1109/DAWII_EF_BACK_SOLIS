package com.ciberproyecto.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciberproyecto.model.Atenciones;
import com.ciberproyecto.model.Mascotas;
import com.ciberproyecto.model.TipoAtencion;
import com.ciberproyecto.service.AtencionesService;
import com.ciberproyecto.service.TipoAtencionService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/atencion")
@CrossOrigin(origins = "http://localhost:4200")
public class AtencionController {

	@Autowired
	private AtencionesService service;
	
	@GetMapping
	public ResponseEntity<List<Atenciones>> listarAtencion() {
		return ResponseEntity.ok(service.listarAtenciones());
	}
	

	@PostMapping
	public ResponseEntity<Atenciones> agregarAtenciones(@RequestBody Atenciones atenciones) {
		Atenciones nuevo = service.agregarAtenciones(atenciones);		
		return new ResponseEntity<>(nuevo, HttpStatus.CREATED);
	}

	

	@GetMapping("/buscarPorFecha/{fecha}")
    public ResponseEntity<List<Atenciones>> buscarPorFecha(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fecha) {
        List<Atenciones> resultados = service.buscarPorFecha(fecha);
        return ResponseEntity.ok().body(resultados);
    }
	

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminarAtenciones(@PathVariable int id) {
		
		try {
			service.eliminarAtencion(id);
			return ResponseEntity.ok().build();
		}catch(Exception e)  {
			return ResponseEntity.notFound().build();
		}
		
		
	}

	

	
	

}

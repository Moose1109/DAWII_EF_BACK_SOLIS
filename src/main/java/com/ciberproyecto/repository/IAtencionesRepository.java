package com.ciberproyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ciberproyecto.model.Atenciones;
import java.util.List;
import java.time.LocalDate;

@Repository
public interface IAtencionesRepository  extends JpaRepository<Atenciones, Integer>{

	List<Atenciones> findByFecha(LocalDate fecha);
}

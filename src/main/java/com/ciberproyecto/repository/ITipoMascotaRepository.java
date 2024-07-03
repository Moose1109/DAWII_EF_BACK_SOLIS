package com.ciberproyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ciberproyecto.model.TipoMascota;

@Repository
public interface ITipoMascotaRepository extends JpaRepository<TipoMascota, Integer>{

}

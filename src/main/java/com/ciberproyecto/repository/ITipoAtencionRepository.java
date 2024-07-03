package com.ciberproyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.ciberproyecto.model.TipoAtencion;

@Repository
public interface ITipoAtencionRepository extends JpaRepository<TipoAtencion,Integer>{


}

package com.ciberproyecto.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ciberproyecto.model.Mascotas;

@Repository
public interface IMascotasRepository extends JpaRepository<Mascotas	,Integer>{

	

}

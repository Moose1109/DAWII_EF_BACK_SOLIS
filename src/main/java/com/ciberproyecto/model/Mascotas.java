package com.ciberproyecto.model;


import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Table(name="tb_mascotas")
@Data
public class Mascotas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_mascotas" )
	private int codMascota ;

	@Column(name="nombre_mascota" )
	private String nomMascota;
	
	@Column(name="nombre_dueno" )
	private String nomDueno ;
	
	@Column(name="peso_de_mascota" )
	private BigDecimal  peso ;
	
	@Column(name="tipo_de_mascota" )
	private int idtipoMascotas ;


	
	@ManyToOne
	@JoinColumn(name="tipo_de_mascota",updatable = false , insertable = false)
	private TipoMascota objTipoMascota;
}
package com.ciberproyecto.model;

import java.time.LocalDate;
import java.time.LocalTime;

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
@Table(name ="tb_atenciones")
@Data
public class Atenciones {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_atencion")
	private int codAtencion;
	
	@Column(name = "cod_mascotas")
	private int codMascota;
	
	@Column(name = "tipo_atencion")
	private int idtipoAtencion;

	@Column(name = "fecha_atencion")
	private LocalDate fecha;

	private LocalTime hora;

	private int estado;
	
	@ManyToOne
	@JoinColumn(name="cod_mascotas",updatable = false , insertable = false)
	private Mascotas objMascota;
	
	@ManyToOne
	@JoinColumn(name="tipo_atencion",updatable = false , insertable = false)
	private TipoAtencion objTipoAtencion;
}

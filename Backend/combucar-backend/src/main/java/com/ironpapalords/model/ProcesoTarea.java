package com.ironpapalords.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;


/**
 * The persistent class for the PROCESO_VS_TAREAS database table.
 */
@Data
@Entity
@Table(name = "PROCESO_VS_TAREAS")
public class ProcesoTarea implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ProcesoTareaPK id;

	@Column(name = "ORDEN", nullable = false, precision = 10, scale = 2)
	private BigDecimal orden;

	//bi-directional many-to-one association to Proceso
	@ManyToOne
	@JoinColumn(name = "ID_PROCESO", nullable = false, insertable = false, updatable = false)
	private Proceso proceso;

	//bi-directional many-to-one association to Tarea
	@ManyToOne
	@JoinColumn(name = "ID_TAREA", nullable = false, insertable = false, updatable = false)
	private Tarea tarea;
	
}
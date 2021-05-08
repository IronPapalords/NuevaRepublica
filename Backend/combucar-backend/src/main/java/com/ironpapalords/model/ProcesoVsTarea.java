package com.ironpapalords.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PROCESO_VS_TAREAS database table.
 * 
 */
@Entity
@Table(name="PROCESO_VS_TAREAS")
@NamedQuery(name="ProcesoVsTarea.findAll", query="SELECT p FROM ProcesoVsTarea p")
public class ProcesoVsTarea implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ProcesoVsTareaPK id;

	@Column(name="ORDEN", nullable=false, precision=10, scale=2)
	private BigDecimal orden;

	//bi-directional many-to-one association to Proceso
	@ManyToOne
	@JoinColumn(name="ID_PROCESO", nullable=false, insertable=false, updatable=false)
	private Proceso proceso;

	//bi-directional many-to-one association to Tarea
	@ManyToOne
	@JoinColumn(name="ID_TAREA", nullable=false, insertable=false, updatable=false)
	private Tarea tarea;

	public ProcesoVsTarea() {
	}

	public ProcesoVsTareaPK getId() {
		return this.id;
	}

	public void setId(ProcesoVsTareaPK id) {
		this.id = id;
	}

	public BigDecimal getOrden() {
		return this.orden;
	}

	public void setOrden(BigDecimal orden) {
		this.orden = orden;
	}

	public Proceso getProceso() {
		return this.proceso;
	}

	public void setProceso(Proceso proceso) {
		this.proceso = proceso;
	}

	public Tarea getTarea() {
		return this.tarea;
	}

	public void setTarea(Tarea tarea) {
		this.tarea = tarea;
	}

}
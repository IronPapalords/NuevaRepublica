package com.ironpapalords.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the PROCESO_VS_TAREAS database table.
 */
@Data
@Embeddable
public class ProcesoTareaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name = "ID_PROCESO", insertable = false, updatable = false, unique = true, nullable = false)
	private int idProceso;

	@Column(name = "ID_TAREA", insertable = false, updatable = false, unique = true, nullable = false)
	private int idTarea;

}
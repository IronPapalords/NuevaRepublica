package com.ironpapalords.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the SECCION database table.
 */
@Data
@Embeddable
public class SeccionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name = "ID_TAREA", insertable = false, updatable = false, unique = true, nullable = false)
	private int idTarea;

	@Column(name = "ID_SECCION", unique = true, nullable = false)
	private int idSeccion;

}
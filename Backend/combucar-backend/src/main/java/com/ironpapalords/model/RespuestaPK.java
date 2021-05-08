package com.ironpapalords.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the RESPUESTAS database table.
 * 
 */
@Embeddable
public class RespuestaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ID_TAREA", insertable=false, updatable=false, unique=true, nullable=false)
	private int idTarea;

	@Column(name="ID_SECCION", insertable=false, updatable=false, unique=true, nullable=false)
	private int idSeccion;

	@Column(name="ID_FORMULARIO", insertable=false, updatable=false, unique=true, nullable=false)
	private int idFormulario;

	public RespuestaPK() {
	}
	public int getIdTarea() {
		return this.idTarea;
	}
	public void setIdTarea(int idTarea) {
		this.idTarea = idTarea;
	}
	public int getIdSeccion() {
		return this.idSeccion;
	}
	public void setIdSeccion(int idSeccion) {
		this.idSeccion = idSeccion;
	}
	public int getIdFormulario() {
		return this.idFormulario;
	}
	public void setIdFormulario(int idFormulario) {
		this.idFormulario = idFormulario;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RespuestaPK)) {
			return false;
		}
		RespuestaPK castOther = (RespuestaPK)other;
		return 
			(this.idTarea == castOther.idTarea)
			&& (this.idSeccion == castOther.idSeccion)
			&& (this.idFormulario == castOther.idFormulario);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idTarea;
		hash = hash * prime + this.idSeccion;
		hash = hash * prime + this.idFormulario;
		
		return hash;
	}
}
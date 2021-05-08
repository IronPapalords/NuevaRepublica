package com.ironpapalords.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the SECCION database table.
 * 
 */
@Embeddable
public class SeccionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ID_TAREA", insertable=false, updatable=false, unique=true, nullable=false)
	private int idTarea;

	@Column(name="ID_SECCION", unique=true, nullable=false)
	private int idSeccion;

	public SeccionPK() {
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SeccionPK)) {
			return false;
		}
		SeccionPK castOther = (SeccionPK)other;
		return 
			(this.idTarea == castOther.idTarea)
			&& (this.idSeccion == castOther.idSeccion);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idTarea;
		hash = hash * prime + this.idSeccion;
		
		return hash;
	}
}
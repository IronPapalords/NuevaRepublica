package com.ironpapalords.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the PROCESO_VS_TAREAS database table.
 * 
 */
@Embeddable
public class ProcesoVsTareaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ID_PROCESO", insertable=false, updatable=false, unique=true, nullable=false)
	private int idProceso;

	@Column(name="ID_TAREA", insertable=false, updatable=false, unique=true, nullable=false)
	private int idTarea;

	public ProcesoVsTareaPK() {
	}
	public int getIdProceso() {
		return this.idProceso;
	}
	public void setIdProceso(int idProceso) {
		this.idProceso = idProceso;
	}
	public int getIdTarea() {
		return this.idTarea;
	}
	public void setIdTarea(int idTarea) {
		this.idTarea = idTarea;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProcesoVsTareaPK)) {
			return false;
		}
		ProcesoVsTareaPK castOther = (ProcesoVsTareaPK)other;
		return 
			(this.idProceso == castOther.idProceso)
			&& (this.idTarea == castOther.idTarea);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idProceso;
		hash = hash * prime + this.idTarea;
		
		return hash;
	}
}
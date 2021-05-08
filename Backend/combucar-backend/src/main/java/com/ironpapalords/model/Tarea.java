package com.ironpapalords.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TAREAS database table.
 * 
 */
@Entity
@Table(name="TAREAS")
@NamedQuery(name="Tarea.findAll", query="SELECT t FROM Tarea t")
public class Tarea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_TAREA", unique=true, nullable=false)
	private int idTarea;

	@Column(name="NOMBRE", nullable=false, length=50)
	private String nombre;

	//bi-directional many-to-one association to ProcesoVsTarea
	@OneToMany(mappedBy="tarea", fetch=FetchType.EAGER)
	private List<ProcesoVsTarea> procesoVsTareas;

	//bi-directional many-to-one association to Seccion
	@OneToMany(mappedBy="tarea", fetch=FetchType.EAGER)
	private List<Seccion> seccions;

	public Tarea() {
	}

	public int getIdTarea() {
		return this.idTarea;
	}

	public void setIdTarea(int idTarea) {
		this.idTarea = idTarea;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<ProcesoVsTarea> getProcesoVsTareas() {
		return this.procesoVsTareas;
	}

	public void setProcesoVsTareas(List<ProcesoVsTarea> procesoVsTareas) {
		this.procesoVsTareas = procesoVsTareas;
	}

	public ProcesoVsTarea addProcesoVsTarea(ProcesoVsTarea procesoVsTarea) {
		getProcesoVsTareas().add(procesoVsTarea);
		procesoVsTarea.setTarea(this);

		return procesoVsTarea;
	}

	public ProcesoVsTarea removeProcesoVsTarea(ProcesoVsTarea procesoVsTarea) {
		getProcesoVsTareas().remove(procesoVsTarea);
		procesoVsTarea.setTarea(null);

		return procesoVsTarea;
	}

	public List<Seccion> getSeccions() {
		return this.seccions;
	}

	public void setSeccions(List<Seccion> seccions) {
		this.seccions = seccions;
	}

	public Seccion addSeccion(Seccion seccion) {
		getSeccions().add(seccion);
		seccion.setTarea(this);

		return seccion;
	}

	public Seccion removeSeccion(Seccion seccion) {
		getSeccions().remove(seccion);
		seccion.setTarea(null);

		return seccion;
	}

}
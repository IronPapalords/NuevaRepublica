package com.ironpapalords.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the PROCESO database table.
 * 
 */
@Entity
@Table(name="PROCESO")
@NamedQuery(name="Proceso.findAll", query="SELECT p FROM Proceso p")
public class Proceso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_PROCESO", unique=true, nullable=false)
	private int idProceso;

	@Column(name="NOMBRE", length=50)
	private String nombre;

	//bi-directional many-to-one association to Operacion
	@OneToMany(mappedBy="proceso", fetch=FetchType.EAGER)
	private List<Operacion> operacions;

	//bi-directional many-to-one association to ProcesoVsTarea
	@OneToMany(mappedBy="proceso", fetch=FetchType.EAGER)
	private List<ProcesoVsTarea> procesoVsTareas;

	public Proceso() {
	}

	public int getIdProceso() {
		return this.idProceso;
	}

	public void setIdProceso(int idProceso) {
		this.idProceso = idProceso;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Operacion> getOperacions() {
		return this.operacions;
	}

	public void setOperacions(List<Operacion> operacions) {
		this.operacions = operacions;
	}

	public Operacion addOperacion(Operacion operacion) {
		getOperacions().add(operacion);
		operacion.setProceso(this);

		return operacion;
	}

	public Operacion removeOperacion(Operacion operacion) {
		getOperacions().remove(operacion);
		operacion.setProceso(null);

		return operacion;
	}

	public List<ProcesoVsTarea> getProcesoVsTareas() {
		return this.procesoVsTareas;
	}

	public void setProcesoVsTareas(List<ProcesoVsTarea> procesoVsTareas) {
		this.procesoVsTareas = procesoVsTareas;
	}

	public ProcesoVsTarea addProcesoVsTarea(ProcesoVsTarea procesoVsTarea) {
		getProcesoVsTareas().add(procesoVsTarea);
		procesoVsTarea.setProceso(this);

		return procesoVsTarea;
	}

	public ProcesoVsTarea removeProcesoVsTarea(ProcesoVsTarea procesoVsTarea) {
		getProcesoVsTareas().remove(procesoVsTarea);
		procesoVsTarea.setProceso(null);

		return procesoVsTarea;
	}

}
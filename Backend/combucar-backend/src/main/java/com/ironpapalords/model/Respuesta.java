package com.ironpapalords.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the RESPUESTAS database table.
 * 
 */
@Entity
@Table(name="RESPUESTAS")
@NamedQuery(name="Respuesta.findAll", query="SELECT r FROM Respuesta r")
public class Respuesta implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RespuestaPK id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA_RESPUESTA")
	private Date fechaRespuesta;

	@Column(name="OBSERVACIONES", length=2500)
	private String observaciones;

	@Column(name="RESPUESTA", length=30)
	private String respuesta;

	//bi-directional many-to-one association to Archivo
	@ManyToOne
	@JoinColumn(name="ID_ARCHIVO")
	private Archivo archivo;

	//bi-directional many-to-one association to Formulario
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="ID_FORMULARIO", referencedColumnName="ID_FORMULARIO", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="ID_SECCION", referencedColumnName="ID_SECCION", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="ID_TAREA", referencedColumnName="ID_TAREA", nullable=false, insertable=false, updatable=false)
		})
	private Formulario formulario;

	//bi-directional many-to-one association to Operacion
	@ManyToOne
	@JoinColumn(name="ID_OPERACION", nullable=false)
	private Operacion operacion;

	//bi-directional many-to-one association to Operadore
	@ManyToOne
	@JoinColumn(name="ID_OPERADOR", nullable=false)
	private Operadore operadore;

	public Respuesta() {
	}

	public RespuestaPK getId() {
		return this.id;
	}

	public void setId(RespuestaPK id) {
		this.id = id;
	}

	public Date getFechaRespuesta() {
		return this.fechaRespuesta;
	}

	public void setFechaRespuesta(Date fechaRespuesta) {
		this.fechaRespuesta = fechaRespuesta;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getRespuesta() {
		return this.respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public Archivo getArchivo() {
		return this.archivo;
	}

	public void setArchivo(Archivo archivo) {
		this.archivo = archivo;
	}

	public Formulario getFormulario() {
		return this.formulario;
	}

	public void setFormulario(Formulario formulario) {
		this.formulario = formulario;
	}

	public Operacion getOperacion() {
		return this.operacion;
	}

	public void setOperacion(Operacion operacion) {
		this.operacion = operacion;
	}

	public Operadore getOperadore() {
		return this.operadore;
	}

	public void setOperadore(Operadore operadore) {
		this.operadore = operadore;
	}

}
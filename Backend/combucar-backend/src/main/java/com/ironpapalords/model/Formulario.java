package com.ironpapalords.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the FORMULARIO database table.
 * 
 */
@Entity
@Table(name="FORMULARIO")
@NamedQuery(name="Formulario.findAll", query="SELECT f FROM Formulario f")
public class Formulario implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FormularioPK id;

	@Column(name="DESCRIPCION", length=250)
	private String descripcion;

	@Column(name="NOMBRE", length=100)
	private String nombre;

	@Column(name="TIPO", length=20)
	private String tipo;

	//bi-directional many-to-one association to Seccion
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="ID_SECCION", referencedColumnName="ID_SECCION", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="ID_TAREA", referencedColumnName="ID_TAREA", nullable=false, insertable=false, updatable=false)
		})
	private Seccion seccion;

	//bi-directional many-to-one association to Respuesta
	@OneToMany(mappedBy="formulario", fetch=FetchType.EAGER)
	private List<Respuesta> respuestas;

	public Formulario() {
	}

	public FormularioPK getId() {
		return this.id;
	}

	public void setId(FormularioPK id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Seccion getSeccion() {
		return this.seccion;
	}

	public void setSeccion(Seccion seccion) {
		this.seccion = seccion;
	}

	public List<Respuesta> getRespuestas() {
		return this.respuestas;
	}

	public void setRespuestas(List<Respuesta> respuestas) {
		this.respuestas = respuestas;
	}

	public Respuesta addRespuesta(Respuesta respuesta) {
		getRespuestas().add(respuesta);
		respuesta.setFormulario(this);

		return respuesta;
	}

	public Respuesta removeRespuesta(Respuesta respuesta) {
		getRespuestas().remove(respuesta);
		respuesta.setFormulario(null);

		return respuesta;
	}

}
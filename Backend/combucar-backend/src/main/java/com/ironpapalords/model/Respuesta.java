package com.ironpapalords.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the RESPUESTAS database table.
 */
@Data
@Entity
@Table(name = "RESPUESTAS")
public class Respuesta implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RespuestaPK id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FECHA_RESPUESTA")
	private Date fechaRespuesta;

	@Column(name = "OBSERVACIONES", length = 2500)
	private String observaciones;

	@Column(name = "RESPUESTA", length = 30)
	private String respuesta;

	//bi-directional many-to-one association to Archivo
	@ManyToOne
	@JoinColumn(name = "ID_ARCHIVO")
	private Archivo archivo;

	//bi-directional many-to-one association to Formulario
	@ManyToOne
	@JoinColumns({
			@JoinColumn(name = "ID_FORMULARIO", referencedColumnName = "ID_FORMULARIO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "ID_SECCION", referencedColumnName = "ID_SECCION", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "ID_TAREA", referencedColumnName = "ID_TAREA", nullable = false, insertable = false, updatable = false)
	})
	private Formulario formulario;

	//bi-directional many-to-one association to Operacion
	@ManyToOne
	@JoinColumn(name = "ID_OPERACION", nullable = false)
	private Operacion operacion;

	//bi-directional many-to-one association to Operadore
	@ManyToOne
	@JoinColumn(name = "ID_OPERADOR", nullable = false)
	private Operador operador;

}
package com.ironpapalords.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the FORMULARIO database table.
 */
@Data
@Entity
@Table(name = "FORMULARIO")
public class Formulario implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FormularioPK id;

	@Column(name = "DESCRIPCION", length = 250)
	private String descripcion;

	@Column(name = "NOMBRE", length = 100)
	private String nombre;

	@Column(name = "TIPO", length = 20)
	private String tipo;

	//bi-directional many-to-one association to Seccion
	@ManyToOne
	@JoinColumns({
			@JoinColumn(name = "ID_SECCION", referencedColumnName = "ID_SECCION", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "ID_TAREA", referencedColumnName = "ID_TAREA", nullable = false, insertable = false, updatable = false)
	})
	private Seccion seccion;

	//bi-directional many-to-one association to Respuesta
	@OneToMany(mappedBy = "formulario", fetch = FetchType.EAGER)
	private List<Respuesta> respuestas;

}
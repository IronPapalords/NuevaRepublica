package com.ironpapalords.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the SECCION database table.
 */
@Data
@Entity
@Table(name = "SECCION")
public class Seccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SeccionPK id;

	@Column(name = "NOMBRE", nullable = false, length = 50)
	private String nombre;

	@Column(name = "ORDEN", nullable = false, precision = 10, scale = 2)
	private BigDecimal orden;

	//bi-directional many-to-one association to Formulario
	@OneToMany(mappedBy = "seccion", fetch = FetchType.EAGER)
	private List<Formulario> formularios;

	//bi-directional many-to-many association to Role
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			name = "ROLES_VS_SECCION"
			, joinColumns = {
			@JoinColumn(name = "ID_SECCION", referencedColumnName = "ID_SECCION", nullable = false),
			@JoinColumn(name = "ID_TAREA", referencedColumnName = "ID_TAREA", nullable = false)
	}
			, inverseJoinColumns = {
			@JoinColumn(name = "ID_ROL", nullable = false)
	}
	)
	private List<Rol> roles;

	//bi-directional many-to-one association to Tarea
	@ManyToOne
	@JoinColumn(name = "ID_TAREA", nullable = false, insertable = false, updatable = false)
	private Tarea tarea;

}
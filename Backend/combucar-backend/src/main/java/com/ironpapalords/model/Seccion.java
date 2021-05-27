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

	//bi-directional many-to-one association to Tarea
	@ManyToOne
	@JoinColumn(name = "ID_TAREA", nullable = false, insertable = false, updatable = false)
	private Tarea tarea;

}
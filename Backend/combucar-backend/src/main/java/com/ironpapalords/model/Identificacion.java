package com.ironpapalords.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the IDENTIFICACION database table.
 */
@Data
@Entity
@Table(name = "IDENTIFICACION")
public class Identificacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_IDENTIFICACION", unique = true, nullable = false)
	private int idIdentificacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FECHA_PRESENTADA", nullable = false)
	private Date fechaPresentada;

	@Column(name = "REFERENCIA", nullable = false, length = 30)
	private String referencia;

	@Column(name = "TIPO", nullable = false)
	private int tipo;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name = "ID_CLIENTE", nullable = false)
	private Cliente cliente;

}
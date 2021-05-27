package com.ironpapalords.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the CILINDROS database table.
 */
@Data
@Entity
@Table(name = "CILINDROS")
public class Cilindro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_CILINDRO", unique = true, nullable = false)
	private int idCilindro;

	@Column(name = "CAPACIDAD")
	private int capacidad;

	@Temporal(TemporalType.DATE)
	@Column(name = "FECHA_FABRICACION")
	private Date fechaFabricacion;

	@Column(name = "MARCA", length = 45)
	private String marca;

	@Column(name = "SERIE", length = 45)
	private String serie;

	//bi-directional many-to-one association to KitConversion
	@ManyToOne
	@JoinColumn(name = "KIT_CONVERSION_ID_KIT_CONVERSION", nullable = false)
	private KitConversion kitConversion;

}
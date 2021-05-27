package com.ironpapalords.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * The persistent class for the UNIDADES database table.
 */
@Data
@Entity
@Table(name = "UNIDADES")
public class Unidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_UNIDAD", unique = true, nullable = false)
	private int idUnidad;

	@Column(name = "ECO", length = 30)
	private String eco;

	@Column(name = "KILOMETRAJE")
	private int kilometraje;

	@Column(name = "MPFI", length = 30)
	private String mpfi;

	@Column(name = "PLACAS", length = 15)
	private String placas;

	@Column(name = "SERIE", length = 17)
	private String serie;

	@Column(name = "SPI", length = 30)
	private String spi;

	@Column(name = "TIPO", length = 30)
	private String tipo;

	//bi-directional many-to-one association to Operacion
	@OneToMany(mappedBy = "unidad", fetch = FetchType.EAGER)
	private List<Operacion> operaciones;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name = "ID_CLIENTE", nullable = false)
	private Cliente cliente;

	//bi-directional many-to-one association to KitConversion
	@ManyToOne
	@JoinColumn(name = "ID_KIT_CONVERSION")
	private KitConversion kitConversion;

	//bi-directional many-to-one association to MarcasVehiculo
	@ManyToOne
	@JoinColumn(name = "ID_MARCA", nullable = false)
	private MarcasVehiculo marcasVehiculo;

}
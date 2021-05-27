package com.ironpapalords.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the MARCAS_VEHICULOS database table.
 */
@Data
@Entity
@Table(name = "MARCAS_VEHICULOS")
public class MarcasVehiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_MARCA", unique = true, nullable = false)
	private int idMarca;

	@Column(name = "NOMBRE", length = 30)
	private String nombre;

	//bi-directional many-to-one association to Unidade
	@OneToMany(mappedBy = "marcasVehiculo", fetch = FetchType.EAGER)
	private List<Unidad> unidades;

}
package com.ironpapalords.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the TALLER database table.
 */
@Data
@Entity
@Table(name = "TALLER")
public class Taller implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_TALLER", unique = true, nullable = false)
	private int idTaller;

	@Column(name = "DIRECCION", length = 250)
	private String direccion;

	@Column(name = "NOMBRE", length = 100)
	private String nombre;

	//bi-directional many-to-one association to Operacion
	@OneToMany(mappedBy = "taller", fetch = FetchType.EAGER)
	private List<Operacion> operaciones;

	//bi-directional many-to-one association to Operador
	@OneToMany(mappedBy = "taller", fetch = FetchType.EAGER)
	private List<Operador> operadores;

}
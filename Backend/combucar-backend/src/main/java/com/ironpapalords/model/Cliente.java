package com.ironpapalords.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the CLIENTES database table.
 */
@Data
@Entity
@Table(name = "CLIENTES")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_CLIENTE", unique = true, nullable = false)
	private int idCliente;

	@Column(name = "CIUDAD", length = 30)
	private String ciudad;

	@Column(name = "DIRECCION", length = 250)
	private String direccion;

	@Column(name = "NOMBRE", nullable = false, length = 120)
	private String nombre;

	@Column(name = "RFC", length = 20)
	private String rfc;

	//bi-directional many-to-one association to Contacto
	@ManyToOne
	@JoinColumn(name = "ID_CONTACTO")
	private Contacto contacto;

	//bi-directional many-to-one association to Responsable
	@ManyToOne
	@JoinColumn(name = "ID_RESPONSABLE")
	private Responsable responsable;

	//bi-directional many-to-one association to Identificacion
	@OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
	private List<Identificacion> identificaciones;

	//bi-directional many-to-one association to Unidad
	@OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
	private List<Unidad> unidades;

}
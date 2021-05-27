package com.ironpapalords.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the RESPONSABLE database table.
 */
@Data
@Entity
@Table(name = "RESPONSABLE")
public class Responsable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_RESPONSABLE", unique = true, nullable = false)
	private int idResponsable;

	@Column(name = "NOMBRE", nullable = false, length = 120)
	private String nombre;

	//bi-directional many-to-one association to Cliente
	@OneToMany(mappedBy = "responsable", fetch = FetchType.EAGER)
	private List<Cliente> clientes;

	//bi-directional many-to-one association to Contacto
	@ManyToOne
	@JoinColumn(name = "ID_CONTACTO")
	private Contacto contacto;

}
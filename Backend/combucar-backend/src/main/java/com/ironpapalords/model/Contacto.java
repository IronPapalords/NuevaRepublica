package com.ironpapalords.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the CONTACTO database table.
 */
@Data
@Entity
@Table(name = "CONTACTO")
public class Contacto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_CONTACTO", unique = true, nullable = false)
	private int idContacto;

	@Column(name = "CELULAR", length = 10)
	private String celular;

	@Column(name = "CORREO", length = 150)
	private String correo;

	@Column(name = "TELEFONO", length = 10)
	private String telefono;

}
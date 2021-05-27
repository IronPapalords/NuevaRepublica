package com.ironpapalords.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the ROLES database table.
 */
@Data
@Entity
@Table(name = "ROLES")
public class Rol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_ROL", unique = true, nullable = false)
	private int idRol;

	@Column(name = "NOMBRE", length = 30)
	private String nombre;

}
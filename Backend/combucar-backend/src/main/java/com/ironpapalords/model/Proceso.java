package com.ironpapalords.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the PROCESO database table.
 */
@Data
@Entity
@Table(name = "PROCESO")
public class Proceso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_PROCESO", unique = true, nullable = false)
	private int idProceso;

	@Column(name = "NOMBRE", length = 50)
	private String nombre;

}
package com.ironpapalords.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the ARCHIVOS database table.
 */
@Data
@Entity
@Table(name = "ARCHIVOS")
public class Archivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_ARCHIVO", unique = true, nullable = false)
	private int idArchivo;

	@Column(name = "RUTA", length = 250)
	private String ruta;

	//bi-directional many-to-one association to Respuesta
	@OneToMany(mappedBy = "archivo", fetch = FetchType.EAGER)
	private List<Respuesta> respuestas;

}
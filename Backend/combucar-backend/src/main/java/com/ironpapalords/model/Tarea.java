package com.ironpapalords.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the TAREAS database table.
 */
@Data
@Entity
@Table(name = "TAREAS")
public class Tarea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_TAREA", unique = true, nullable = false)
	private int idTarea;

	@Column(name = "NOMBRE", nullable = false, length = 50)
	private String nombre;

	//bi-directional many-to-one association to Seccion
	@OneToMany(mappedBy = "tarea", fetch = FetchType.EAGER)
	private List<Seccion> secciones;

}
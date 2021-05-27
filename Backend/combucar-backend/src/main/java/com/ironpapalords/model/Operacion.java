package com.ironpapalords.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the OPERACION database table.
 */
@Data
@Entity
@Table(name = "OPERACION")
public class Operacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_OPERACION", unique = true, nullable = false)
	private int idOperacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FIN")
	private Date fin;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "INICIO")
	private Date inicio;

	//bi-directional many-to-one association to Proceso
	@ManyToOne
	@JoinColumn(name = "ID_PROCESO", nullable = false)
	private Proceso proceso;

	//bi-directional many-to-one association to Taller
	@ManyToOne
	@JoinColumn(name = "ID_TALLER", nullable = false)
	private Taller taller;

	//bi-directional many-to-one association to Unidade
	@ManyToOne
	@JoinColumn(name = "ID_UNIDAD", nullable = false)
	private Unidad unidad;

	//bi-directional many-to-one association to Respuesta
	@OneToMany(mappedBy = "operacion", fetch = FetchType.EAGER)
	private List<Respuesta> respuestas;

}
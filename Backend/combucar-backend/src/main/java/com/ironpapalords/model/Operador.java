package com.ironpapalords.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the OPERADORES database table.
 */
@Data
@Entity
@Table(name = "OPERADORES")
public class Operador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_OPERADOR", unique = true, nullable = false)
	private int idOperador;

	@Column(name = "NOMBRE", nullable = false, length = 120)
	private String nombre;

	@Column(name = "PUESTO", nullable = false, length = 100)
	private String puesto;

	@Column(name = "TOKEN", nullable = false, length = 10)
	private String token;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ULTIMO_TOKEN", nullable = false)
	private Date ultimoToken;

	//bi-directional many-to-one association to Contacto
	@ManyToOne
	@JoinColumn(name = "ID_CONTACTO")
	private Contacto contacto;

	//bi-directional many-to-one association to Taller
	@ManyToOne
	@JoinColumn(name = "ID_TALLER")
	private Taller taller;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name = "ID_USUARIO", nullable = false)
	private Usuario usuario;

	//bi-directional many-to-one association to Respuesta
	@OneToMany(mappedBy = "operador", fetch = FetchType.EAGER)
	private List<Respuesta> respuestas;

}
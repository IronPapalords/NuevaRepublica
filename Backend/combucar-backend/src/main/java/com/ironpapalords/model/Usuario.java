package com.ironpapalords.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the USUARIOS database table.
 */
@Data
@Entity
@Table(name = "USUARIOS")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_USUARIO", unique = true, nullable = false, length = 30)
	private String idUsuario;

	@Column(name = "CLAVE", nullable = false, length = 180)
	private String clave;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ULTIMO_PASSWORD", nullable = false)
	private Date ultimoPassword;

	//bi-directional many-to-one association to Operador
	@OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER)
	private List<Operador> operadores;

	//bi-directional many-to-one association to Rol
	@ManyToOne
	@JoinColumn(name = "ID_ROL", nullable = false)
	private Rol rol;

}
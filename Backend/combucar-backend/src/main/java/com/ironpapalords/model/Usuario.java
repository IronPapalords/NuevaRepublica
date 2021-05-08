package com.ironpapalords.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the USUARIOS database table.
 * 
 */
@Entity
@Table(name="USUARIOS")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_USUARIO", unique=true, nullable=false, length=30)
	private String idUsuario;

	@Column(name="CLAVE", nullable=false, length=180)
	private String clave;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ULTIMO_PASSWORD", nullable=false)
	private Date ultimoPassword;

	//bi-directional many-to-one association to Operadore
	@OneToMany(mappedBy="usuario", fetch=FetchType.EAGER)
	private List<Operadore> operadores;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="ID_ROL", nullable=false)
	private Role role;

	public Usuario() {
	}

	public String getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Date getUltimoPassword() {
		return this.ultimoPassword;
	}

	public void setUltimoPassword(Date ultimoPassword) {
		this.ultimoPassword = ultimoPassword;
	}

	public List<Operadore> getOperadores() {
		return this.operadores;
	}

	public void setOperadores(List<Operadore> operadores) {
		this.operadores = operadores;
	}

	public Operadore addOperadore(Operadore operadore) {
		getOperadores().add(operadore);
		operadore.setUsuario(this);

		return operadore;
	}

	public Operadore removeOperadore(Operadore operadore) {
		getOperadores().remove(operadore);
		operadore.setUsuario(null);

		return operadore;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
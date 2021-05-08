package com.ironpapalords.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the SECCION database table.
 * 
 */
@Entity
@Table(name="SECCION")
@NamedQuery(name="Seccion.findAll", query="SELECT s FROM Seccion s")
public class Seccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SeccionPK id;

	@Column(name="NOMBRE", nullable=false, length=50)
	private String nombre;

	@Column(name="ORDEN", nullable=false, precision=10, scale=2)
	private BigDecimal orden;

	//bi-directional many-to-one association to Formulario
	@OneToMany(mappedBy="seccion", fetch=FetchType.EAGER)
	private List<Formulario> formularios;

	//bi-directional many-to-many association to Role
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(
		name="ROLES_VS_SECCION"
		, joinColumns={
			@JoinColumn(name="ID_SECCION", referencedColumnName="ID_SECCION", nullable=false),
			@JoinColumn(name="ID_TAREA", referencedColumnName="ID_TAREA", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_ROL", nullable=false)
			}
		)
	private List<Role> roles;

	//bi-directional many-to-one association to Tarea
	@ManyToOne
	@JoinColumn(name="ID_TAREA", nullable=false, insertable=false, updatable=false)
	private Tarea tarea;

	public Seccion() {
	}

	public SeccionPK getId() {
		return this.id;
	}

	public void setId(SeccionPK id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getOrden() {
		return this.orden;
	}

	public void setOrden(BigDecimal orden) {
		this.orden = orden;
	}

	public List<Formulario> getFormularios() {
		return this.formularios;
	}

	public void setFormularios(List<Formulario> formularios) {
		this.formularios = formularios;
	}

	public Formulario addFormulario(Formulario formulario) {
		getFormularios().add(formulario);
		formulario.setSeccion(this);

		return formulario;
	}

	public Formulario removeFormulario(Formulario formulario) {
		getFormularios().remove(formulario);
		formulario.setSeccion(null);

		return formulario;
	}

	public List<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Tarea getTarea() {
		return this.tarea;
	}

	public void setTarea(Tarea tarea) {
		this.tarea = tarea;
	}

}
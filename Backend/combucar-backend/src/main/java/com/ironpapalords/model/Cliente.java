package com.ironpapalords.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the CLIENTES database table.
 * 
 */
@Entity
@Table(name="CLIENTES")
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_CLIENTE", unique=true, nullable=false)
	private int idCliente;

	@Column(name="CIUDAD", length=30)
	private String ciudad;

	@Column(name="DIRECCION", length=250)
	private String direccion;

	@Column(name="NOMBRE", nullable=false, length=120)
	private String nombre;

	@Column(name="RFC", length=20)
	private String rfc;

	//bi-directional many-to-one association to Contacto
	@ManyToOne
	@JoinColumn(name="ID_CONTACTO")
	private Contacto contacto;

	//bi-directional many-to-one association to Responsable
	@ManyToOne
	@JoinColumn(name="ID_RESPONSABLE")
	private Responsable responsable;

	//bi-directional many-to-one association to Identificacion
	@OneToMany(mappedBy="cliente", fetch=FetchType.EAGER)
	private List<Identificacion> identificacions;

	//bi-directional many-to-one association to Unidade
	@OneToMany(mappedBy="cliente", fetch=FetchType.EAGER)
	private List<Unidade> unidades;

	public Cliente() {
	}

	public int getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRfc() {
		return this.rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public Contacto getContacto() {
		return this.contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

	public Responsable getResponsable() {
		return this.responsable;
	}

	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}

	public List<Identificacion> getIdentificacions() {
		return this.identificacions;
	}

	public void setIdentificacions(List<Identificacion> identificacions) {
		this.identificacions = identificacions;
	}

	public Identificacion addIdentificacion(Identificacion identificacion) {
		getIdentificacions().add(identificacion);
		identificacion.setCliente(this);

		return identificacion;
	}

	public Identificacion removeIdentificacion(Identificacion identificacion) {
		getIdentificacions().remove(identificacion);
		identificacion.setCliente(null);

		return identificacion;
	}

	public List<Unidade> getUnidades() {
		return this.unidades;
	}

	public void setUnidades(List<Unidade> unidades) {
		this.unidades = unidades;
	}

	public Unidade addUnidade(Unidade unidade) {
		getUnidades().add(unidade);
		unidade.setCliente(this);

		return unidade;
	}

	public Unidade removeUnidade(Unidade unidade) {
		getUnidades().remove(unidade);
		unidade.setCliente(null);

		return unidade;
	}

}
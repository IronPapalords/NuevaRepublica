package com.ironpapalords.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the RESPONSABLE database table.
 * 
 */
@Entity
@Table(name="RESPONSABLE")
@NamedQuery(name="Responsable.findAll", query="SELECT r FROM Responsable r")
public class Responsable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_RESPONSABLE", unique=true, nullable=false)
	private int idResponsable;

	@Column(name="NOMBRE", nullable=false, length=120)
	private String nombre;

	//bi-directional many-to-one association to Cliente
	@OneToMany(mappedBy="responsable", fetch=FetchType.EAGER)
	private List<Cliente> clientes;

	//bi-directional many-to-one association to Contacto
	@ManyToOne
	@JoinColumn(name="ID_CONTACTO")
	private Contacto contacto;

	public Responsable() {
	}

	public int getIdResponsable() {
		return this.idResponsable;
	}

	public void setIdResponsable(int idResponsable) {
		this.idResponsable = idResponsable;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Cliente addCliente(Cliente cliente) {
		getClientes().add(cliente);
		cliente.setResponsable(this);

		return cliente;
	}

	public Cliente removeCliente(Cliente cliente) {
		getClientes().remove(cliente);
		cliente.setResponsable(null);

		return cliente;
	}

	public Contacto getContacto() {
		return this.contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

}
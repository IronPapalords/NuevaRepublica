package com.ironpapalords.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the CONTACTO database table.
 * 
 */
@Entity
@Table(name="CONTACTO")
@NamedQuery(name="Contacto.findAll", query="SELECT c FROM Contacto c")
public class Contacto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_CONTACTO", unique=true, nullable=false)
	private int idContacto;

	@Column(name="CELULAR", length=10)
	private String celular;

	@Column(name="CORREO", length=150)
	private String correo;

	@Column(name="TELEFONO", length=10)
	private String telefono;

	//bi-directional many-to-one association to Cliente
	@OneToMany(mappedBy="contacto", fetch=FetchType.EAGER)
	private List<Cliente> clientes;

	//bi-directional many-to-one association to Operadore
	@OneToMany(mappedBy="contacto", fetch=FetchType.EAGER)
	private List<Operadore> operadores;

	//bi-directional many-to-one association to Responsable
	@OneToMany(mappedBy="contacto", fetch=FetchType.EAGER)
	private List<Responsable> responsables;

	public Contacto() {
	}

	public int getIdContacto() {
		return this.idContacto;
	}

	public void setIdContacto(int idContacto) {
		this.idContacto = idContacto;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Cliente addCliente(Cliente cliente) {
		getClientes().add(cliente);
		cliente.setContacto(this);

		return cliente;
	}

	public Cliente removeCliente(Cliente cliente) {
		getClientes().remove(cliente);
		cliente.setContacto(null);

		return cliente;
	}

	public List<Operadore> getOperadores() {
		return this.operadores;
	}

	public void setOperadores(List<Operadore> operadores) {
		this.operadores = operadores;
	}

	public Operadore addOperadore(Operadore operadore) {
		getOperadores().add(operadore);
		operadore.setContacto(this);

		return operadore;
	}

	public Operadore removeOperadore(Operadore operadore) {
		getOperadores().remove(operadore);
		operadore.setContacto(null);

		return operadore;
	}

	public List<Responsable> getResponsables() {
		return this.responsables;
	}

	public void setResponsables(List<Responsable> responsables) {
		this.responsables = responsables;
	}

	public Responsable addResponsable(Responsable responsable) {
		getResponsables().add(responsable);
		responsable.setContacto(this);

		return responsable;
	}

	public Responsable removeResponsable(Responsable responsable) {
		getResponsables().remove(responsable);
		responsable.setContacto(null);

		return responsable;
	}

}
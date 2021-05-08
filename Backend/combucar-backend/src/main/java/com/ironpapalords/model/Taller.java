package com.ironpapalords.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TALLER database table.
 * 
 */
@Entity
@Table(name="TALLER")
@NamedQuery(name="Taller.findAll", query="SELECT t FROM Taller t")
public class Taller implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_TALLER", unique=true, nullable=false)
	private int idTaller;

	@Column(name="DIRECCION", length=250)
	private String direccion;

	@Column(name="NOMBRE", length=100)
	private String nombre;

	//bi-directional many-to-one association to Operacion
	@OneToMany(mappedBy="taller", fetch=FetchType.EAGER)
	private List<Operacion> operacions;

	//bi-directional many-to-one association to Operadore
	@OneToMany(mappedBy="taller", fetch=FetchType.EAGER)
	private List<Operadore> operadores;

	public Taller() {
	}

	public int getIdTaller() {
		return this.idTaller;
	}

	public void setIdTaller(int idTaller) {
		this.idTaller = idTaller;
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

	public List<Operacion> getOperacions() {
		return this.operacions;
	}

	public void setOperacions(List<Operacion> operacions) {
		this.operacions = operacions;
	}

	public Operacion addOperacion(Operacion operacion) {
		getOperacions().add(operacion);
		operacion.setTaller(this);

		return operacion;
	}

	public Operacion removeOperacion(Operacion operacion) {
		getOperacions().remove(operacion);
		operacion.setTaller(null);

		return operacion;
	}

	public List<Operadore> getOperadores() {
		return this.operadores;
	}

	public void setOperadores(List<Operadore> operadores) {
		this.operadores = operadores;
	}

	public Operadore addOperadore(Operadore operadore) {
		getOperadores().add(operadore);
		operadore.setTaller(this);

		return operadore;
	}

	public Operadore removeOperadore(Operadore operadore) {
		getOperadores().remove(operadore);
		operadore.setTaller(null);

		return operadore;
	}

}
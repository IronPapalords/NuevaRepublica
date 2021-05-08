package com.ironpapalords.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the MARCAS_VEHICULOS database table.
 * 
 */
@Entity
@Table(name="MARCAS_VEHICULOS")
@NamedQuery(name="MarcasVehiculo.findAll", query="SELECT m FROM MarcasVehiculo m")
public class MarcasVehiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_MARCA", unique=true, nullable=false)
	private int idMarca;

	@Column(name="NOMBRE", length=30)
	private String nombre;

	//bi-directional many-to-one association to Unidade
	@OneToMany(mappedBy="marcasVehiculo", fetch=FetchType.EAGER)
	private List<Unidade> unidades;

	public MarcasVehiculo() {
	}

	public int getIdMarca() {
		return this.idMarca;
	}

	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Unidade> getUnidades() {
		return this.unidades;
	}

	public void setUnidades(List<Unidade> unidades) {
		this.unidades = unidades;
	}

	public Unidade addUnidade(Unidade unidade) {
		getUnidades().add(unidade);
		unidade.setMarcasVehiculo(this);

		return unidade;
	}

	public Unidade removeUnidade(Unidade unidade) {
		getUnidades().remove(unidade);
		unidade.setMarcasVehiculo(null);

		return unidade;
	}

}
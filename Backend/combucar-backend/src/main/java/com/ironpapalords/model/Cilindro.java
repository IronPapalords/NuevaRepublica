package com.ironpapalords.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the CILINDROS database table.
 * 
 */
@Entity
@Table(name="CILINDROS")
@NamedQuery(name="Cilindro.findAll", query="SELECT c FROM Cilindro c")
public class Cilindro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_CILINDRO", unique=true, nullable=false)
	private int idCilindro;

	@Column(name="CAPACIDAD")
	private int capacidad;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_FABRICACION")
	private Date fechaFabricacion;

	@Column(name="MARCA", length=45)
	private String marca;

	@Column(name="SERIE", length=45)
	private String serie;

	//bi-directional many-to-one association to KitConversion
	@ManyToOne
	@JoinColumn(name="KIT_CONVERSION_ID_KIT_CONVERSION", nullable=false)
	private KitConversion kitConversion;

	public Cilindro() {
	}

	public int getIdCilindro() {
		return this.idCilindro;
	}

	public void setIdCilindro(int idCilindro) {
		this.idCilindro = idCilindro;
	}

	public int getCapacidad() {
		return this.capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public Date getFechaFabricacion() {
		return this.fechaFabricacion;
	}

	public void setFechaFabricacion(Date fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSerie() {
		return this.serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public KitConversion getKitConversion() {
		return this.kitConversion;
	}

	public void setKitConversion(KitConversion kitConversion) {
		this.kitConversion = kitConversion;
	}

}
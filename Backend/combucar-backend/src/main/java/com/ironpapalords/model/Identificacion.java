package com.ironpapalords.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the IDENTIFICACION database table.
 * 
 */
@Entity
@Table(name="IDENTIFICACION")
@NamedQuery(name="Identificacion.findAll", query="SELECT i FROM Identificacion i")
public class Identificacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_IDENTIFICACION", unique=true, nullable=false)
	private int idIdentificacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA_PRESENTADA", nullable=false)
	private Date fechaPresentada;

	@Column(name="REFERENCIA", nullable=false, length=30)
	private String referencia;

	@Column(name="TIPO", nullable=false)
	private int tipo;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="ID_CLIENTE", nullable=false)
	private Cliente cliente;

	public Identificacion() {
	}

	public int getIdIdentificacion() {
		return this.idIdentificacion;
	}

	public void setIdIdentificacion(int idIdentificacion) {
		this.idIdentificacion = idIdentificacion;
	}

	public Date getFechaPresentada() {
		return this.fechaPresentada;
	}

	public void setFechaPresentada(Date fechaPresentada) {
		this.fechaPresentada = fechaPresentada;
	}

	public String getReferencia() {
		return this.referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public int getTipo() {
		return this.tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
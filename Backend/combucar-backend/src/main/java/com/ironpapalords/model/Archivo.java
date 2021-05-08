package com.ironpapalords.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ARCHIVOS database table.
 * 
 */
@Entity
@Table(name="ARCHIVOS")
@NamedQuery(name="Archivo.findAll", query="SELECT a FROM Archivo a")
public class Archivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_ARCHIVO", unique=true, nullable=false)
	private int idArchivo;

	@Column(name="RUTA", length=250)
	private String ruta;

	//bi-directional many-to-one association to Respuesta
	@OneToMany(mappedBy="archivo", fetch=FetchType.EAGER)
	private List<Respuesta> respuestas;

	public Archivo() {
	}

	public int getIdArchivo() {
		return this.idArchivo;
	}

	public void setIdArchivo(int idArchivo) {
		this.idArchivo = idArchivo;
	}

	public String getRuta() {
		return this.ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public List<Respuesta> getRespuestas() {
		return this.respuestas;
	}

	public void setRespuestas(List<Respuesta> respuestas) {
		this.respuestas = respuestas;
	}

	public Respuesta addRespuesta(Respuesta respuesta) {
		getRespuestas().add(respuesta);
		respuesta.setArchivo(this);

		return respuesta;
	}

	public Respuesta removeRespuesta(Respuesta respuesta) {
		getRespuestas().remove(respuesta);
		respuesta.setArchivo(null);

		return respuesta;
	}

}
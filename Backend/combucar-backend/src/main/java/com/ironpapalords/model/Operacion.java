package com.ironpapalords.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the OPERACION database table.
 * 
 */
@Entity
@Table(name="OPERACION")
@NamedQuery(name="Operacion.findAll", query="SELECT o FROM Operacion o")
public class Operacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_OPERACION", unique=true, nullable=false)
	private int idOperacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FIN")
	private Date fin;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="INICIO")
	private Date inicio;

	//bi-directional many-to-one association to Proceso
	@ManyToOne
	@JoinColumn(name="ID_PROCESO", nullable=false)
	private Proceso proceso;

	//bi-directional many-to-one association to Taller
	@ManyToOne
	@JoinColumn(name="ID_TALLER", nullable=false)
	private Taller taller;

	//bi-directional many-to-one association to Unidade
	@ManyToOne
	@JoinColumn(name="ID_UNIDAD", nullable=false)
	private Unidade unidade;

	//bi-directional many-to-one association to Respuesta
	@OneToMany(mappedBy="operacion", fetch=FetchType.EAGER)
	private List<Respuesta> respuestas;

	public Operacion() {
	}

	public int getIdOperacion() {
		return this.idOperacion;
	}

	public void setIdOperacion(int idOperacion) {
		this.idOperacion = idOperacion;
	}

	public Date getFin() {
		return this.fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}

	public Date getInicio() {
		return this.inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Proceso getProceso() {
		return this.proceso;
	}

	public void setProceso(Proceso proceso) {
		this.proceso = proceso;
	}

	public Taller getTaller() {
		return this.taller;
	}

	public void setTaller(Taller taller) {
		this.taller = taller;
	}

	public Unidade getUnidade() {
		return this.unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	public List<Respuesta> getRespuestas() {
		return this.respuestas;
	}

	public void setRespuestas(List<Respuesta> respuestas) {
		this.respuestas = respuestas;
	}

	public Respuesta addRespuesta(Respuesta respuesta) {
		getRespuestas().add(respuesta);
		respuesta.setOperacion(this);

		return respuesta;
	}

	public Respuesta removeRespuesta(Respuesta respuesta) {
		getRespuestas().remove(respuesta);
		respuesta.setOperacion(null);

		return respuesta;
	}

}
package com.ironpapalords.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the OPERADORES database table.
 * 
 */
@Entity
@Table(name="OPERADORES")
@NamedQuery(name="Operadore.findAll", query="SELECT o FROM Operadore o")
public class Operadore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_OPERADOR", unique=true, nullable=false)
	private int idOperador;

	@Column(name="NOMBRE", nullable=false, length=120)
	private String nombre;

	@Column(name="PUESTO", nullable=false, length=100)
	private String puesto;

	@Column(name="TOKEN", nullable=false, length=10)
	private String token;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ULTIMO_TOKEN", nullable=false)
	private Date ultimoToken;

	//bi-directional many-to-one association to Contacto
	@ManyToOne
	@JoinColumn(name="ID_CONTACTO")
	private Contacto contacto;

	//bi-directional many-to-one association to Taller
	@ManyToOne
	@JoinColumn(name="ID_TALLER")
	private Taller taller;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="ID_USUARIO", nullable=false)
	private Usuario usuario;

	//bi-directional many-to-one association to Respuesta
	@OneToMany(mappedBy="operadore", fetch=FetchType.EAGER)
	private List<Respuesta> respuestas;

	public Operadore() {
	}

	public int getIdOperador() {
		return this.idOperador;
	}

	public void setIdOperador(int idOperador) {
		this.idOperador = idOperador;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return this.puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getUltimoToken() {
		return this.ultimoToken;
	}

	public void setUltimoToken(Date ultimoToken) {
		this.ultimoToken = ultimoToken;
	}

	public Contacto getContacto() {
		return this.contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

	public Taller getTaller() {
		return this.taller;
	}

	public void setTaller(Taller taller) {
		this.taller = taller;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Respuesta> getRespuestas() {
		return this.respuestas;
	}

	public void setRespuestas(List<Respuesta> respuestas) {
		this.respuestas = respuestas;
	}

	public Respuesta addRespuesta(Respuesta respuesta) {
		getRespuestas().add(respuesta);
		respuesta.setOperadore(this);

		return respuesta;
	}

	public Respuesta removeRespuesta(Respuesta respuesta) {
		getRespuestas().remove(respuesta);
		respuesta.setOperadore(null);

		return respuesta;
	}

}
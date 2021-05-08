package com.ironpapalords.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the UNIDADES database table.
 * 
 */
@Entity
@Table(name="UNIDADES")
@NamedQuery(name="Unidade.findAll", query="SELECT u FROM Unidade u")
public class Unidade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_UNIDAD", unique=true, nullable=false)
	private int idUnidad;

	@Column(name="ECO", length=30)
	private String eco;

	@Column(name="KILOMETRAJE")
	private int kilometraje;

	@Column(name="MPFI", length=30)
	private String mpfi;

	@Column(name="PLACAS", length=15)
	private String placas;

	@Column(name="SERIE", length=17)
	private String serie;

	@Column(name="SPI", length=30)
	private String spi;

	@Column(name="TIPO", length=30)
	private String tipo;

	//bi-directional many-to-one association to Operacion
	@OneToMany(mappedBy="unidade", fetch=FetchType.EAGER)
	private List<Operacion> operacions;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="ID_CLIENTE", nullable=false)
	private Cliente cliente;

	//bi-directional many-to-one association to KitConversion
	@ManyToOne
	@JoinColumn(name="ID_KIT_CONVERSION")
	private KitConversion kitConversion;

	//bi-directional many-to-one association to MarcasVehiculo
	@ManyToOne
	@JoinColumn(name="ID_MARCA", nullable=false)
	private MarcasVehiculo marcasVehiculo;

	public Unidade() {
	}

	public int getIdUnidad() {
		return this.idUnidad;
	}

	public void setIdUnidad(int idUnidad) {
		this.idUnidad = idUnidad;
	}

	public String getEco() {
		return this.eco;
	}

	public void setEco(String eco) {
		this.eco = eco;
	}

	public int getKilometraje() {
		return this.kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

	public String getMpfi() {
		return this.mpfi;
	}

	public void setMpfi(String mpfi) {
		this.mpfi = mpfi;
	}

	public String getPlacas() {
		return this.placas;
	}

	public void setPlacas(String placas) {
		this.placas = placas;
	}

	public String getSerie() {
		return this.serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getSpi() {
		return this.spi;
	}

	public void setSpi(String spi) {
		this.spi = spi;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Operacion> getOperacions() {
		return this.operacions;
	}

	public void setOperacions(List<Operacion> operacions) {
		this.operacions = operacions;
	}

	public Operacion addOperacion(Operacion operacion) {
		getOperacions().add(operacion);
		operacion.setUnidade(this);

		return operacion;
	}

	public Operacion removeOperacion(Operacion operacion) {
		getOperacions().remove(operacion);
		operacion.setUnidade(null);

		return operacion;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public KitConversion getKitConversion() {
		return this.kitConversion;
	}

	public void setKitConversion(KitConversion kitConversion) {
		this.kitConversion = kitConversion;
	}

	public MarcasVehiculo getMarcasVehiculo() {
		return this.marcasVehiculo;
	}

	public void setMarcasVehiculo(MarcasVehiculo marcasVehiculo) {
		this.marcasVehiculo = marcasVehiculo;
	}

}
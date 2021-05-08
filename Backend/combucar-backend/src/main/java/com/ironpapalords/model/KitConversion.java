package com.ironpapalords.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the KIT_CONVERSION database table.
 * 
 */
@Entity
@Table(name="KIT_CONVERSION")
@NamedQuery(name="KitConversion.findAll", query="SELECT k FROM KitConversion k")
public class KitConversion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_KIT_CONVERSION", unique=true, nullable=false)
	private int idKitConversion;

	@Column(name="MARCA_KIT", length=30)
	private String marcaKit;

	@Column(name="SERIE_KIT", length=20)
	private String serieKit;

	//bi-directional many-to-one association to Cilindro
	@OneToMany(mappedBy="kitConversion", fetch=FetchType.EAGER)
	private List<Cilindro> cilindros;

	//bi-directional many-to-one association to Unidade
	@OneToMany(mappedBy="kitConversion", fetch=FetchType.EAGER)
	private List<Unidade> unidades;

	public KitConversion() {
	}

	public int getIdKitConversion() {
		return this.idKitConversion;
	}

	public void setIdKitConversion(int idKitConversion) {
		this.idKitConversion = idKitConversion;
	}

	public String getMarcaKit() {
		return this.marcaKit;
	}

	public void setMarcaKit(String marcaKit) {
		this.marcaKit = marcaKit;
	}

	public String getSerieKit() {
		return this.serieKit;
	}

	public void setSerieKit(String serieKit) {
		this.serieKit = serieKit;
	}

	public List<Cilindro> getCilindros() {
		return this.cilindros;
	}

	public void setCilindros(List<Cilindro> cilindros) {
		this.cilindros = cilindros;
	}

	public Cilindro addCilindro(Cilindro cilindro) {
		getCilindros().add(cilindro);
		cilindro.setKitConversion(this);

		return cilindro;
	}

	public Cilindro removeCilindro(Cilindro cilindro) {
		getCilindros().remove(cilindro);
		cilindro.setKitConversion(null);

		return cilindro;
	}

	public List<Unidade> getUnidades() {
		return this.unidades;
	}

	public void setUnidades(List<Unidade> unidades) {
		this.unidades = unidades;
	}

	public Unidade addUnidade(Unidade unidade) {
		getUnidades().add(unidade);
		unidade.setKitConversion(this);

		return unidade;
	}

	public Unidade removeUnidade(Unidade unidade) {
		getUnidades().remove(unidade);
		unidade.setKitConversion(null);

		return unidade;
	}

}
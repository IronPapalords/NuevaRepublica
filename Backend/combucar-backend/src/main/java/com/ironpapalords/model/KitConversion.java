package com.ironpapalords.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the KIT_CONVERSION database table.
 */
@Data
@Entity
@Table(name = "KIT_CONVERSION")
public class KitConversion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_KIT_CONVERSION", unique = true, nullable = false)
	private int idKitConversion;

	@Column(name = "MARCA_KIT", length = 30)
	private String marcaKit;

	@Column(name = "SERIE_KIT", length = 20)
	private String serieKit;

	//bi-directional many-to-one association to Cilindro
	@OneToMany(mappedBy = "kitConversion", fetch = FetchType.EAGER)
	private List<Cilindro> cilindros;

	//bi-directional many-to-one association to Unidade
	@OneToMany(mappedBy = "kitConversion", fetch = FetchType.EAGER)
	private List<Unidad> unidades;

}
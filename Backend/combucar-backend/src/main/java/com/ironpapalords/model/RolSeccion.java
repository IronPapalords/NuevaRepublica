package com.ironpapalords.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the ROLES_VS_SECCION database table.
 */
@Data
@Entity
@Table(name = "ROLES_VS_SECCION")
public class RolSeccion {
	private static final long serialVersionUID = 1L;
}

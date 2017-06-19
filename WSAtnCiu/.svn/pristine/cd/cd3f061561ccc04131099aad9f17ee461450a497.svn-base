package com.nd.bean;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="cat_zonas")
public class CatZonas {
	
	// Atributtes
	@Id
	@Column(name="CZN_ID_ZONA")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cznIdZona;
	
	@Column(name="CZN_DESCRIPCION")
	private String cznDescripcion;
	
	@Column(name="CZN_ESTATUS")
	private Integer cznEstatus;

	
	// Getters and Setters
	public Integer getCznIdZona() {
		return cznIdZona;
	}

	public void setCznIdZona(Integer cznIdZona) {
		this.cznIdZona = cznIdZona;
	}

	public String getCznDescripcion() {
		return cznDescripcion;
	}

	public void setCznDescripcion(String cznDescripcion) {
		this.cznDescripcion = cznDescripcion;
	}

	public Integer getCznEstatus() {
		return cznEstatus;
	}

	public void setCznEstatus(Integer cznEstatus) {
		this.cznEstatus = cznEstatus;
	}
}

package com.nd.bean;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="cat_instrucciones")
public class CatInstrucciones {

	// Atributtes
	@Id
	@Column(name="INS_ID_INSTRUCCIONES")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer insIdInstrucciones;
	
	@Column(name="INS_DESCRIPCION")
	private String insDescripcion;
	
	@Column(name="INS_ESTATUS")
	private Integer insEstatus;
	
	
	// Getters and Setters
	public Integer getInsIdInstrucciones() {
		return insIdInstrucciones;
	}

	public void setInsIdInstrucciones(Integer insIdInstrucciones) {
		this.insIdInstrucciones = insIdInstrucciones;
	}

	public String getInsDescripcion() {
		return insDescripcion;
	}

	public void setInsDescripcion(String insDescripcion) {
		this.insDescripcion = insDescripcion;
	}

	public Integer getInsEstatus() {
		return insEstatus;
	}

	public void setInsEstatus(Integer insEstatus) {
		this.insEstatus = insEstatus;
	}
}

package com.nd.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CAT_ESTATUS")
public class CatStatus {
	@Id
	@Column(name="EST_ID_ESTATUS")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer estIdEstatus;
	
	@Column(name="EST_DESCRIPCION")
	private String estDescripcion;
	@Column(name="EST_ESTATUS")
	private Integer estEstatus;
	
	//Getters and Setters
	
	public Integer getEstIdEstatus() {
		return estIdEstatus;
	}
	public void setEstIdEstatus(Integer estIdEstatus) {
		this.estIdEstatus = estIdEstatus;
	}
	public String getEstDescripcion() {
		return estDescripcion;
	}
	public void setEstDescripcion(String estDescripcion) {
		this.estDescripcion = estDescripcion;
	}
	public Integer getEstEstatus() {
		return estEstatus;
	}
	public void setEstEstatus(Integer estEstatus) {
		this.estEstatus = estEstatus;
	}
	
	
	
}

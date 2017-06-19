package com.nd.bean;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Angel
 * This is our model class and it corresponds to V_LLAMADA_EMERGENCIA view in database 
 *
 */

@Entity
@Table(name="V_LLAMADA_EMERGENCIA")
public class VLlamadaEmergencia {
	
	// Atributos
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="TELEFONO")
	private BigInteger telefono;
	
	@Id
	@Column(name="ID_EMERGENCIA")
	private Integer idEmergencia;

	@Column(name="TIPO_EMERGENCIA")
	private String tipoEmergencia;
	
	@Column(name="UBICACION")
	private String ubicacion;
	
	@Column(name="FECHA")
	private String fecha;
	
	@Column(name="ESTATUS_LLAMADA")
	private Integer estatusLlamada;
	
	@Column(name="ESTATUS")
	private String estatusReporte;
	
	@Column(name="FOLIO")
	private String folio;

	
	// Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigInteger getTelefono() {
		return telefono;
	}

	public void setTelefono(BigInteger telefono) {
		this.telefono = telefono;
	}

	public Integer getIdEmergencia() {
		return idEmergencia;
	}

	public void setIdEmergencia(Integer idEmergencia) {
		this.idEmergencia = idEmergencia;
	}

	public String getTipoEmergencia() {
		return tipoEmergencia;
	}

	public void setTipoEmergencia(String tipoEmergencia) {
		this.tipoEmergencia = tipoEmergencia;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Integer getEstatusLlamada() {
		return estatusLlamada;
	}

	public void setEstatusLlamada(Integer estatusLlamada) {
		this.estatusLlamada = estatusLlamada;
	}

	public String getEstatusReporte() {
		return estatusReporte;
	}

	public void setEstatusReporte(String estatusReporte) {
		this.estatusReporte = estatusReporte;
	}

	public String getFolio() {
		return folio;
	}

	public void setFolio(String folio) {
		this.folio = folio;
	}
}

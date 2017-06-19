package com.nd.bean;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name = "CAT_EMERGENCIAS")
public class CatEmergencias{
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMG_ID_EMERGENCIA")
    private Integer emgIdEmergencia;
    
    @Column(name = "EMG_NOMBRE")
    private String emgNombre;
    
    @Column(name = "EMG_NUMERO")
    private BigInteger emgNumero;
    
    @Column(name = "EMG_ESTATUS")
    private Integer emgEstatus;
    

	public Integer getEmgIdEmergencia() {
		return emgIdEmergencia;
	}

	public void setEmgIdEmergencia(Integer emgIdEmergencia) {
		this.emgIdEmergencia = emgIdEmergencia;
	}

	public String getEmgNombre() {
		return emgNombre;
	}

	public void setEmgNombre(String emgNombre) {
		this.emgNombre = emgNombre;
	}

	public BigInteger getEmgNumero() {
		return emgNumero;
	}

	public void setEmgNumero(BigInteger emgNumero) {
		this.emgNumero = emgNumero;
	}

	public Integer getEmgEstatus() {
		return emgEstatus;
	}

	public void setEmgEstatus(Integer emgEstatus) {
		this.emgEstatus = emgEstatus;
	}
}

package com.nd.bean;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.sun.istack.internal.NotNull;

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

package com.nd.bean;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * 
 * @author Angel
 * This is our model class and it corresponds to op_archivos table in database 
 *
 */

@Entity
@Table(name="OP_ARCHIVOS")
public class Archivos {
	
	// Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ARC_ID_ARCHIVO")
	private Integer arcIdArchivo;
	
	@Column(name="ARC_NOMBRE")
	private String arcNombre;
	
	@Column(name="ARC_ARCHIVO")
	private byte[] arcArchivo;
	
	@Column(name="ARC_TIPO_DOCTO")
	private String arcTipoDocto;
	
	@JoinColumn(name="ARC_ID_REL_USU_CAT_SERV", referencedColumnName="RPC_ID_USU_CAT_SERV")
	@ManyToOne
	private RelPerServ arcIdRelUsuCatServ;
	
	@Column(name="ARC_FECHA_ALTA")
	private String arcFechaAlta;
	
	@Column(name="ARC_FECHA_MODIF")
	private String arcFechaModif;
	
	@Column(name="ARC_USU_ALTA")
	private Integer arcUsuAlta;
	
	@Column(name="ARC_USU_MODIF")
	private Integer arcUsuModif;
	
	@Column(name="ARC_ESTATUS")
	private Integer arcEstatus;
	
	@Column(name="ARC_ARCHIVOSTR")
	private String archivoStr;

	
	
	// Getters and Setters
	
	public Integer getArcIdArchivo() {
		return arcIdArchivo;
	}

	public void setArcIdArchivo(Integer arcIdArchivo) {
		this.arcIdArchivo = arcIdArchivo;
	}

	public String getArcNombre() {
		return arcNombre;
	}

	public void setArcNombre(String arcNombre) {
		this.arcNombre = arcNombre;
	}

	public byte[] getArcArchivo() {
		return arcArchivo;
	}

	public void setArcArchivo(byte[] arcArchivo) {
		this.arcArchivo = arcArchivo;
	}

	public String getArcTipoDocto() {
		return arcTipoDocto;
	}

	public void setArcTipoDocto(String arcTipoDocto) {
		this.arcTipoDocto = arcTipoDocto;
	}

	public RelPerServ getArcIdRelUsuCatServ() {
		return arcIdRelUsuCatServ;
	}

	public void setArcIdRelUsuCatServ(RelPerServ arcIdRelUsuCatServ) {
		this.arcIdRelUsuCatServ = arcIdRelUsuCatServ;
	}

	public String getArcFechaAlta() {
		return arcFechaAlta;
	}

	public void setArcFechaAlta(String arcFechaAlta) {
		this.arcFechaAlta = arcFechaAlta;
	}

	public String getArcFechaModif() {
		return arcFechaModif;
	}

	public void setArcFechaModif(String arcFechaModif) {
		this.arcFechaModif = arcFechaModif;
	}

	public Integer getArcUsuAlta() {
		return arcUsuAlta;
	}

	public void setArcUsuAlta(Integer arcUsuAlta) {
		this.arcUsuAlta = arcUsuAlta;
	}

	public Integer getArcUsuModif() {
		return arcUsuModif;
	}

	public void setArcUsuModif(Integer arcUsuModif) {
		this.arcUsuModif = arcUsuModif;
	}

	public Integer getArcEstatus() {
		return arcEstatus;
	}

	public void setArcEstatus(Integer arcEstatus) {
		this.arcEstatus = arcEstatus;
	}

	public String getArchivoStr() {
		return archivoStr;
	}

	public void setArchivoStr(String archivoStr) {
		this.archivoStr = archivoStr;
	}
}

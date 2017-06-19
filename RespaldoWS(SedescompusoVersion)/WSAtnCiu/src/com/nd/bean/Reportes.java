package com.nd.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Fireluz
 *
 */
@Entity
@Table(name="OP_REPORTES")
public class Reportes {
	@Id
	@Column(name="RPT_ID_REPORTE")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int reporteId;
	
	@Column(name="RPT_NOMBRE")
	private String rptNombre;
	
	@Column(name="RPT_DESCRIPCION")
	private String rptDescripcion;
	
	@Column(name="RPT_TIPO_DOCTO")
	private String rptTipoDocto;
	
	@Column(name="RPT_TAMANIO")
	private int rptTamanyo;
	
	@Column(name="RPT_ID_REL_USU_CAT_SERV")
	private int rptIdRelUsuServ;
	
	@Column(name="RPT_FECHA_ALTA")
	private Date rptFechaAlta;
	
	@Column(name="RPT_FECHA_MODIF")
	private Date rptFechaModi;
	
	@Column(name="RPT_USU_ALTA")
	private int rptUsuarioAlta;
	
	@Column(name="RPT_USU_MODIF")
	private int rptUsuarioModif;
	
	@Column(name="RPT_ESTATUS")
	private int rpteEtatusRegistro;

	//Getter y Setters
	
	public int getReporteId() {
		return reporteId;
	}

	public String getRptNombre() {
		return rptNombre;
	}

	public void setRptNombre(String rptNombre) {
		this.rptNombre = rptNombre;
	}

	public String getRptDescripcion() {
		return rptDescripcion;
	}

	public void setRptDescripcion(String rptDescripcion) {
		this.rptDescripcion = rptDescripcion;
	}

	public String getRptTipoDocto() {
		return rptTipoDocto;
	}

	public void setRptTipoDocto(String rptTipoDocto) {
		this.rptTipoDocto = rptTipoDocto;
	}

	public int getRptTamanyo() {
		return rptTamanyo;
	}

	public void setRptTamanyo(int rptTamanyo) {
		this.rptTamanyo = rptTamanyo;
	}

	public int getRptIdRelUsuServ() {
		return rptIdRelUsuServ;
	}

	public void setRptIdRelUsuServ(int rptIdRelUsuServ) {
		this.rptIdRelUsuServ = rptIdRelUsuServ;
	}

	public Date getRptFechaAlta() {
		return rptFechaAlta;
	}

	public void setRptFechaAlta(Date rptFechaAlta) {
		this.rptFechaAlta = rptFechaAlta;
	}

	public Date getRptFechaModi() {
		return rptFechaModi;
	}

	public void setRptFechaModi(Date rptFechaModi) {
		this.rptFechaModi = rptFechaModi;
	}

	public int getRptUsuarioAlta() {
		return rptUsuarioAlta;
	}

	public void setRptUsuarioAlta(int rptUsuarioAlta) {
		this.rptUsuarioAlta = rptUsuarioAlta;
	}

	public int getRptUsuarioModif() {
		return rptUsuarioModif;
	}

	public void setRptUsuarioModif(int rptUsuarioModif) {
		this.rptUsuarioModif = rptUsuarioModif;
	}

	public int getRpteEtatusRegistro() {
		return rpteEtatusRegistro;
	}

	public void setRpteEtatusRegistro(int rpteEtatusRegistro) {
		this.rpteEtatusRegistro = rpteEtatusRegistro;
	}

	public void setReporteId(int reporteId) {
		this.reporteId = reporteId;
	}
}

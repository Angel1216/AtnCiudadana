package com.nd.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import com.sun.istack.internal.NotNull;

/**
 *3
 * @author Gabriel
 */
@Entity
@Table(name = "REL_USU_EMERGENCIA")
public class RelUsuEmergencia {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "REM_ID_REL_USU_EMERG")
    private Integer remIdRelUsuEmerg;
    
    @Column(name = "REM_GPS")
    private String remGps;
    
    @Column(name = "REM_FECHA_ALTA")
    private String remFechaAlta;
    
    @Column(name = "REM_FECHA_MODIF")
    private String remFechaModif;
    
    @Column(name = "REM_USU_ALTA")
    private Integer remUsuAlta;
    
    @Column(name = "REM_USU_MODIF")
    private Integer remUsuModif;
    
    @Column(name = "REM_ESTATUS")
    private Integer remEstatus;
    
    @JoinColumn(name = "REM_ID_USUARIO", referencedColumnName = "USU_ID_USUARIO")
    @ManyToOne
    private Usuario remIdUsuario;
    
    @JoinColumn(name = "REM_ID_EMERGENCIA", referencedColumnName = "EMG_ID_EMERGENCIA")
    @ManyToOne
    private CatEmergencias remIdEmergencia;

    @Column(name = "REM_FOLIO")
    private String remFolio;
    
    @Column(name = "REM_ESTATUS_LLAMADA")
    private Integer RemEstatusLlamada;

	public Integer getRemIdRelUsuEmerg() {
		return remIdRelUsuEmerg;
	}

	public void setRemIdRelUsuEmerg(Integer remIdRelUsuEmerg) {
		this.remIdRelUsuEmerg = remIdRelUsuEmerg;
	}

	public String getRemGps() {
		return remGps;
	}

	public void setRemGps(String remGps) {
		this.remGps = remGps;
	}

	public String getRemFechaAlta() {
		return remFechaAlta;
	}

	public void setRemFechaAlta(String remFechaAlta) {
		this.remFechaAlta = remFechaAlta;
	}

	public String getRemFechaModif() {
		return remFechaModif;
	}

	public void setRemFechaModif(String remFechaModif) {
		this.remFechaModif = remFechaModif;
	}

	public Integer getRemUsuAlta() {
		return remUsuAlta;
	}

	public void setRemUsuAlta(Integer remUsuAlta) {
		this.remUsuAlta = remUsuAlta;
	}

	public Integer getRemUsuModif() {
		return remUsuModif;
	}

	public void setRemUsuModif(Integer remUsuModif) {
		this.remUsuModif = remUsuModif;
	}

	public Integer getRemEstatus() {
		return remEstatus;
	}

	public void setRemEstatus(Integer remEstatus) {
		this.remEstatus = remEstatus;
	}

	public Usuario getRemIdUsuario() {
		return remIdUsuario;
	}

	public void setRemIdUsuario(Usuario remIdUsuario) {
		this.remIdUsuario = remIdUsuario;
	}

	public CatEmergencias getRemIdEmergencia() {
		return remIdEmergencia;
	}

	public void setRemIdEmergencia(CatEmergencias remIdEmergencia) {
		this.remIdEmergencia = remIdEmergencia;
	}

	public String getRemFolio() {
		return remFolio;
	}

	public void setRemFolio(String remFolio) {
		this.remFolio = remFolio;
	}

	public Integer getRemEstatusLlamada() {
		return RemEstatusLlamada;
	}

	public void setRemEstatusLlamada(Integer remEstatusLlamada) {
		RemEstatusLlamada = remEstatusLlamada;
	}  
}

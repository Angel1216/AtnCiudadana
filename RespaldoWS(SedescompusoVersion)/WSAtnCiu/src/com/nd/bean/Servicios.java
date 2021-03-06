package com.nd.bean;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;


/**
 * 
 * @author Angel
 *
 * This is our model class and it correponds to cat_servicios table in database 
 */

@Entity
@Table(name="cat_servicios")
public class Servicios {

	// Attributes
	@Id
	@Column(name="SRV_ID_SERVICIO")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer servicioId;
	
    @JoinColumn(name = "SRV_ID_PADRE", referencedColumnName = "SRV_ID_SERVICIO")
    @ManyToOne
    private ServicioPadre padreId;
	
	@Column(name="SRV_DESCRIPCION")
	private String descripcion;
	
	@Column(name="SRV_FECHA_ALTA")
	private String fechaAlta;
	
	@Column(name="SRV_FECHA_MODIF")
	private String fechaModif;

	@Column(name="SRV_USU_ALTA")
	private Integer usuAlta;
	
	@Column(name="SRV_USU_MODIF")
	private Integer usuModif;
	
	@Column(name="SRV_ESTATUS")
	private Integer estatus;

	
	public Servicios() {
    }

    public Servicios(Integer servicioId) {
        this.servicioId = servicioId;
    }

	
	// Getters and Setters
	public Integer getServicioId() {
		return servicioId;
	}

	public void setServicioId(Integer servicioId) {
		this.servicioId = servicioId==null?0:servicioId;
	}

	public ServicioPadre getPadreId() {
		return padreId;
	}

	public void setPadreId(ServicioPadre padreId) {
		this.padreId = padreId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion==null?"":descripcion;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta==null?"":fechaAlta;
	}

	public String getFechaModif() {
		return fechaModif;
	}

	public void setFechaModif(String fechaModif) {
		this.fechaModif = fechaModif==null?"":fechaModif;
	}

	public Integer getUsuAlta() {
		return usuAlta;
	}

	public void setUsuAlta(Integer usuAlta) {
		this.usuAlta = usuAlta==null?0:usuAlta;
	}

	public Integer getUsuModif() {
		return usuModif;
	}

	public void setUsuModif(Integer usuModif) {
		this.usuModif = usuModif==null?0:usuModif;
	}

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus==null?0:estatus;
	}
}
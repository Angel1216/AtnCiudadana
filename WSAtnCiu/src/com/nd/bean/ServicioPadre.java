package com.nd.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cat_servicios")
public class ServicioPadre {
	// Attributes
		@Id
		@Column(name="SRV_ID_SERVICIO")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer srvIdServicio;
		
		@Column(name="SRV_DESCRIPCION")
		private String descripcion;

		public ServicioPadre() {
	    }

	    public ServicioPadre(Integer srvIdServicio) {
	        this.srvIdServicio = srvIdServicio;
	    }
		
		//Getters and Setters	
		public String getDescripcion() {
			return descripcion;
		}

		public Integer getSrvIdServicio() {
			return srvIdServicio;
		}

		public void setSrvIdServicio(Integer srvIdServicio) {
			this.srvIdServicio = srvIdServicio;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		
		
}

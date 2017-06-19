package com.nd.bean;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;


/*
 * This is our model class and it corresponds to Contact table in database
 */

@Entity
@Table(name="OP_USUARIOS")
public class Usuario {

	// Attributes
	@Id
	@Column(name="USU_ID_USUARIO")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer usuarioId;
	
	@Column(name="USU_ID_ROL")
	private Integer rolId; 
	
	@Column(name="USU_NOMBRE")
	private String nombre;
	
	@Column(name="USU_AP_PATERNO")
	private String apPaterno;
	
	@Column(name="USU_AP_MATERNO")
	private String apMaterno;
	
	@Column(name="USU_TELEFONO")
	private BigInteger telefono; 
	
	@Column(name="USU_CORREO")
	private String email;
	
	@Column(name="USU_ESTATUS_SESION")
	private Integer estatusSesion;
	
	@Column(name="USU_FECH_ULT_SESION")
	private String fechaUlSe;
	
	@Column(name="USU_CONTRASENIA")
	private String contrasenia;
	
	@Column(name="USU_FECHA_ALTA")
	private String fechaAlta;
		
	@Column(name="USU_FECHA_MODIF")
	private String fechaModif;
	
	@Column(name="USU_USU_ALTA")
	private Integer usuarioAlta;
	
	@Column(name="USU_USU_MODIF")
	private Integer usuarioModif;
	
	@Column(name="USU_ESTATUS")
	private Integer estatus;

	public Integer getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}

	public Integer getRolId() {
		return rolId;
	}

	public void setRolId(Integer rolId) {
		this.rolId = rolId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	public BigInteger getTelefono() {
		return telefono;
	}

	public void setTelefono(BigInteger telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getEstatusSesion() {
		return estatusSesion;
	}

	public void setEstatusSesion(Integer estatusSesion) {
		this.estatusSesion = estatusSesion;
	}

	public String getFechaUlSe() {
		return fechaUlSe;
	}

	public void setFechaUlSe(String fechaUlSe) {
		this.fechaUlSe = fechaUlSe;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getFechaModif() {
		return fechaModif;
	}

	public void setFechaModif(String fechaModif) {
		this.fechaModif = fechaModif;
	}

	public Integer getUsuarioAlta() {
		return usuarioAlta;
	}

	public void setUsuarioAlta(Integer usuarioAlta) {
		this.usuarioAlta = usuarioAlta;
	}

	public Integer getUsuarioModif() {
		return usuarioModif;
	}

	public void setUsuarioModif(Integer usuarioModif) {
		this.usuarioModif = usuarioModif;
	}

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}
}
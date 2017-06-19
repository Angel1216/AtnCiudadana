package com.nd.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="OP_REL_PER_CAT_SERV")
public class RelPerServ {
	@Id
	@Column(name="RPC_ID_USU_CAT_SERV")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer rpcIdusucatser;
	
	@Column(name="RPC_FOLIO_REPORTE")
	private String rpcFolioReporte;
	@JoinColumn(name = "RPC_ID_USUARIO", referencedColumnName = "USU_ID_USUARIO")
    @ManyToOne
	private Usuario rpcIdUsuario;
    @JoinColumn(name = "RPC_ID_SERVICIO", referencedColumnName = "SRV_ID_SERVICIO")
    @ManyToOne
    private Servicios rpcIdServicio;	
	@Column(name="RPC_GPS")
	private String rpcGps;	
    @JoinColumn(name = "RPC_ID_ESTATUS_SERVICIO", referencedColumnName = "EST_ID_ESTATUS")
    @ManyToOne
    private CatStatus rpcIdEstatusServ;		
	@Column(name="RPC_ID_ZONA")
	private Integer rpcIdZona;
	@Column(name="RPC_DESCRIPCION")
	private String rpcDescripcion;
	@Column(name="RPC_FECHA_ALTA")
	private String rpcFechaAlta;
	@Column(name="RPC_FECHA_MODIF")
	private String rpcFechaModifica;
	@Column(name="RPC_USU_ALTA")
	private Integer rpcUsuAlta;
	@Column(name="RPC_USU_MODIF")
	private Integer rpcUsuModifica;
	@Column(name="RPC_ESTATUS")
	private Integer rpcEstatus;
	
	//getter and setter
	
	public Integer getRpcIdusucatser() {
		return rpcIdusucatser;
	}
	public void setRpcIdusucatser(Integer rpcIdusucatser) {
		this.rpcIdusucatser = rpcIdusucatser==null?0:rpcIdusucatser;
	}
	public String getRpcFolioReporte() {
		return rpcFolioReporte;
	}
	public void setRpcFolioReporte(String rpcFolioReporte) {
		this.rpcFolioReporte = rpcFolioReporte==null?"":rpcFolioReporte;
	}
	public Usuario getRpcIdUsuario() {
		return rpcIdUsuario;
	}
	public void setRpcIdUsuario(Usuario rpcIdUsuario) {
		this.rpcIdUsuario = rpcIdUsuario;
	}
	public Servicios getRpcIdServicio() {
		return rpcIdServicio;
	}
	public void setRpcIdServicio(Servicios rpcIdServicio) {
		this.rpcIdServicio = rpcIdServicio;
	}
	public String getRpcGps() {
		return rpcGps;
	}
	public void setRpcGps(String rpcGps) {
		this.rpcGps = rpcGps==null?"":rpcGps;
	}
	public CatStatus getRpcIdEstatusServ() {
		return rpcIdEstatusServ;
	}
	public void setRpcIdEstatusServ(CatStatus rpcIdEstatusServ) {
		this.rpcIdEstatusServ = rpcIdEstatusServ;
	}
	public Integer getRpcIdZona() {
		return rpcIdZona;
	}
	public void setRpcIdZona(Integer rpcIdZona) {
		this.rpcIdZona = rpcIdZona==null?0:rpcIdZona;
	}
	public String getRpcFechaAlta() {
		return rpcFechaAlta;
	}
	public void setRpcFechaAlta(String rpcFechaAlta) {
		this.rpcFechaAlta = rpcFechaAlta;
	}
	public String getRpcFechaModifica() {
		return rpcFechaModifica;
	}
	public void setRpcFechaModifica(String rpcFechaModifica) {
		this.rpcFechaModifica = rpcFechaModifica;
	}
	public Integer getRpcUsuAlta() {
		return rpcUsuAlta;
	}
	public void setRpcUsuAlta(Integer rpcUsuAlta) {
		this.rpcUsuAlta = rpcUsuAlta==null?0:rpcUsuAlta;
	}
	public Integer getRpcUsuModifica() {
		return rpcUsuModifica;
	}
	public void setRpcUsuModifica(Integer rpcUsuModifica) {
		this.rpcUsuModifica = rpcUsuModifica==null?0:rpcUsuModifica;
	}
	public Integer getRpcEstatus() {
		return rpcEstatus;
	}
	public void setRpcEstatus(Integer rpcEstatus) {
		this.rpcEstatus = rpcEstatus==null?0:rpcEstatus;
	}
	public String getRpcDescripcion() {
		return rpcDescripcion;
	}
	public void setRpcDescripcion(String rpcDescripcion) {
		this.rpcDescripcion = rpcDescripcion;
	}
}

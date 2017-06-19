/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nd.bean;

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
@Table(name = "CAT_ROLES")
public class CatRoles{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ROL_ID_ROL")
    private Integer rolIdRol;
    
    @Column(name = "ROL_DESCRIPCION", nullable = false, length = 250)
    private String rolDescripcion;
    
    @Column(name = "ROL_ESTATUS", nullable = false)
    private int rolEstatus;

    public CatRoles() {
    }

    public CatRoles(Integer rolIdRol) {
        this.rolIdRol = rolIdRol;
    }

    public CatRoles(Integer rolIdRol, String rolDescripcion, int rolEstatus) {
        this.rolIdRol = rolIdRol;
        this.rolDescripcion = rolDescripcion;
        this.rolEstatus = rolEstatus;
    }

    public Integer getRolIdRol() {
        return rolIdRol;
    }

    public void setRolIdRol(Integer rolIdRol) {
        this.rolIdRol = rolIdRol;
    }

    public String getRolDescripcion() {
        return rolDescripcion;
    }

    public void setRolDescripcion(String rolDescripcion) {
        this.rolDescripcion = rolDescripcion;
    }

    public int getRolEstatus() {
        return rolEstatus;
    }

    public void setRolEstatus(int rolEstatus) {
        this.rolEstatus = rolEstatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rolIdRol != null ? rolIdRol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CatRoles)) {
            return false;
        }
        CatRoles other = (CatRoles) object;
        if ((this.rolIdRol == null && other.rolIdRol != null) || (this.rolIdRol != null && !this.rolIdRol.equals(other.rolIdRol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DataBase.CatRoles[ rolIdRol=" + rolIdRol + " ]";
    }
    
}

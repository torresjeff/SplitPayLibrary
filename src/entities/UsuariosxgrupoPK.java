/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Sid
 */
@Embeddable
public class UsuariosxgrupoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "USUARIO_ID")
    private BigInteger usuarioId;
    @Basic(optional = false)
    @Column(name = "GRUPO_ID")
    private BigInteger grupoId;

    public UsuariosxgrupoPK() {
    }

    public UsuariosxgrupoPK(BigInteger usuarioId, BigInteger grupoId) {
        this.usuarioId = usuarioId;
        this.grupoId = grupoId;
    }

    public BigInteger getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(BigInteger usuarioId) {
        this.usuarioId = usuarioId;
    }

    public BigInteger getGrupoId() {
        return grupoId;
    }

    public void setGrupoId(BigInteger grupoId) {
        this.grupoId = grupoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuarioId != null ? usuarioId.hashCode() : 0);
        hash += (grupoId != null ? grupoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuariosxgrupoPK)) {
            return false;
        }
        UsuariosxgrupoPK other = (UsuariosxgrupoPK) object;
        if ((this.usuarioId == null && other.usuarioId != null) || (this.usuarioId != null && !this.usuarioId.equals(other.usuarioId))) {
            return false;
        }
        if ((this.grupoId == null && other.grupoId != null) || (this.grupoId != null && !this.grupoId.equals(other.grupoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.UsuariosxgrupoPK[ usuarioId=" + usuarioId + ", grupoId=" + grupoId + " ]";
    }
    
}

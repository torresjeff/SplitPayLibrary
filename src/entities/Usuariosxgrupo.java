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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sid
 */
@Entity
@Table(name = "USUARIOSXGRUPO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuariosxgrupo.findAll", query = "SELECT u FROM Usuariosxgrupo u"),
    @NamedQuery(name = "Usuariosxgrupo.findByUsuarioId", query = "SELECT u FROM Usuariosxgrupo u WHERE u.usuariosxgrupoPK.usuarioId = :usuarioId"),
    @NamedQuery(name = "Usuariosxgrupo.findByGrupoId", query = "SELECT u FROM Usuariosxgrupo u WHERE u.usuariosxgrupoPK.grupoId = :grupoId"),
    @NamedQuery(name = "Usuariosxgrupo.findByDeuda", query = "SELECT u FROM Usuariosxgrupo u WHERE u.deuda = :deuda")})
public class Usuariosxgrupo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsuariosxgrupoPK usuariosxgrupoPK;
    @Basic(optional = false)
    @Column(name = "DEUDA")
    private BigInteger deuda;
    @JoinColumn(name = "GRUPO_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Grupo grupo;
    @JoinColumn(name = "USUARIO_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuario usuario;

    public Usuariosxgrupo() {
    }

    public Usuariosxgrupo(UsuariosxgrupoPK usuariosxgrupoPK) {
        this.usuariosxgrupoPK = usuariosxgrupoPK;
    }

    public Usuariosxgrupo(UsuariosxgrupoPK usuariosxgrupoPK, BigInteger deuda) {
        this.usuariosxgrupoPK = usuariosxgrupoPK;
        this.deuda = deuda;
    }

    public Usuariosxgrupo(BigInteger usuarioId, BigInteger grupoId) {
        this.usuariosxgrupoPK = new UsuariosxgrupoPK(usuarioId, grupoId);
    }

    public UsuariosxgrupoPK getUsuariosxgrupoPK() {
        return usuariosxgrupoPK;
    }

    public void setUsuariosxgrupoPK(UsuariosxgrupoPK usuariosxgrupoPK) {
        this.usuariosxgrupoPK = usuariosxgrupoPK;
    }

    public BigInteger getDeuda() {
        return deuda;
    }

    public void setDeuda(BigInteger deuda) {
        this.deuda = deuda;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuariosxgrupoPK != null ? usuariosxgrupoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuariosxgrupo)) {
            return false;
        }
        Usuariosxgrupo other = (Usuariosxgrupo) object;
        if ((this.usuariosxgrupoPK == null && other.usuariosxgrupoPK != null) || (this.usuariosxgrupoPK != null && !this.usuariosxgrupoPK.equals(other.usuariosxgrupoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Usuariosxgrupo[ usuariosxgrupoPK=" + usuariosxgrupoPK + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sid
 */
@Entity
@Table(name = "PENDIENTECIERRE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pendientecierre.findAll", query = "SELECT p FROM Pendientecierre p"),
    @NamedQuery(name = "Pendientecierre.findByGrupoId", query = "SELECT p FROM Pendientecierre p WHERE p.grupoId = :grupoId")})
public class Pendientecierre implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "GRUPO_ID")
    private BigDecimal grupoId;
    @JoinColumn(name = "GRUPO_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Grupo grupo;

    public Pendientecierre() {
    }

    public Pendientecierre(BigDecimal grupoId) {
        this.grupoId = grupoId;
    }

    public BigDecimal getGrupoId() {
        return grupoId;
    }

    public void setGrupoId(BigDecimal grupoId) {
        this.grupoId = grupoId;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (grupoId != null ? grupoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pendientecierre)) {
            return false;
        }
        Pendientecierre other = (Pendientecierre) object;
        if ((this.grupoId == null && other.grupoId != null) || (this.grupoId != null && !this.grupoId.equals(other.grupoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Pendientecierre[ grupoId=" + grupoId + " ]";
    }
    
}

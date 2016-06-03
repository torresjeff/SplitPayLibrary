/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Sid
 */
@Entity
@Table(name = "GRUPO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Grupo.findAll", query = "SELECT g FROM Grupo g"),
    @NamedQuery(name = "Grupo.findById", query = "SELECT g FROM Grupo g WHERE g.id = :id"),
    @NamedQuery(name = "Grupo.findByName", query = "SELECT g FROM Grupo g WHERE g.name = :name"),
    @NamedQuery(name = "Grupo.findByCerrado", query = "SELECT g FROM Grupo g WHERE g.cerrado = :cerrado")})
public class Grupo implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @Column(name = "CERRADO")
    private BigInteger cerrado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "grupoId")
    private Collection<Transaccion> transaccionCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "grupo")
    private Pendientecierre pendientecierre;
    @JoinColumn(name = "LIDER", referencedColumnName = "ID")
    @OneToOne(optional = false)
    private Usuario lider;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "grupo")
    private Collection<Usuariosxgrupo> usuariosxgrupoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "grupoId")
    private Collection<Bill> billCollection;

    public Grupo() {
    }

    public Grupo(BigDecimal id) {
        this.id = id;
    }

    public Grupo(BigDecimal id, String name, BigInteger cerrado) {
        this.id = id;
        this.name = name;
        this.cerrado = cerrado;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getCerrado() {
        return cerrado;
    }

    public void setCerrado(BigInteger cerrado) {
        this.cerrado = cerrado;
    }

    @XmlTransient
    public Collection<Transaccion> getTransaccionCollection() {
        return transaccionCollection;
    }

    public void setTransaccionCollection(Collection<Transaccion> transaccionCollection) {
        this.transaccionCollection = transaccionCollection;
    }

    public Pendientecierre getPendientecierre() {
        return pendientecierre;
    }

    public void setPendientecierre(Pendientecierre pendientecierre) {
        this.pendientecierre = pendientecierre;
    }

    public Usuario getLider() {
        return lider;
    }

    public void setLider(Usuario lider) {
        this.lider = lider;
    }

    @XmlTransient
    public Collection<Usuariosxgrupo> getUsuariosxgrupoCollection() {
        return usuariosxgrupoCollection;
    }

    public void setUsuariosxgrupoCollection(Collection<Usuariosxgrupo> usuariosxgrupoCollection) {
        this.usuariosxgrupoCollection = usuariosxgrupoCollection;
    }

    @XmlTransient
    public Collection<Bill> getBillCollection() {
        return billCollection;
    }

    public void setBillCollection(Collection<Bill> billCollection) {
        this.billCollection = billCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grupo)) {
            return false;
        }
        Grupo other = (Grupo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Grupo[ id=" + id + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "USUARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findById", query = "SELECT u FROM Usuario u WHERE u.id = :id"),
    @NamedQuery(name = "Usuario.findByName", query = "SELECT u FROM Usuario u WHERE u.name = :name"),
    @NamedQuery(name = "Usuario.findByPhonenumber", query = "SELECT u FROM Usuario u WHERE u.phonenumber = :phonenumber"),
    @NamedQuery(name = "Usuario.findByEmail", query = "SELECT u FROM Usuario u WHERE u.email = :email")})
public class Usuario implements Serializable {

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
    @Column(name = "PHONENUMBER")
    private String phonenumber;
    @Basic(optional = false)
    @Column(name = "EMAIL")
    private String email;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioId")
    private Collection<Transaccion> transaccionCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "lider")
    private Grupo grupo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private Collection<Usuariosxgrupo> usuariosxgrupoCollection;
    @JoinColumn(name = "AUTH_CC", referencedColumnName = "CC")
    @OneToOne(optional = false)
    private Auth authCc;

    public Usuario() {
    }

    public Usuario(BigDecimal id) {
        this.id = id;
    }

    public Usuario(BigDecimal id, String name, String phonenumber, String email) {
        this.id = id;
        this.name = name;
        this.phonenumber = phonenumber;
        this.email = email;
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

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlTransient
    public Collection<Transaccion> getTransaccionCollection() {
        return transaccionCollection;
    }

    public void setTransaccionCollection(Collection<Transaccion> transaccionCollection) {
        this.transaccionCollection = transaccionCollection;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @XmlTransient
    public Collection<Usuariosxgrupo> getUsuariosxgrupoCollection() {
        return usuariosxgrupoCollection;
    }

    public void setUsuariosxgrupoCollection(Collection<Usuariosxgrupo> usuariosxgrupoCollection) {
        this.usuariosxgrupoCollection = usuariosxgrupoCollection;
    }

    public Auth getAuthCc() {
        return authCc;
    }

    public void setAuthCc(Auth authCc) {
        this.authCc = authCc;
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
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Usuario[ id=" + id + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "AUTH")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Auth.findAll", query = "SELECT a FROM Auth a"),
    @NamedQuery(name = "Auth.findByCc", query = "SELECT a FROM Auth a WHERE a.cc = :cc"),
    @NamedQuery(name = "Auth.findByPassword", query = "SELECT a FROM Auth a WHERE a.password = :password")})
public class Auth implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CC")
    private String cc;
    @Basic(optional = false)
    @Column(name = "PASSWORD")
    private String password;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "authCc")
    private Usuario usuario;

    public Auth() {
    }

    public Auth(String cc) {
        this.cc = cc;
    }

    public Auth(String cc, String password) {
        this.cc = cc;
        this.password = password;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        hash += (cc != null ? cc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Auth)) {
            return false;
        }
        Auth other = (Auth) object;
        if ((this.cc == null && other.cc != null) || (this.cc != null && !this.cc.equals(other.cc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Auth[ cc=" + cc + " ]";
    }
    
}

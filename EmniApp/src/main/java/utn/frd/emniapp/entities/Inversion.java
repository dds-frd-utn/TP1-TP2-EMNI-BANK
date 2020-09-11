/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frd.emniapp.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author emman
 */
@Entity
@Table(name = "inversion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inversion.findAll", query = "SELECT i FROM Inversion i"),
    @NamedQuery(name = "Inversion.findByNroInversion", query = "SELECT i FROM Inversion i WHERE i.nroInversion = :nroInversion"),
    @NamedQuery(name = "Inversion.findByNroCuenta", query = "SELECT i FROM Inversion i WHERE i.nroCuenta = :nroCuenta"),
    @NamedQuery(name = "Inversion.findByValor", query = "SELECT i FROM Inversion i WHERE i.valor = :valor"),
    @NamedQuery(name = "Inversion.findByNroBono", query = "SELECT i FROM Inversion i WHERE i.nroBono = :nroBono")})
public class Inversion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "nroInversion")
    private Integer nroInversion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nroCuenta")
    private int nroCuenta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor")
    private BigDecimal valor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nroBono")
    private int nroBono;

    public Inversion() {
    }

    public Inversion(Integer nroInversion) {
        this.nroInversion = nroInversion;
    }

    public Inversion(Integer nroInversion, int nroCuenta, BigDecimal valor, int nroBono) {
        this.nroInversion = nroInversion;
        this.nroCuenta = nroCuenta;
        this.valor = valor;
        this.nroBono = nroBono;
    }

    public Integer getNroInversion() {
        return nroInversion;
    }

    public void setNroInversion(Integer nroInversion) {
        this.nroInversion = nroInversion;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public int getNroBono() {
        return nroBono;
    }

    public void setNroBono(int nroBono) {
        this.nroBono = nroBono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nroInversion != null ? nroInversion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inversion)) {
            return false;
        }
        Inversion other = (Inversion) object;
        if ((this.nroInversion == null && other.nroInversion != null) || (this.nroInversion != null && !this.nroInversion.equals(other.nroInversion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "utn.frd.emniapp.entities.Inversion[ nroInversion=" + nroInversion + " ]";
    }
    
}

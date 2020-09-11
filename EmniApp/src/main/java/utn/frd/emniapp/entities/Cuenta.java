/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frd.emniapp.entities;

import java.io.Serializable;
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
@Table(name = "cuenta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cuenta.findAll", query = "SELECT c FROM Cuenta c"),
    @NamedQuery(name = "Cuenta.findByNroCuenta", query = "SELECT c FROM Cuenta c WHERE c.nroCuenta = :nroCuenta"),
    @NamedQuery(name = "Cuenta.findBySaldo", query = "SELECT c FROM Cuenta c WHERE c.saldo = :saldo")})
public class Cuenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "nroCuenta")
    private Integer nroCuenta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "saldo")
    private float saldo;

    public Cuenta() {
    }

    public Cuenta(Integer nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public Cuenta(Integer nroCuenta, float saldo) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    public Integer getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(Integer nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nroCuenta != null ? nroCuenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuenta)) {
            return false;
        }
        Cuenta other = (Cuenta) object;
        if ((this.nroCuenta == null && other.nroCuenta != null) || (this.nroCuenta != null && !this.nroCuenta.equals(other.nroCuenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "utn.frd.emniapp.entities.Cuenta[ nroCuenta=" + nroCuenta + " ]";
    }
    
}

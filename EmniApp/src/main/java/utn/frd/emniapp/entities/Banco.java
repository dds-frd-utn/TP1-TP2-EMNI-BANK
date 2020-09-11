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
@Table(name = "banco")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Banco.findAll", query = "SELECT b FROM Banco b"),
    @NamedQuery(name = "Banco.findByCodBanco", query = "SELECT b FROM Banco b WHERE b.codBanco = :codBanco"),
    @NamedQuery(name = "Banco.findByNroCliente", query = "SELECT b FROM Banco b WHERE b.nroCliente = :nroCliente"),
    @NamedQuery(name = "Banco.findByNroBono", query = "SELECT b FROM Banco b WHERE b.nroBono = :nroBono")})
public class Banco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codBanco")
    private Integer codBanco;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nroCliente")
    private int nroCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nroBono")
    private int nroBono;

    public Banco() {
    }

    public Banco(Integer codBanco) {
        this.codBanco = codBanco;
    }

    public Banco(Integer codBanco, int nroCliente, int nroBono) {
        this.codBanco = codBanco;
        this.nroCliente = nroCliente;
        this.nroBono = nroBono;
    }

    public Integer getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(Integer codBanco) {
        this.codBanco = codBanco;
    }

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
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
        hash += (codBanco != null ? codBanco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Banco)) {
            return false;
        }
        Banco other = (Banco) object;
        if ((this.codBanco == null && other.codBanco != null) || (this.codBanco != null && !this.codBanco.equals(other.codBanco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "utn.frd.emniapp.entities.Banco[ codBanco=" + codBanco + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport_p3.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Kevin Flores
 */
@Entity
@Table(name = "tipoavion")
@NamedQueries({
    @NamedQuery(name = "Tipoavion.findAll", query = "SELECT t FROM Tipoavion t")})
public class Tipoavion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idTipoAvion")
    private String idTipoAvion;
    @Basic(optional = false)
    @Column(name = "mondelo")
    private String mondelo;
    @Basic(optional = false)
    @Column(name = "cantidadAsientos")
    private int cantidadAsientos;
    @Basic(optional = false)
    @Column(name = "cantidadFilas")
    private int cantidadFilas;
    @Basic(optional = false)
    @Column(name = "cantidadColumnas")
    private int cantidadColumnas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoavion")
    private List<Avion> avionList;

    public Tipoavion() {
        this.avionList = null;
        this.idTipoAvion = "";
        this.mondelo = "";
        this.cantidadAsientos = 0;
        this.cantidadColumnas = 0;
        this.cantidadFilas = 0;
    }

    public Tipoavion(String idTipoAvion) {
        this.idTipoAvion = idTipoAvion;
    }

    public Tipoavion(String idTipoAvion, String mondelo, int cantidadAsientos, int cantidadFilas, int cantidadColumnas) {
        this.idTipoAvion = idTipoAvion;
        this.mondelo = mondelo;
        this.cantidadAsientos = cantidadAsientos;
        this.cantidadFilas = cantidadFilas;
        this.cantidadColumnas = cantidadColumnas;
    }

    public String getIdTipoAvion() {
        return idTipoAvion;
    }

    public void setIdTipoAvion(String idTipoAvion) {
        this.idTipoAvion = idTipoAvion;
    }

    public String getMondelo() {
        return mondelo;
    }

    public void setMondelo(String mondelo) {
        this.mondelo = mondelo;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public int getCantidadFilas() {
        return cantidadFilas;
    }

    public void setCantidadFilas(int cantidadFilas) {
        this.cantidadFilas = cantidadFilas;
    }

    public int getCantidadColumnas() {
        return cantidadColumnas;
    }

    public void setCantidadColumnas(int cantidadColumnas) {
        this.cantidadColumnas = cantidadColumnas;
    }

    public List<Avion> getAvionList() {
        return avionList;
    }

    public void setAvionList(List<Avion> avionList) {
        this.avionList = avionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoAvion != null ? idTipoAvion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoavion)) {
            return false;
        }
        Tipoavion other = (Tipoavion) object;
        if ((this.idTipoAvion == null && other.idTipoAvion != null) || (this.idTipoAvion != null && !this.idTipoAvion.equals(other.idTipoAvion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "logica.Tipoavion[ idTipoAvion=" + idTipoAvion + " ]";
    }
    
}

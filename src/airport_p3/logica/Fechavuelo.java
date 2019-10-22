/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport_p3.logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Kevin Flores
 */
@Entity
@Table(name = "fechavuelo")
@NamedQueries({
    @NamedQuery(name = "Fechavuelo.findAll", query = "SELECT f FROM Fechavuelo f")})
public class Fechavuelo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idFechaVuelo")
    private String idFechaVuelo;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "disponibles")
    private int disponibles;
    @Basic(optional = false)
    @Column(name = "precio")
    private double precio;
    @JoinColumn(name = "vuelo", referencedColumnName = "idVuelo")
    @ManyToOne(optional = false)
    private Vuelo vuelo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fechavuelo")
    private List<Reserva> reservaList;

    public Fechavuelo() {
    }

    public Fechavuelo(String idFechaVuelo) {
        this.idFechaVuelo = idFechaVuelo;
    }

    public Fechavuelo(String idFechaVuelo, Date fecha, int disponibles, double precio) {
        this.idFechaVuelo = idFechaVuelo;
        this.fecha = fecha;
        this.disponibles = disponibles;
        this.precio = precio;
    }

    public String getIdFechaVuelo() {
        return idFechaVuelo;
    }

    public void setIdFechaVuelo(String idFechaVuelo) {
        this.idFechaVuelo = idFechaVuelo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(int disponibles) {
        this.disponibles = disponibles;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public List<Reserva> getReservaList() {
        return reservaList;
    }

    public void setReservaList(List<Reserva> reservaList) {
        this.reservaList = reservaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFechaVuelo != null ? idFechaVuelo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fechavuelo)) {
            return false;
        }
        Fechavuelo other = (Fechavuelo) object;
        if ((this.idFechaVuelo == null && other.idFechaVuelo != null) || (this.idFechaVuelo != null && !this.idFechaVuelo.equals(other.idFechaVuelo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "logica.Fechavuelo[ idFechaVuelo=" + idFechaVuelo + " ]";
    }
    
}

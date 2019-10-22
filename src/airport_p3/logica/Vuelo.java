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
@Table(name = "vuelo")
@NamedQueries({
    @NamedQuery(name = "Vuelo.findAll", query = "SELECT v FROM Vuelo v")})
public class Vuelo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idVuelo")
    private String idVuelo;
    @Basic(optional = false)
    @Column(name = "dia")
    private String dia;
    @Basic(optional = false)
    @Column(name = "hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @Basic(optional = false)
    @Column(name = "duracion")
    @Temporal(TemporalType.TIME)
    private Date duracion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vuelo")
    private List<Fechavuelo> fechavueloList;
    @JoinColumn(name = "avion", referencedColumnName = "idAvion")
    @ManyToOne(optional = false)
    private Avion avion;
    @JoinColumn(name = "destino", referencedColumnName = "idCiudad")
    @ManyToOne(optional = false)
    private Ciudad ciudad;
    @JoinColumn(name = "origen", referencedColumnName = "idCiudad")
    @ManyToOne(optional = false)
    private Ciudad ciudad1;

    public Vuelo() {
    }

    public Vuelo(String idVuelo) {
        this.idVuelo = idVuelo;
    }

    public Vuelo(String idVuelo, String dia, Date hora, Date duracion) {
        this.idVuelo = idVuelo;
        this.dia = dia;
        this.hora = hora;
        this.duracion = duracion;
    }

    public String getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(String idVuelo) {
        this.idVuelo = idVuelo;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Date getDuracion() {
        return duracion;
    }

    public void setDuracion(Date duracion) {
        this.duracion = duracion;
    }

    public List<Fechavuelo> getFechavueloList() {
        return fechavueloList;
    }

    public void setFechavueloList(List<Fechavuelo> fechavueloList) {
        this.fechavueloList = fechavueloList;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Ciudad getCiudad1() {
        return ciudad1;
    }

    public void setCiudad1(Ciudad ciudad1) {
        this.ciudad1 = ciudad1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVuelo != null ? idVuelo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vuelo)) {
            return false;
        }
        Vuelo other = (Vuelo) object;
        if ((this.idVuelo == null && other.idVuelo != null) || (this.idVuelo != null && !this.idVuelo.equals(other.idVuelo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "logica.Vuelo[ idVuelo=" + idVuelo + " ]";
    }
    
}
